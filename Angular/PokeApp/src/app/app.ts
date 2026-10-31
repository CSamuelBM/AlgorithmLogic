import { Component } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';
import { NavbarPage } from './pages/navbar-page/navbar-page';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, RouterModule, NavbarPage],
  templateUrl: './app.html',
})
export class App {

  constructor() {
  }
}
