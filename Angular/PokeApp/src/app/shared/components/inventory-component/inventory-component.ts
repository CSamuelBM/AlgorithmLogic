import { Component, EventEmitter, input, Output, output } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-inventory-component',
  imports: [FormsModule],
  templateUrl: './inventory-component.html',
})
export class InventoryComponent {
  public num = input.required<number>();
  public incrementNum = output<void>();
  public previousNum = output<void>();
  public decrementNum = output<void>();
  public cleareNum = output<void>();

  constructor() {}
}
