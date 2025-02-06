import { Component, OnInit } from '@angular/core';
import { Pessoa } from '../../../classes/pessoa';
import { PessoaService } from '../../../service/pessoa.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-exemplo02',
  imports: [CommonModule],
  templateUrl: './exemplo02.component.html',
  styleUrl: './exemplo02.component.css'
})
export class Exemplo02Component implements OnInit {
  pessoas: Pessoa[] = [];
  nome!: string;

  constructor(private service: PessoaService) { }

  ngOnInit(): void {
    this.listar();
  }

  listar(): void {
    this.pessoas = this.service.listarPessoas();
  }

  mostrar(nome: string): void {
    this.nome = nome;
  }
}
