import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AboutComponent } from './app/components/about/about.component';
import { ExperienceComponent } from './app/components/experience/experience.component';
import { EducationComponent } from './app/components/education/education.component';
import { SkillsComponent } from './app/components/skills/skills.component';
import { AwardsComponent } from './app/components/awards/awards.component';
import { RouterModule, Routes } from '@angular/router';
import {AppRoutingModule} from './app-router.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import {
  transition,
  trigger,
  query,
  style,
  animate,
  group,
  animateChild
} from '@angular/animations';

import {ResumeService} from '../app/resume-service';
import { ChartsModule } from 'ng2-charts'

@NgModule({
  declarations: [
    AppComponent,
    AboutComponent,
    ExperienceComponent,
    EducationComponent,
    SkillsComponent,
    AwardsComponent
  ],
  imports: [
    BrowserAnimationsModule,
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    ChartsModule
  ],
  providers: [ResumeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
