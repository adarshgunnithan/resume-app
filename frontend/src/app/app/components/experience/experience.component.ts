import { Component, OnInit } from '@angular/core';
import {Experience} from '../../../experience'
import {ResumeService} from '../../../resume-service';
@Component({
  selector: 'app-experience',
  templateUrl: './experience.component.html',
  styleUrls: ['./experience.component.css']
})
export class ExperienceComponent implements OnInit {
experience :Array<Experience> ;
  constructor(private resService: ResumeService) {
    this.experience=[];
   }

  ngOnInit() {
     this.resService.getExperience().subscribe((data)=>{
      this.experience.push(...data);
      console.log("array", this.experience);
    })
  }

}
