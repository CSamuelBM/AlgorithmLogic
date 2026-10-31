import { Component, signal } from '@angular/core';
import {
  InvertirPalabraComponent
} from '../../shared/components/invertir-palabra-component/invertir-palabra-component';

@Component({
  selector: 'invertir-palabra-page',
  templateUrl: 'invertir-palabra-page.html',
  imports: [InvertirPalabraComponent],
})
export class InvertirPalabraPage {
  public text;

  constructor() {
    this.text = signal('');
  }

  public textReverse(textOriginal: string) {
    let textList = textOriginal.split('');
    this.text.set(textList.reverse().join(''));
  }
}
