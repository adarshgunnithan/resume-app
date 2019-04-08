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
  private phoneNumber: string;
  private descText: string;
  private email: string;

  constructor(private resumeSer: ResumeService) {
    this.aboutContent=[];
   this.address="";
   this.phoneNumber="";
   this.descText="";
   this.email="";
   }

  ngOnInit() {
    this.resumeSer.getAboutPageContent().subscribe((aboutData)=>{
      
    this.aboutContent.push(...aboutData);  
     this.aboutContent.forEach(value => { 
          if(value.aboutKeyName === "ADDRESS"){
         this.address=value.aboutValueText;
          }else if(value.aboutKeyName === "PHONE_NUMBER"){
            this.phoneNumber=value.aboutValueText;
          }else if(value.aboutKeyName === "EMAIL"){
            this.email=value.aboutValueText;
          }else if(value.aboutKeyName === "ABOUT_TXT"){
           
            this.descText=value.aboutValueText;
          }else{

          }


      });
  
    

}); 
console.log("address2", this.address);

  }

  

}
