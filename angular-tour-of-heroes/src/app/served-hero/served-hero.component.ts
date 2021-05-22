import { Component, OnInit } from '@angular/core';
import { Hero } from '../hero'; //class
import { HeroService } from '../hero.service';
import { MessageService } from '../message.service';


@Component({
  selector: 'app-served-hero',
  templateUrl: './served-hero.component.html',
  styleUrls: ['./served-hero.component.css']
})
export class ServedHeroComponent implements OnInit {
  selectedSuperHero?: Hero;
  superHeroes: Hero[] = []; //sets heroes to an empty array of Hero class type

  constructor(private heroService: HeroService, private messageService:MessageService) { }
  ngOnInit(): void {
    this.getHeroes();
  }

  getHeroes(): void {
    this.heroService.getHeroes()
      .subscribe(heroes => this.superHeroes = heroes)
  }

  onSelect(superHero: Hero): void {
    this.selectedSuperHero = superHero;
    this.messageService.add(`ServedHeroComponent: selected hero id = ${superHero.id}`);
  }

}
