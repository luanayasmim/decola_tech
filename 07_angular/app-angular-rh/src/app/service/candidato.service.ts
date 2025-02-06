import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Candidato } from '../classes/candidato';
import { Resposta } from '../classes/resposta';

@Injectable({
  providedIn: 'root'
})
export class CandidatoService {

  constructor(private http: HttpClient) { }

  baseUrl: string = "http://localhost:8080/candidatos";

  public getCandidatosApi(): Observable<Candidato[]> {
    const url: string = "lista";
    return this.http.get<Candidato[]>(`${this.baseUrl}/${url}`);
  }

  public getCandidatoApi(cpf: string): Observable<Candidato> {
    const url = `buscar/${cpf}`;
    return this.http.get<Candidato>(`${this.baseUrl}/${url}`);
  }

  public postCandidatoApi(candidato: Candidato): Observable<Candidato> {
    const url: string = "novo";
    return this.http.post<Candidato>(`${this.baseUrl}/${url}`, candidato);
  }

  public putCandidatoApi(candidato: Candidato, cpf: string): Observable<Candidato> {
    const url = `alterar/${cpf}`;
    return this.http.put<Candidato>(`${this.baseUrl}/${url}`, candidato);
  }

  public deleteCandidatoApi(cpf: string): Observable<Resposta> {
    const url = `apagar/${cpf}`;
    return this.http.delete<Resposta>(`${this.baseUrl}/${url}`);
  }

}
