import { Component, computed, signal } from '@angular/core';
import { HeroComponent } from '../../shared/components/hero-component/hero-component';
import { GENERAL } from '../../shared/constants/general.constant';

@Component({
  selector: 'app-hero-page',
  imports: [HeroComponent],
  templateUrl: './hero-page.html',
})
export class HeroPage {
  public name;
  public age;
  public title = GENERAL.TITLE_HEROES;

  constructor() {
    this.name = signal('Stark');
    this.age = signal(19);
  }

  public getHeroDescription() {
    this.name.set('Frieren');
    this.age.set(1000);
  }

  public getHeroChange() {
    this.name.set('Fern');
    this.age.set(19);
  }

  public getHeroReset() {
    this.name.set('Stark');
    this.age.set(19);
  }
}
