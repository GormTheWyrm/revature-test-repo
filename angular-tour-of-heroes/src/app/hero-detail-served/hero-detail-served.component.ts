import { Component, OnInit, Input } from '@angular/core';
import {Hero} from '../hero';


@Component({
  selector: 'app-hero-detail-served',
  templateUrl: './hero-detail-served.component.html',
  styleUrls: ['./hero-detail-served.component.css']
})
export class HeroDetailServedComponent implements OnInit {

  @Input() superHero?:Hero;  //input hero... from ServedHeroComponent.ts...
  //service (heroes) -> servedHeroComponent.ts(superheroes) -> ServedHeroComponent(selectedSuperHero - singular, onSelect) 
  // -> ...@Input via superHero in hero-detailed-served.ts.. but how? because name is superhero? ...-> her-detailed-component.html
  constructor() { }

  ngOnInit(): void {
  }

}
