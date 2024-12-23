// O uso de classes do js faz parte de uma sintaxe conhecida como 'sugar sintax'
//Não existe classe no js, é só um jeito para encapsular a função
class Employee {
    //Função especial, executada no momento em que o objeto da classe é executado
    //Sua execução é implícita
    constructor(name = 'desconhecido', age = 18, position = 'desconhecido', salary = '2000') {
        // this.name = '';
        // this.age = 0;
        // this.position = '';
        // this.salary = 0;
        // this.set('desconhecido', 18, 'desconhecido', 2000);

        if (name == undefined || age == undefined || position == undefined || salary == undefined) {
            throw new Error('Dados não informados');
        }

        this.set(name, age, position, salary);
    }

    set(name, age, position, salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    showData() {
        return `Nome: ${this.name}\nIdade: ${this.age}\nCargo: ${this.position}\nSalário: ${this.salary}`;
    }
}

module.exports = Employee;