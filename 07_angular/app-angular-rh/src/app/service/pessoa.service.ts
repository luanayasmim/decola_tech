import { Injectable } from '@angular/core';
import { Pessoa } from '../classes/pessoa';

@Injectable({
  providedIn: 'root'
})
export class PessoaService {

  constructor() { }

  public listarPessoas(): Pessoa[] {
    return [
      { nome: "Luana", idade: 21 },
      { nome: "Yasmim", idade: 21 },
      { nome: "Fernanda", idade: 48 },
      { nome: "José", idade: 70 },
      { nome: "Miguel", idade: 68 },
    ]
  }
}
