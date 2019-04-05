import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import {About} from './about';
import {Experience} from './experience';
import {Skill} from './skill';
import {Qualification} from '././qualification';


@Injectable({
  providedIn: 'root'
})
export class ResumeService {
  private aboutUrl : string;
  private experienceApiUrl : string;
  private educationApiUrl : string;
  private skillApiUrl : string;
  constructor(private httpClient: HttpClient) {
    this.aboutUrl ="http://localhost:8080/api/v1/resume-service/about";
    this.experienceApiUrl="http://localhost:8080/api/v1/resume-service/experience";
    this.educationApiUrl="http://localhost:8080/api/v1/resume-service/qualifications";
    this.skillApiUrl="http://localhost:8080/api/v1/resume-service/skills";

   }


  getAboutPageContent():Observable<Array<About>>{
   return this.httpClient.get<Array<About>>(this.aboutUrl);
  }

  getExperience():Observable<Array<Experience>>{
    return this.httpClient.get<Array<Experience>>(this.experienceApiUrl);
   }

   getSkill():Observable<Array<Skill>>{
    return this.httpClient.get<Array<Skill>>(this.skillApiUrl);
   }

   getQualificatione():Observable<Array<Qualification>>{
    return this.httpClient.get<Array<Qualification>>(this.educationApiUrl);
   }
}
