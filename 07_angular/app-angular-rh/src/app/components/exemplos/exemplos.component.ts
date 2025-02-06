import { Component } from '@angular/core';
import { Exemplo01Component } from './exemplo01/exemplo01.component';
import { Exemplo02Component } from "./exemplo02/exemplo02.component";
import { Exemplo03Component } from "./exemplo03/exemplo03.component";

@Component({
  selector: 'app-exemplos',
  imports: [Exemplo01Component, Exemplo02Component, Exemplo03Component],
  templateUrl: './exemplos.component.html',
  styleUrl: './exemplos.component.css'
})
export class ExemplosComponent {

}
