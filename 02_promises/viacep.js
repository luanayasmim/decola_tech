let cep = '01311100';
let url = `https://viacep.com.br/ws/${cep}/json/`;

fetch(url)
    .then(response/*fluxo de bytes*/ => response.json() /*conversão pra json*/)
    .then(response => {
        console.log(response.logradouro);
    });