import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServedHeroComponent } from './served-hero.component';

describe('ServedHeroComponent', () => {
  let component: ServedHeroComponent;
  let fixture: ComponentFixture<ServedHeroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ServedHeroComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ServedHeroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
