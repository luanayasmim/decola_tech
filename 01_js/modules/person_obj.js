let person = {
    //Quando se usa arrow function ele vê o modulo e não o objeto
    //Já a função anônima usa o escopo do objeto
    set: function (name, age) {
        this.name = name; // Ao anexar uma propriedade ao objeto deve-se atribuir um valor
        this.age = age; // person.protorype.age
    },
    isLegalAge: function () {
        return this.age >= 18
    },
    get: function () {
        let status = this.isLegalAge() ? "Maior de idade" : "Menor de idade";
        return `Nome: ${this.name}\nIdade: ${this.age}\n${status}`;
    }
};

module.exports = person;