import React, { useEffect, useState } from 'react'
import { Container, Input } from 'reactstrap';
import axios from 'axios'
export default function Weather() {
    const [data , setData] = useState(null)
    const [err , setErr]= useState(null)
    const [text,setText] = useState("Ho Chi Minh")
    const[city, setCity] = useState("Ho Chi Minh")
    const apikey = "b00607a901c29be967375da3f92d5d55"
    const url =`https://api.openweathermap.org/data/2.5/weather?q=${city}&units=metric&appid=${apikey}`
    const fectchData = () => {
        axios.get(url)
        .then(function(res){
            console.log(res)
            setData(res.data)
            setErr(null)
        })
        .catch(function(err){
            console.log(err)
            if(err.response.status=='404'){
                setData(null)
                setErr("invalid city name")
            }
    })
    }
    const getTime=(value)=>{
        let d = new Date(value*1000)
        return d.toLocaleString();
    }
    useEffect(()=>{
        fectchData();
    },[city])
    return (
    <div>
        <Container>
        <Input type="text" value={text} onChange={(e)=> setText(e.target.value)} 
        onKeyDown={(e)=>{
            if(e.key === 'Enter'){
                setCity(text)
                setText('')
            }
        }} />
        
          {err && ( // Conditionally render error message
           <h1>{err}</h1>
          )}
        
        {
            data && 
            <>  
                <h1>Quốc gia : {data.sys.country}</h1>
                <h1>Thành phố: {data.name}</h1>
                <h1>Nhiệt độ: {data.main.temp} Độ C</h1>
                <img src={`http://openweathermap.org/img/w/${data.weather[0].icon}.png`}></img>
                <h1>Sunset: {getTime(data.sys.sunset)}</h1>
                <h1>Sunrise: {getTime(data.sys.sunrise)}</h1>
            </>
        }
        </Container>
        
    </div>
  )
}
