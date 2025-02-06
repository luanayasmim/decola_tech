import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CandidatoService } from '../../../service/candidato.service';
import { Candidato } from '../../../classes/candidato';

@Component({
  selector: 'app-candidato-alteracao',
  imports: [FormsModule],
  templateUrl: './candidato-alteracao.component.html',
  styleUrl: './candidato-alteracao.component.css'
})
export class CandidatoAlteracaoComponent implements OnInit {

  cpf!: string;
  candidato: Candidato = new Candidato();

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
    this.router.navigate(["/candidatos"]);
  }

  alterar(candidato: Candidato): void {
    this.service.putCandidatoApi(candidato, this.cpf).subscribe(() => this.fechar());
  }
}
