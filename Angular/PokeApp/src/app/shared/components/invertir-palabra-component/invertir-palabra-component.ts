import { Component, EventEmitter, input, Output } from '@angular/core';

@Component({
  selector: 'app-invertir-palabra-component',
  templateUrl: 'invertir-palabra-component.html',
})
export class InvertirPalabraComponent {
  @Output() textOriginal = new EventEmitter<string>();
  public textReverse = input.required<string>();
}
