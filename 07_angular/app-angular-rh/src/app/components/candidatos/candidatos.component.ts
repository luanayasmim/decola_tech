import { Component } from '@angular/core';
import { CandidatosListaComponent } from "./candidatos-lista/candidatos-lista.component";
import { Router } from '@angular/router';

@Component({
  selector: 'app-candidatos',
  imports: [CandidatosListaComponent],
  templateUrl: './candidatos.component.html',
  styleUrl: './candidatos.component.css'
})
export class CandidatosComponent {
  constructor(private router: Router) { }

  novoCandidato(): void {
    this.router.navigate(['/candidatos/novo']);
  }
}
