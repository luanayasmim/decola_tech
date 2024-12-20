// declarando variáveis

console.log(curso);
var curso = "Javascript";   // var: possui uma visibilidade global
var curso = "Desenvolvimento web";

let nome = 'Luana';  //let: possui uma visibilidade apenas no escopo
nome = "Yasmim"

console.log("Hello World!");
console.log(curso, ' - ', typeof (curso));
console.log(nome, ' - ', typeof (nome));


let ch = 186;
let st = true;

let verifica = (ch > 100);
if (ch > 100) { }
if (verifica) { }

console.log(ch, ' - ', typeof (ch));
console.log(st, ' - ', typeof (st)); // ctrl + d para selecionar a mesma palavra várias vezes
console.log(verifica, ' - ', typeof (verifica));

//lista
let lista = ['Mamão', 'Melância', 'Caqui', 20, false];
let objeto = {
    descricao: 'Avanade',
    cidade: 'Itapecerica da Serra',
    ano: 2024,
    fincionarios: ['Luana'],
};

console.log(lista, ' - ', typeof(lista));
console.log(objeto, ' - ', typeof(objeto));

//json  - javascript object notation

let empresaJson = JSON.stringify(objeto);
console.log(empresaJson);