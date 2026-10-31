import { Component, EventEmitter, input, Output } from '@angular/core';

@Component({
  selector: 'app-sum-component',
  templateUrl: './sum-component.html',
})
export class SumComponent {
  @Output() number1 = new EventEmitter<string>();
  @Output() number2 = new EventEmitter<string>();
  public sum = input.required<number>();
}
