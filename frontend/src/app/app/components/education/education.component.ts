import { Component, OnInit } from '@angular/core';
import {ResumeService} from '../../../resume-service';
import {Qualification} from '../../../qualification'
@Component({
  selector: 'app-education',
  templateUrl: './education.component.html',
  styleUrls: ['./education.component.css']
})
export class EducationComponent implements OnInit {
qualifications :Array<Qualification> ;

  constructor(private resumeService: ResumeService) { 
    this.qualifications= [];
  }

  ngOnInit() {
    this.resumeService.getQualifications().subscribe((data)=>{
      this.qualifications.push(...data);
      //console.log("array", this.qualifications);
    })
  }

}
