function getPromise() {
    return new Promise((resolve, reject) => {
        let numberRandom = Math.random();
        if (numberRandom > 0.5)
            resolve(`valor válido: ${numberRandom}`);
        else
            reject(`valor inválido: ${numberRandom}`);
    });
}

module.exports = getPromise;