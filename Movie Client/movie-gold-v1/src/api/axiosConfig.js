import axios from 'axios';

export default axios.create({
    baseURL: "https://ada4-197-91-181-21.ngrok-free.app", //API Endpoint
    headers: { "ngrok-skip-browser-warning": "true" },
}); 