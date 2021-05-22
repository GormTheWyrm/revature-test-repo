import { Component, OnInit } from '@angular/core';
import {Hero} from '../hero'; //class
import {HEROES} from '../mock-heroes';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {

  oldHero:Hero = {
    name: "Windstorm",
    id: 1
  } //this is an old variable, only deals with windstorm
  
  selectedHero?:Hero;
  onSelect(hero:Hero):void {
    this.selectedHero = hero;
    
    // console.log(this.selectedHero);
  }

  heroes = HEROES;
  constructor() { }

  ngOnInit(): void {
  }
//on //did I put this here?

}
