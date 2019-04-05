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
  private address: string;
  // phoneNumber: string;
  // descText: string;
  // email: string;

  constructor(private resumeSer: ResumeService) {
    this.aboutContent=[];
   this.address="";
   }

  ngOnInit() {
    this.resumeSer.getAboutPageContent().subscribe((aboutData)=>{
      
    this.aboutContent.push(...aboutData);  
     this.aboutContent.forEach(function (value) {
          if(value.aboutKeyName === "ADDRESS"){
    
         // this.address=value.aboutValueText;
        //  console.log( this.address);
        
          }
      });
  
    

}); 


  }

  

}
