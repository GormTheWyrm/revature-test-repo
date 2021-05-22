import { Component } from '@angular/core';

@Component({
  selector: 'app-root', //css selector
  templateUrl: './app.component.html', //html file location
  styleUrls: ['./app.component.css']  //css file location
})
export class AppComponent {
  title = 'Tour of Heroes';
  author = 'GormTheWyrm';
  // note; double quotes break these variables!
}
