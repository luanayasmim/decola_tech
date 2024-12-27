let data = require('./data/dataList');

let courseList = data.courses;

//Gerar uma nova lista de cursos com base na original
let newList = courseList.map((element, index) => {
    return {
        key: index + 1,
        course: `${element.description} ${element.ch}`,
        active: element.status ? 'yes' : 'no'
    }
});

console.log(newList);