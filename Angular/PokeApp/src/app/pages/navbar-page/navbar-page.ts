import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { GENERAL } from '../../shared/constants/general.constant';

@Component({
  selector: 'app-navbar-page',
  imports: [RouterLink],
  templateUrl: './navbar-page.html',
  styleUrl: './navbar-page.scss',
})
export class NavbarPage {
  public title = GENERAL.TITLE;

  constructor() {

  }
}
