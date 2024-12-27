async function getCep(cep) {
    let url = `https://viacep.com.br/ws/${cep}/json/`;
    const response = await fetch(url);
    const json = await response.json();

    return json;
}

async function execute() {
    console.log('antes');
    let result = await getCep('01311100');
    console.log(result);
    console.log('depois');
}

execute();