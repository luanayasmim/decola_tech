import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CandidatoService } from '../../../service/candidato.service';
import { Candidato } from '../../../classes/candidato';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-candidato-remocao',
  imports: [CommonModule],
  templateUrl: './candidato-remocao.component.html',
  styleUrl: './candidato-remocao.component.css'
})
export class CandidatoRemocaoComponent implements OnInit {
  candidato: Candidato = new Candidato();
  cpf!: string;
  err: string = "";

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private service: CandidatoService
  ) { }

  ngOnInit(): void {
    this.cpf = this.route.snapshot.paramMap.get('id') as string;
    this.service.getCandidatoApi(this.cpf)
      .subscribe(response => this.candidato = response);
  }

  fechar(): void {
    this.router.navigate(['/candidatos']);
  }

  remover(): void {
    this.service.deleteCandidatoApi(this.cpf)
      .subscribe({
        next: resp => this.err = resp.mensagem,
        complete: () => this.fechar(),
        error: e => this.err = e,
      });
  }

}
