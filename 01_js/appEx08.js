let data = require('./data/dataList');

let courseList = data.courses;

let coursesActives = courseList.filter(course => course.status);
console.log(coursesActives);

let coursesLongTime = courseList.filter(course => course.ch > 3000);
console.log(coursesLongTime);

let coursesLongTimeActives = coursesLongTime.filter(course => course.status);
console.log(coursesLongTimeActives);