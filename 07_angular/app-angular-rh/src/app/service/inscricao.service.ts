import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Inscricao } from '../classes/inscricao';
import { Observable } from 'rxjs';
import { Resposta } from '../classes/resposta';
import { InscricoesCandidato } from '../classes/inscricoes-candidato';

@Injectable({
  providedIn: 'root'
})
export class InscricaoService {

  constructor(
    private http: HttpClient
  ) { }

  baseUrl = "http://localhost:8080/inscricoes";

  public efetuarInscricaoApi(inscricao: Inscricao): Observable<Resposta> {
    const novo = "novo";
    return this.http.post<Resposta>(`${this.baseUrl}/${novo}`, inscricao);
  }

  public listarInscricoesApi(cpf: string): Observable<InscricoesCandidato[]> {
    const candidatos = `candidatos/${cpf}`;
    return this.http.get<InscricoesCandidato[]>(`${this.baseUrl}/${candidatos}`);
  }
}
