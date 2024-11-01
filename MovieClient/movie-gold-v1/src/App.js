import React, { useEffect, useState } from 'react';
import './App.css';
import api from './api/axiosConfig';

function App() {
  const [movies, setMovies] = useState([]);//Destruct Array

  const getMovies = async () => { //Async functionality to enusre UI is not blocked
    try {
      const response = await api.get("/api/v1/movies");
      console.log(response.data);
      setMovies(response.data);
    } catch (error) {
      console.log(error);
    }

  }

  useEffect(() => {
    getMovies();
  }, []);//Empty array to ensure useEffect runs only once


  return (
    <div className="App">

    </div>
  );
}

export default App;
