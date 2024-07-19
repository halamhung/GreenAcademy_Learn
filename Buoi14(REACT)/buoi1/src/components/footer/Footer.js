import "./footer.css"
function Footer(props){
    const x =5;
    const {name1, age1}= props;
    const arr=[{name:"Lâm hùng",age:23},{name:"Lê minh",age:25},{name:"Dương sinh",age:27}]
    return(
        <>
            <div className="footer" id="footer1">
                Footer1
                <h1>X= {x}</h1>
                <h1>Tên: {name1} + Đây là props từ bên ngoài truyền vào</h1>
            </div>
            <div>
                <div className="footer">
                    Footer2
                    <h2>Tên trong mảng :{name1}</h2>
                    <h2>Tuổi trong mảng: {age1}</h2>
                    {
            arr &&
              arr.map((item, index) => (
                <p key={index}>{item.name} và tuổi là {item.age}</p> 
              ))
          }
              <button onClick={() => alert('Bạn đã nhấp vào nút')}>Nhấp vào đây</button>

                </div>
            </div>
        </>
    )
}
export default Footer