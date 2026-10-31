import { Component, input, output } from '@angular/core';

@Component({
  selector: 'app-color-component',
  imports: [],
  templateUrl: './color-component.html',
})
export class ColorComponent {
  public color = input.required<string>();
  public generateHexColor = output<void>();
}
