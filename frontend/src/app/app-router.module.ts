import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AboutComponent} from './app/components/about/about.component';
import {SkillsComponent} from './app/components/skills/skills.component';
import {ExperienceComponent} from './app/components/experience/experience.component';
import {EducationComponent} from './app/components/education/education.component';

 


const mainRoutes: Routes = [
        {
            path: '',
            redirectTo: '/about',
            pathMatch: 'full'
        },
        {
            path: 'about',
            component: AboutComponent
            
        },
        {
            path: 'skills',
            component: SkillsComponent,
            data: { animation: 'isRight' }
          
        },
        {
            path: 'experience',
            component: ExperienceComponent,
            data: { animation: 'isRight' }
        },
        {
            path: 'education',
            component: EducationComponent,
            data: { animation: 'isRight' }
        }
    ]


@NgModule({
imports: [
    RouterModule.forRoot(mainRoutes)
],
declarations: [],
exports: [RouterModule],
providers: []
})

export class AppRoutingModule {}