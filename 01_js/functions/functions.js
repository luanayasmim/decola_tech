// forma tradicional
function calculateSum(x, y) {
    // x = parseFloat(x);
    // y = parseFloat(y);

    if (typeof (x) != "number") throw new Error("O parâmetro x deve ser númerico");
    if (typeof (y) != "number") throw new Error("O parâmetro y deve ser númerico");

    return x + y;
}

//Função anônima
let greaterValue = function (x, y) {
    // if (x > y) return x;
    // else return y;

    // if ternário
    return x > y ? x : y;
}

//Arrow function com operador ternário
let smallerValue = (x, y) => x < y ? x : y;

//Arrow function
// É uma simplificação da função anônima
// o nome de uma função é um ponteiro para uma função
// toda a função fica armazenada na memória stack
let calculateSubtraction = (x, y) => x - y;


module.exports = { calculateSum, greaterValue, smallerValue, calculateSubtraction };
