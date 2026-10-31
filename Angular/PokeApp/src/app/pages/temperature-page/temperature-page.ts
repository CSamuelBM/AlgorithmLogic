import { Component, signal } from '@angular/core';
import { TemperatureComponent } from '../../shared/components/temperature-component/temperature-component';

@Component({
  selector: 'app-temperature-page',
  imports: [TemperatureComponent],
  templateUrl: './temperature-page.html',
})
export class TemperaturePage {
  public celsius;
  public fahrenheit;

  constructor() {
    this.celsius = signal(0);
    this.fahrenheit = signal(0);
  }

  public degreeCelsius(celsius: string) {
    let degree;

    if (celsius != '') {
      degree = parseFloat(celsius);
      this.celsiusFahrenheit(degree);
    }
  }

  public degreeFahrenheit(fahrenheit: string) {
    let degree;

    if (fahrenheit != '') {
      degree = parseFloat(fahrenheit);
      this.fahrenheitCelsius(degree);
    }
  }

  private celsiusFahrenheit(celsius: number) {
    let fahrenheit = celsius * (9 / 5) + 32;
    this.fahrenheit.set(fahrenheit);
  }

  private fahrenheitCelsius(fahrenheit: number) {
    let celsius = (fahrenheit - 32) * (5 / 9);
    this.celsius.set(celsius);
  }
}
