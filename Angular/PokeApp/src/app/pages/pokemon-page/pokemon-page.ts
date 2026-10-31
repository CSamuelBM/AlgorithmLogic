import { Component, OnInit, signal } from '@angular/core';
import { PokemonService } from '../../core/services/pokemon-service/pokemon-service';
import { forkJoin, Observable } from 'rxjs';
import { PokemonData } from '../../shared/interfaces/pokemon.interface';
import { GENERAL } from '../../shared/constants/general.constant';
import { PokemonCardComponent } from '../../shared/components/pokemon-card-component/pokemon-card-component';

@Component({
  selector: 'app-pokemon-page',
  imports: [PokemonCardComponent],
  templateUrl: './pokemon-page.html',
})
export class PokemonLogic implements OnInit {
  public pokeList = signal<PokemonData[]>([]);
  public title = GENERAL.TITLE_POKEMON;
  public isLogged: boolean;

  constructor(private pokeApi: PokemonService) {
    this.isLogged = false;
  }

  public ngOnInit(): void {
    this.getPoke();
    this.logged();
  }

  private getPoke(): void {
    const pokeRequest: Observable<any>[] = [];

    for (let i = 1; i <= 50; i++) {
      pokeRequest.push(this.pokeApi.getAll(i));
    }

    forkJoin(pokeRequest).subscribe({
      next: (data: PokemonData[]) => {
        this.pokeList.set(data);
      },
      error: (error: any) => {
        console.log('Accion no esperada: ', error);
      },
    });
  }

  public login() {
    this.isLogged = true;
    localStorage.setItem('logged', 'true');
  }

  public logout() {
    this.isLogged = false;
    localStorage.setItem('logged', 'false');
  }

  private logged() {
    if (localStorage.getItem('logged') === 'true') this.isLogged = true;
    else this.isLogged = false;
  }
}

