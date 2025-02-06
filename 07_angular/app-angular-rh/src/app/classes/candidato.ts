export class Candidato {
    constructor(
        public cpf: string = '',
        public nome: string = '',
        public telefone: string = '',
        public email: string = ''
    ) { }

    public mostrar(): string {
        return `Cpf: ${this.cpf}\nNome: ${this.nome}\nTelefone: ${this.telefone}\nEmail:${this.email}`
    }
}
