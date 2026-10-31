import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StreamingApiEnum } from '../../../shared/enums/streaming.enum';
import { ENVIRONMENT } from '../../environments/environment';
import { StreamingAll, StreamingData } from '../../../shared/interfaces/streaming.interface';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class StreamingService {
  private streamingUrl: string = `${ENVIRONMENT.STREAMING_API}moveInformation/`;

  constructor(
    private httpClient: HttpClient
  ) {}

  public getId(showId: number): Observable<StreamingData> {
    return this.httpClient.get<StreamingData>(`${this.streamingUrl}${showId}`);
  }
  public getAll(page: number, size: number): Observable<StreamingAll> {
    return this.httpClient.get<StreamingAll>(`${this.streamingUrl}${StreamingApiEnum.ALL}?page=${page}&size=${size}`);
  }
  public getSearch(filtro: string): Observable<StreamingData[]> {
    return this.httpClient.get<StreamingData[]>(
      `${this.streamingUrl}${StreamingApiEnum.SEARCH}${filtro}`
    );
  }

  public createMovie(movie: StreamingData): Observable<any> {
    return this.httpClient.post(this.streamingUrl, movie);
  }

  public updateMovie(showId: number, movie: StreamingData): Observable<any> {
    return this.httpClient.patch(`${this.streamingUrl}${showId}`, movie);
  }

  public deleteMovie(showId: number): Observable<any> {
    return this.httpClient.delete(`${this.streamingUrl}${showId}`);
  }
}
