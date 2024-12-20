let calculateDays = require('./functions/remainingDays');

// obtendo os parâmetros de entrada
let day = process.argv[2];
let month = process.argv[3];
let year = process.argv[4];

let remainingDays = calculateDays(day, month, year);

console.log(remainingDays);