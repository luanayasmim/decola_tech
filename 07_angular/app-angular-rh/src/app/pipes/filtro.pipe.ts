import { Pipe, PipeTransform } from '@angular/core';
import { Pessoa } from '../classes/pessoa';

@Pipe({
  name: 'filtro'
})
export class FiltroPipe implements PipeTransform {

  transform(value: Pessoa[], input: string): Pessoa[] {
    return !input ? value : value.filter(p => p.nome.toLowerCase().includes(input.toLowerCase()));
  }

}
