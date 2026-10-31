import { Component, EventEmitter, input, Output } from '@angular/core';
import { DecimalPipe } from '@angular/common';

@Component({
  selector: 'app-temperature-component',
  imports: [DecimalPipe],
  templateUrl: './temperature-component.html',
})
export class TemperatureComponent {
  public valueC = input.required<number>();
  public valueF = input.required<number>();
  @Output() celsius = new EventEmitter<string>();
  @Output() fahrenheit = new EventEmitter<string>();
}
