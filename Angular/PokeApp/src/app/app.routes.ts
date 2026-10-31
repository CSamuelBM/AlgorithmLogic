import { Routes } from '@angular/router';
import { InventoryPage } from './pages/inventory-page/inventory-page';
import { PokemonLogic } from './pages/pokemon-page/pokemon-page';
import { HeroPage } from './pages/hero-page/hero-page';
import { loggedGuard } from './core/guards/logged-guard/logged-guard';
import { StreamingPage } from './pages/streaming-page/streaming-page';
import { TemperaturePage } from './pages/temperature-page/temperature-page';
import { ColorPage } from './pages/color-page/color-page';
import { SumPage } from './pages/sum-page/sum-page';
import { InvertirPalabraPage } from './pages/invertir-palabra-page/invertir-palabra-page';

export const routes: Routes = [
  {
    path: 'Pokemon',
    component: PokemonLogic,
  },
  {
    path: 'Inventory',
    canActivate: [loggedGuard],
    component: InventoryPage,
  },
  {
    path: 'Hero',
    canActivate: [loggedGuard],
    component: HeroPage,
  },
  {
    path: 'Streaming',
    canActivate: [loggedGuard],
    component: StreamingPage,
  },
  {
    path: 'Temperature',
    canActivate: [loggedGuard],
    component: TemperaturePage,
  },
  {
    path: 'Color',
    canActivate: [loggedGuard],
    component: ColorPage,
  },
  {
    path: 'Sum',
    canActivate: [loggedGuard],
    component: SumPage,
  },
  {
    path: 'InvertirPalabra',
    canActivate: [loggedGuard],
    component: InvertirPalabraPage,
  },
  {
    path: '**',
    redirectTo: 'Pokemon',
  },
];
