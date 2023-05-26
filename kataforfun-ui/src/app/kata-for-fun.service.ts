import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Result } from './model/result';

@Injectable({
  providedIn: 'root'
})
export class KataForFunService {
  private baseUrl = 'http://localhost:8080/kata-for-fun';

  constructor(private http: HttpClient) { }

  sendNumber(number: number): Observable<Result> {
    const url = `${this.baseUrl}/${number}`;

    return this.http.get<Result>(url);
  }
}
