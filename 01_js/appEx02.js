let calculateTax = require('./functions/tax');

let irpf = calculateTax(6435.20);
console.log(irpf.toFixed(2)); //todo resultado de formatação é convertido para string