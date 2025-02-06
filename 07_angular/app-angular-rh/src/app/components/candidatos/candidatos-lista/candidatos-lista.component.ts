import { Component, OnInit } from '@angular/core';
import { CandidatoService } from '../../../service/candidato.service';
import { Candidato } from '../../../classes/candidato';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-candidatos-lista',
  imports: [CommonModule, RouterLink],
  templateUrl: './candidatos-lista.component.html',
  styleUrl: './candidatos-lista.component.css'
})
export class CandidatosListaComponent implements OnInit {

  candidatos: Candidato[] = [];

  constructor(private candidatoService: CandidatoService) { }

  ngOnInit(): void {
    this.candidatoService
      .getCandidatosApi()
      .subscribe(response => this.candidatos = response);
  }

}
