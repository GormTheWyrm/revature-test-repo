import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HeroesComponent } from './heroes/heroes.component';
import { ServedHeroComponent } from './served-hero/served-hero.component'; //I need to keep an eye on my naming conventions in the future
import { DashbordComponent } from './dashbord/dashbord.component';
import {DashbordDetailsComponent} from './dashbord-details/dashbord-details.component';

const routes: Routes = [
  {
    path: 'heroes', component: HeroesComponent},
    {path: 'serve', component: ServedHeroComponent},
    { path: 'dashbord', component: DashbordComponent },
    { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
    { path: 'detail/:id', component: DashbordDetailsComponent }, //didnt delete this from within the heros component...
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  //commonMudule deleted
  //no declarations... look that up
  exports: [RouterModule]
})
export class AppRoutingModule { }