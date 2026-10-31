import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'idPipe',
})
export class IdPipe implements PipeTransform {
  transform(value: string): string {
    if(value.length == 1)
      return '00' + value;
    if(value.length == 2)
      return '0' + value;
    return value;
  }
}
