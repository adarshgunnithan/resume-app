import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AboutComponent } from './app/components/about/about.component';
import { ExperienceComponent } from './app/components/experience/experience.component';
import { EducationComponent } from './app/components/education/education.component';
import { SkillsComponent } from './app/components/skills/skills.component';
import { AwardsComponent } from './app/components/awards/awards.component';
import { RouterModule, Routes } from '@angular/router';
import {AppRoutingModule} from './app-router.module'


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
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
