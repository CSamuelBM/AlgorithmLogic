import { Component, input, InputSignal, OnInit, output } from '@angular/core';
import { PokemonData } from '../../interfaces/pokemon.interface';
import { FirstCapitalPipe } from '../../pipes/first-capital-pipe/first-capital-pipe';

@Component({
  selector: 'app-pokemon-alert-component',
  imports: [FirstCapitalPipe],
  templateUrl: './pokemon-alert-component.html',
  styleUrl: './pokemon-alert-component.scss',
})
export class PokemonAlertComponent implements OnInit {
  public poke: InputSignal<PokemonData> = input.required();
  public isAlertVisible: InputSignal<boolean> = input.required();
  public ocultarAlert = output<void>();
  public nameList: string[] = [];

  constructor() {}

  public ngOnInit() {
    this.getType();
  }

  public getExperience(): number {
    return this.poke().base_experience;
  }

  public getHeight(): number {
    return this.poke().height / 10;
  }

  private getType() {
    for (let i = 0; i < this.poke().types.length; i++)
      this.nameList.push(this.poke().types[i].type.name);
  }

  public getWeight(): number {
    return this.poke().weight / 10;
  }
}
