import { Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { CandidatosComponent } from './components/candidatos/candidatos.component';
import { ExemplosComponent } from './components/exemplos/exemplos.component';
import { Error404Component } from './components/errors/error404/error404.component';
import { CandidatosNovoComponent } from './components/candidatos/candidatos-novo/candidatos-novo.component';
import { CandidatoAlteracaoComponent } from './components/candidatos/candidato-alteracao/candidato-alteracao.component';
import { CandidatoRemocaoComponent } from './components/candidatos/candidato-remocao/candidato-remocao.component';
import { InscricaoComponent } from './components/inscricao/inscricao.component';
import { ListaInscricoesComponent } from './components/inscricao/lista-inscricoes/lista-inscricoes.component';

export const routes: Routes = [
    { path: '', redirectTo: 'home', pathMatch: 'full' },
    { path: 'home', component: HomeComponent },
    { path: 'exemplos', component: ExemplosComponent },
    { path: 'candidatos', component: CandidatosComponent },
    { path: 'candidatos/novo', component: CandidatosNovoComponent },
    { path: 'candidatos/alteracao/:id', component: CandidatoAlteracaoComponent },
    { path: 'candidatos/remocao/:id', component: CandidatoRemocaoComponent },
    { path: 'inscricoes', component: InscricaoComponent },
    { path: 'inscricoes/candidato/:id', component: ListaInscricoesComponent },
    { path: '**', component: Error404Component }
];
