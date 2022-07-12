// const axios = require('axios');

const path = 'https://petstore.swagger.io/v2/pet/findByStatus?status=available';
let petNumber = document.querySelector('#petNumber');


axios.get(path)
    .then(response => {
        var result = response.data;
        petNumber.textContent = result.length;

    });