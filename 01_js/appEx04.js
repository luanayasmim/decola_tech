let app = require('./modules/person_obj_fn');

let person = app();

person.set("Yasmim", 17);
console.log(person.get());