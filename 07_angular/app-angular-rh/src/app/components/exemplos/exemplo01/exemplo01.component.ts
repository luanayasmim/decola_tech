import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-exemplo01',
  imports: [],
  templateUrl: './exemplo01.component.html',
  styleUrl: './exemplo01.component.css'
})
export class Exemplo01Component implements OnInit {

  /*
    Binding unidirecional - vínculo
      - Propertity Binding: classe -> view 
      - Event Binding: view -> classe
  */

  random!: number;

  ngOnInit(): void {
    this.gerarNumero();
  }

  gerarNumero(): void {
    this.random = Math.random();
  }
}
