import { Component, signal } from '@angular/core';
import { ColorComponent } from '../../shared/components/color-component/color-component';
import { InventoryComponent } from '../../shared/components/inventory-component/inventory-component';

@Component({
  selector: 'app-color-page',
  imports: [ColorComponent],
  templateUrl: './color-page.html',
})
export class ColorPage {
  public color;
  private colors: string[] = [];

  constructor() {
    this.color = signal('');
  }

  public generateHexColor(): void {
    let num = (Math.floor(Math.random() * 4) * 4).toString(16);
    let letters = ['0', 'F', num];
    let hex = '#';

    for (let i = 0; i < 3; i++) {
      let pos = Math.floor(Math.random() * letters.length);
      hex += letters[pos];
      letters.splice(pos, 1);
    }

    this.color.set(hex);

    if (this.colors.includes(this.color())) return this.generateHexColor();
    else this.colors.push(this.color());
  }
}
