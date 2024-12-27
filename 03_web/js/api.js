async function getAddress(cep) {
    let url = `https://viacep.com.br/ws/${cep}/json/`;
    const response = await fetch(url);
    const json = await response.json();

    return {
        logradouro: json.logradouro,
        neighborhood: json.bairro,
        city: json.localidade,
    }
}

function execute() {
    document.getElementById('btn_submit').addEventListener('click', async function () {
        let cep = document.getElementById('cep').value;
        let response = await getAddress(cep);

        document.getElementById('logradouro').value = response.logradouro;
        document.getElementById('neighborhood').value = response.neighborhood;
        document.getElementById('city').value = response.city;
    });
};

execute();