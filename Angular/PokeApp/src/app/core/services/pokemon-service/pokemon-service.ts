import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ENVIRONMENT } from '../../environments/environment';

@Injectable({
  providedIn: 'root',
})
export class PokemonService {
  private pokemonUrl: string = `${ENVIRONMENT.POKEMON_API}pokemon/`;

  constructor(
    private httpClient: HttpClient
  ) {}

  public getAll(index: number) {
    return this.httpClient.get(this.pokemonUrl + index);
  }
}
