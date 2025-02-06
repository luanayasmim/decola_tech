import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { InscricaoService } from '../../../service/inscricao.service';
import { InscricoesCandidato } from '../../../classes/inscricoes-candidato';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-lista-inscricoes',
  imports: [CommonModule],
  templateUrl: './lista-inscricoes.component.html',
  styleUrl: './lista-inscricoes.component.css'
})
export class ListaInscricoesComponent implements OnInit {

  lista: InscricoesCandidato[] = [];

  constructor(
    private route: ActivatedRoute,
    private inscricaoService: InscricaoService
  ) { }

  ngOnInit(): void {
    const cpf = this.route.snapshot.paramMap.get('id') as string;

    this.inscricaoService.listarInscricoesApi(cpf)
      .subscribe(res => this.lista = res);
  }
}
