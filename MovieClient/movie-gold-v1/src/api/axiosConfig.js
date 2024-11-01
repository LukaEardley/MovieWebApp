import axios from 'axios';

export default axios.create({
    baseURL: 'https://9c96-103-106-239-104.ap.ngrok.io/', //Ngrok URL to open locl server to public
    headers: { "ngrok-skip-browser-warning": "true" } //CORS blocker

});