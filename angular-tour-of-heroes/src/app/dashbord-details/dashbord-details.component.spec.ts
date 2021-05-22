import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DashbordDetailsComponent } from './dashbord-details.component';

describe('DashbordDetailsComponent', () => {
  let component: DashbordDetailsComponent;
  let fixture: ComponentFixture<DashbordDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DashbordDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DashbordDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
