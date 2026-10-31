import { Component, input, signal } from '@angular/core';
import { InventoryComponent } from '../../shared/components/inventory-component/inventory-component';
import { GENERAL } from '../../shared/constants/general.constant';

@Component({
  selector: 'app-inventory-page',
  imports: [InventoryComponent],
  templateUrl: './inventory-page.html',
})
export class InventoryPage {
  public num;
  private valueA = 0;
  private valueB = 1;
  public title = GENERAL.TITLE_INVENTORY;

  constructor() {
    this.num = signal(0);
  }

  public incrementNum(): void {
    this.num.update((value) => {
      if (this.num() >= 0) return this.fibonacci();
      else return value + 1;
    });
  }

  public previousNum(): void {
    let num = this.num();
    this.num.update((value) => {
      if (num > 0) return this.previousFibonacci();
      return value;
    });
  }

  public decrementNum(): void {
    this.num.update((value) => value - 1);
  }

  public cleareNum(): void {
    if (this.num() != 0)
      this.num.update((value) => {
        return ((this.valueA = 1), (this.valueB = 0));
      });
  }

  private fibonacci(): number {
    const valueC = this.valueA + this.valueB;
    this.valueA = this.valueB;
    this.valueB = valueC;

    return this.valueA;
  }

  private previousFibonacci(): number {
    const valueC = this.valueA;

    this.valueA = this.valueB - valueC;
    this.valueB = valueC;

    return this.valueA;
  }
}
