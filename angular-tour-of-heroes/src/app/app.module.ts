import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeroesComponent } from './heroes/heroes.component';
import {FormsModule} from '@angular/forms';
import { HeroDetailComponent } from './hero-detail/hero-detail.component';
import { ServedHeroComponent } from './served-hero/served-hero.component';
import { HeroDetailServedComponent } from './hero-detail-served/hero-detail-served.component';
import { MessagesComponent } from './messages/messages.component';
import { AppRoutingModule } from './app-routing.module';
import { DashbordComponent } from './dashbord/dashbord.component';
import { DashbordDetailsComponent } from './dashbord-details/dashbord-details.component'; //NgModel
// used for forms...


@NgModule({
  declarations: [
    AppComponent,
    HeroesComponent,
    HeroDetailComponent,
    ServedHeroComponent,
    HeroDetailServedComponent,
    MessagesComponent,
    DashbordComponent,
    DashbordDetailsComponent
  ],
  imports: [  //look up each of these!
    BrowserModule,     //
    FormsModule, //allows two way binding...to forms? look up docs!
    AppRoutingModule       //routing!
    //ngModel!
    // can I nest components... what happens if declared here but used in a different component?

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


// https://angular.io/tutorial/toh-pt5
// current step
//  Routable HeroDetailComponent
//...also check out heroservice to see where @Input gets data from...



/* notes
tabs open:
google annotations in json
angular decorators...
...actually, just go thru the docs

https://angular.io/guide/pipes
https://angular.io/guide/lifecycle-hooks
https://rxjs.dev/
https://angular.io/guide/attribute-binding#class-binding
https://angular.io/guide/inputs-outputs
https://angular.io/guide/property-binding
https://angular.io/guide/dependency-injection
https://angular.io/guide/providers
https://angular.io/guide/dependency-injection


*/

// --module=ap    //creates router...