import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {

  // ADD CHART OPTIONS. 
  chartOptions = {
    responsive: true    // THIS WILL MAKE THE CHART RESPONSIVE (VISIBLE IN ANY DEVICE).
  }

  labels = ['Java', 'Angular', 'Web services', 'J2EE Frameworks', 'ORM Framework','Web Development','Testing Tools/Frameworks','ESBs','Reporting','RDBMS','No SQL','Case Tools & OOAD','Dev Ops','Message brokers','Agile',''];

  // STATIC DATA FOR THE CHART IN JSON FORMAT.
  chartData = [
    {
      label: 'Skills',
      data: [90, 50, 80, 80, 60,70,50,70,30,70,75,80,65,60,80,0]
    }
  ];

  // CHART COLOR.
  colors = [
    { // 1st Year.
      backgroundColor: 'rgba(244, 66, 104)'
    }
  ]
  
  // CHART CLICK EVENT.
  onChartClick(event) {
    console.log(event);
  }
  constructor() { }

  ngOnInit() {
  }

}
