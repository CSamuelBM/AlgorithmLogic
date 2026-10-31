import { Directive, ElementRef, HostListener, Input } from '@angular/core';

@Directive({
  selector: '[appImageError]',
})
export class ImageErrorDirective {
  @Input() appImageError: string | undefined;

  constructor(private elementRef: ElementRef) { }

  @HostListener('error')
  onError() {
    const element: HTMLImageElement = this.elementRef.nativeElement;
    element.src = this.appImageError || '/img/error.png';
  }
}
