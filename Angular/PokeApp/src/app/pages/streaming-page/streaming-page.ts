import { Component, OnInit, signal } from '@angular/core';
import { StreamingService } from '../../core/services/streaming-service/streaming-service';
import { StreamingAll, StreamingData } from '../../shared/interfaces/streaming.interface';
import { catchError, forkJoin, Observable, of } from 'rxjs';
import { StreamingComponent } from '../../shared/components/streaming-component/streaming-component';

@Component({
  selector: 'app-streaming-page',
  imports: [StreamingComponent],
  templateUrl: './streaming-page.html',
  styleUrl: './streaming-page.scss',
})
export class StreamingPage implements OnInit {
  public listStreaming = signal<StreamingData[]>([]);
  public page = signal<number>(0);
  public size = 25;

  constructor(private streamingApi: StreamingService) {}

  public ngOnInit() {
    this.getStreamingAll(this.page(), this.size);
  }

  public getStreamingAll(page: number, size: number) {
    this.streamingApi.getAll(page, size)
      .pipe(catchError(error=> {
          console.log('Accion no esperada en consulta', error);
          return of({content: []} as unknown as StreamingAll);
        })
      )
      .subscribe({
        next: (data: StreamingAll) => {
          console.log(data);
          this.listStreaming.set(data.content);
        },
        error: (error) => {
          console.log('Accion no esperada: ', error);
        },
        complete: () => {}
      });
  }

  public nextPage() {
    this.page.update(value => value + 1);
    this.getStreamingAll(this.page(), this.size);
  }

  public prevPage() {
    if(this.page() > 0){
      this.page.update(value => value - 1);
      this.getStreamingAll(this.page(), this.size);
    }
  }
}
