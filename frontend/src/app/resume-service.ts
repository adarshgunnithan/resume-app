import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import {About} from './about';

@Injectable({
  providedIn: 'root'
})
export class ResumeService {
  private aboutUrl : string;

  constructor(private httpClient: HttpClient) {
    this.aboutUrl ="http://localhost:8080/api/v1/resume-service/about";
   }


  getAboutPageContent():Observable<Array<About>>{
   return this.httpClient.get<Array<About>>(this.aboutUrl);
  }
}
