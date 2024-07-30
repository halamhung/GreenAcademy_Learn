import React, { useEffect, useState, useRef } from 'react'
import "./Quayso.css"
export default function Quayso() {
    const [items, setItems] = useState([
        'Giải nhất',
        'Giải nhì',
        'Giải ba',
        'Giải khuyến khích',
        // ... thêm các mục khác
      ]);
      const [players, setPlayers] = useState([
        { name: 'Người chơi 1' },
        { name: 'Người chơi 2' },
        // ... thêm người chơi khác
      ]);
      
      const [results, setResults] = useState({});
      const [newPlayerName, setNewPlayerName] = useState('');
      const [currentPlayerIndex, setCurrentPlayerIndex] = useState(0);
      const [isSpinning, setIsSpinning] = useState(false);
      const wheelRef = useRef(null);
    
      useEffect(() => {
        if (currentPlayerIndex >= players.length) {
          // Kết thúc vòng quay khi tất cả người chơi đã quay
          setIsSpinning(false);
          return;
        }
      }, [currentPlayerIndex, players.length]);
    
      const spinWheel = () => {
        const randomIndex = Math.floor(Math.random() * items.length);
        const selectedItem = items[randomIndex];
        setResults(prevResults => ({
          ...prevResults,
          [players[currentPlayerIndex].name]: selectedItem,
        }));
        setItems(prevItems => prevItems.filter((_, index) => index !== randomIndex));
        setCurrentPlayerIndex(prevIndex => prevIndex + 1);
        setIsSpinning(true);
    
        // Logic để quay vòng quay (sử dụng CSS transitions/animations)
        const rotationDegrees = 360 * 5 + randomIndex * (360 / items.length); // Quay 5 vòng + góc ngẫu nhiên
        wheelRef.current.style.transition = 'transform 4s ease-out'; // Thời gian quay 4 giây
        wheelRef.current.style.transform = `rotate(${rotationDegrees}deg)`;
        const handleAddPlayer = () => {
            if (newPlayerName.trim() !== '') {
              setPlayers(prevPlayers => [...prevPlayers, { name: newPlayerName }]);
              setNewPlayerName('');
            }
        }
      };
    return (
    <div>
        <div className={`wheel ${isSpinning ? 'spinning' : ''}`} ref={wheelRef}>
        {items.map((item, index) => (
          <div className="wheel-item" key={index}>
            {item}
          </div>
        ))}
      </div>
      <button onClick={spinWheel} disabled={isSpinning || currentPlayerIndex >= players.length}>
        Quay
      </button>
      <div>
        <h3>Kết quả:</h3>
        <ul>
          {Object.entries(results).map(([player, item]) => (
            <li key={player}>{player}: {item}</li>
          ))}
        </ul>
      </div>
      
    </div>
  )
}
