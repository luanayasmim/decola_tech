let data = require('./data/dataList');

//filter
let list1 = data.names.filter(function (name) { return name.endsWith('a') }); // função callback
list1 = data.names.filter(name => name.endsWith('a')); // função callback - linq
console.log(list1);

let list3 = data.names.filter(name => name.length <= 4);
console.log(list3);

let list4 = data.names.filter(name => name.toUpperCase().includes('R')); // includes = contains
console.log(list4);

//map - mapeamento dos dados para gerar uma nova representação
console.log(data.names);

let map1 = data.names.map((element, index) => { return `${index} - ${element}` });
map1 = data.names.map((element, index) => `${index} - ${element}`);
console.log(map1);