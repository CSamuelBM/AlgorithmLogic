import { CanActivateFn } from '@angular/router';

export const loggedGuard: CanActivateFn = (route, state) => {
  let isLogged = localStorage.getItem('logged') === 'true' ? true : false;
  return isLogged;
};
