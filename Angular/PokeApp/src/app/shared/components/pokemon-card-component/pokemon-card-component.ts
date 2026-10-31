import { Component, input, InputSignal, OnInit, signal } from '@angular/core';
import { FirstCapitalPipe } from '../../pipes/first-capital-pipe/first-capital-pipe';
import { IdPipe } from '../../pipes/id-pipe/id-pipe';
import { ImageErrorDirective } from '../../directives/image-error-directive/image-error-directive';
import { PokemonData } from '../../interfaces/pokemon.interface';
import { PokemonAlertComponent } from '../pokemon-alert-component/pokemon-alert-component';

@Component({
  selector: 'app-pokemon-card-component',
  imports: [FirstCapitalPipe, IdPipe, ImageErrorDirective, PokemonAlertComponent],
  templateUrl: './pokemon-card-component.html',
  styleUrl: './pokemon-card-component.scss',
})
export class PokemonCardComponent {
  public poke: InputSignal<PokemonData> = input.required();
  public isAlertVisible = false;

  constructor() {}

  public alert() {
    if (!this.isAlertVisible) this.isAlertVisible = true;
  }

  public ocultarAlert(){
    this.isAlertVisible = false;
  }

  public getId(): string {
    return this.poke().id.toString();
  }

  public getName(): string {
    return this.poke().name;
  }

  public getImg(): string {
    return this.poke().sprites.other.home.front_default;
  }
}
