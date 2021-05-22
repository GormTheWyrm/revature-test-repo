import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeroDetailServedComponent } from './hero-detail-served.component';

describe('HeroDetailServedComponent', () => {
  let component: HeroDetailServedComponent;
  let fixture: ComponentFixture<HeroDetailServedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeroDetailServedComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HeroDetailServedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
