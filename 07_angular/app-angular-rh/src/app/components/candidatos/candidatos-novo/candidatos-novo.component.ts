import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Candidato } from '../../../classes/candidato';
import { FormsModule } from '@angular/forms';
import { CandidatoService } from '../../../service/candidato.service';

@Component({
  selector: 'app-candidatos-novo',
  imports: [FormsModule],
  templateUrl: './candidatos-novo.component.html',
  styleUrl: './candidatos-novo.component.css'
})
export class CandidatosNovoComponent {

  candidato: Candidato = new Candidato();

  constructor(
    private router: Router,
    private candidatoService: CandidatoService
  ) { }

  fechar(): void {
    this.router.navigate(["/candidatos"]);
  }

  mostrar(): void {
    window.alert(this.candidato.mostrar());
  }

  incluir(candidato: Candidato): void {
    this.candidatoService.postCandidatoApi(candidato)
      .subscribe({
        complete: () => this.fechar(),
        error: erro => {
          console.error(erro);
          window.alert(erro);
        }
      });
  }

  //two-way data binding
}
