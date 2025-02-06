import { Component, OnInit } from '@angular/core';
import { PessoaService } from '../../../service/pessoa.service';
import { Pessoa } from '../../../classes/pessoa';
import { CommonModule } from '@angular/common';
import { TamanhoPipe } from '../../../pipes/tamanho.pipe';
import { FiltroPipe } from '../../../pipes/filtro.pipe';

@Component({
  selector: 'app-exemplo03',
  imports: [CommonModule, TamanhoPipe, FiltroPipe],
  templateUrl: './exemplo03.component.html',
  styleUrl: './exemplo03.component.css'
})
export class Exemplo03Component implements OnInit {
  pessoas: Pessoa[] = [];

  constructor(private service: PessoaService) { }

  ngOnInit(): void {
    this.listar();
  }

  listar(): void {
    this.pessoas = this.service.listarPessoas();
  }
}