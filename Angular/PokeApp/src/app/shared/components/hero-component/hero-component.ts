import { Component, EventEmitter, input, Output, output } from '@angular/core';
import { DecimalPipe, PercentPipe, UpperCasePipe } from '@angular/common';

@Component({
  selector: 'app-hero-component',
  imports: [UpperCasePipe],
  templateUrl: './hero-component.html',
})
export class HeroComponent {
  public name = input.required<string>();
  public age = input.required<number>();
  public heroDescription = output<void>();
  public heroChange = output<void>();
  public heroReset = output<void>();

  constructor() {}
}
