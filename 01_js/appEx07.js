let data = require('./data/dataList');

//Quando atribui um objeto a uma variavel ela se torna uma referência para aquele objeto
//Ou seja company é um ponteiro para data.company e o que for modificado com company irá refletir no objeto
let company = data.company;

console.log(company);

console.log(company.description);

// Quando se trata de objeto é uma referência
let course = data.courses[0];
console.log(course);
console.log(data.courses[0]);

function showCourse(course) {
    console.log(course);
}

showCourse(data.courses[0]);