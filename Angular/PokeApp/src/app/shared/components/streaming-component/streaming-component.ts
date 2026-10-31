import { Component, input, InputSignal } from '@angular/core';
import { StreamingData } from '../../interfaces/streaming.interface';

@Component({
  selector: 'app-streaming-component',
  imports: [],
  templateUrl: './streaming-component.html',
  styleUrl: './streaming-component.scss',
})
export class StreamingComponent {
  public streaming: InputSignal<StreamingData> = input.required();
}
