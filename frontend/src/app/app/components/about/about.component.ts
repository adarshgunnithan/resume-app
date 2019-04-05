import { Component, OnInit } from '@angular/core';
import {ResumeService} from '../../../resume-service';
import {About} from '../../../about'

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {
  aboutContent : Array<About>;
  data1:string;

  constructor(private resumeSer: ResumeService) {
    this.aboutContent=[];
   }

  ngOnInit() {
    this.resumeSer.getAboutPageContent().subscribe((aboutData)=>{
    this.aboutContent.push(...aboutData);  
      });


      // console.log("about data-->",this.aboutContent);

  }

}
