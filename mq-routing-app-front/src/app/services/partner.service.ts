import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PartnerService {
  private apiUrl = 'http://localhost:8080/api/partners';

  constructor(private http: HttpClient) { }

  getPartners(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }

  addPartner(partner: any): Observable<any> {
    return this.http.post<any>(this.apiUrl, partner);
  }

  deletePartner(alias: string): Observable<any> {
    return this.http.delete<any>(`${this.apiUrl}/${alias}`);
  }
}
