import { Component, OnInit } from '@angular/core';
import { Cargo } from '../../classes/cargo';
import { Router } from '@angular/router';
import { CargosService } from '../../service/cargos.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Candidato } from '../../classes/candidato';
import { CandidatoService } from '../../service/candidato.service';
import { Inscricao } from '../../classes/inscricao';
import { InscricaoService } from '../../service/inscricao.service';

@Component({
  selector: 'app-inscricao',
  imports: [FormsModule, CommonModule],
  templateUrl: './inscricao.component.html',
  styleUrl: './inscricao.component.css'
})
export class InscricaoComponent implements OnInit {

  cargos: Cargo[] = [];
  candidatos: Candidato[] = [];
  inscricao: Inscricao = new Inscricao();
  sucesso: string = "";
  erro: string = "";

  constructor(
    private router: Router,
    private cargosService: CargosService,
    private candidatoService: CandidatoService,
    private inscricaoService: InscricaoService
  ) { }

  ngOnInit(): void {
    this.listarCargos();
    this.listarCandidatos();
  }

  listarCargos(): void {
    this.cargosService.getCargosApi()
      .subscribe(response => this.cargos = response);
  }

  listarCandidatos(): void {
    this.candidatoService.getCandidatosApi()
      .subscribe(response => this.candidatos = response);
  }

  incluir(): void {
    this.inscricaoService.efetuarInscricaoApi(this.inscricao);

  }
}