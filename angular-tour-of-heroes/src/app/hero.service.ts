import { Injectable } from '@angular/core';
import {Hero} from './hero'; //Hero class
import {HEROES} from './mock-heroes'; //data
import { Observable, of } from 'rxjs';
import { MessageService } from './message.service';



@Injectable({
  providedIn: 'root'
})
export class HeroService {

// getHeroes(): Hero[] { //returns array of heroes!
//   return HEROES;
// } //synchronous!

getHeroes(): Observable<Hero[]> {
  const heroes = of(HEROES); //returns an observable - array of Heros (coutns as single value)
  this.messageService.add('your heroes are ready, commander');
  return heroes;
}
constructor(private messageService: MessageService) { }
}
