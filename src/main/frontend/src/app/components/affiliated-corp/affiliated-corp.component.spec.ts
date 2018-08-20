import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AffiliatedCorpComponent } from './affiliated-corp.component';

describe('AffiliatedCorpComponent', () => {
  let component: AffiliatedCorpComponent;
  let fixture: ComponentFixture<AffiliatedCorpComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AffiliatedCorpComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AffiliatedCorpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
