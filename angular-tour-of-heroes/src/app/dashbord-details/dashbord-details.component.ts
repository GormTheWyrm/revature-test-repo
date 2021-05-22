import { Component, OnInit, Input } from '@angular/core';
import { Hero } from '../hero';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';

import { HeroService } from '../hero.service';

@Component({
  selector: 'app-dashbord-details',
  templateUrl: './dashbord-details.component.html',
  styleUrls: ['./dashbord-details.component.css']
})
export class DashbordDetailsComponent implements OnInit {

  @Input() selectedHero:Hero; //where to get this value/ how to control this input?
  // attempted to pass in selectedHero...
  //html not loading because this does nto exist...

  constructor(
    private route: ActivatedRoute, //what is this?
    private heroService: HeroService,
    private location: Location      //?
  ) {}

  ngOnInit(): void {
  }

}
