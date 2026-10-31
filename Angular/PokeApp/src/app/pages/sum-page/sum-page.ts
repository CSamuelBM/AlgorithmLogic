import { Component, signal } from '@angular/core';
import { SumComponent } from '../../shared/components/sum-component/sum-component';

@Component({
  selector: 'app-sum-page',
  templateUrl: './sum-page.html',
  imports: [SumComponent],
})
export class SumPage {
  public suma;
  public number1;
  public number2;

  constructor() {
    this.suma = signal(0);
    this.number1 = signal('');
    this.number2 = signal('');
  }

  public num1(number1: string) {
    this.number1.set(number1);
    this.sum();
  }
  public num2(number2: string) {
    this.number2.set(number2);
    this.sum();
  }

  public sum() {
    let num1 = 0;
    let num2 = 0;

    if (this.number1() != '') num1 = parseFloat(this.number1());

    if (this.number2() != '') num2 = parseFloat(this.number2());

    this.suma.set(num1 + num2);
  }
}
