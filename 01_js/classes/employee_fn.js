function Employee(name = 'desconhecido', age = 18, position = 'desconhecido', salary = '2000') {
    if (name == undefined || age == undefined || position == undefined || salary == undefined) {
        throw new Error('Dados não informados');
    }

    this.set(name, age, position, salary);

    this.set = function (name, age, position, salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    this.showData = function () {
        return `Nome: ${this.name}\nIdade: ${this.age}\nCargo: ${this.position}\nSalário: ${this.salary}`;
    }
}