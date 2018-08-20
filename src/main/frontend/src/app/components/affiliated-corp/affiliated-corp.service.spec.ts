import { TestBed, inject } from '@angular/core/testing';

import { AffiliatedCorpService } from './affiliated-corp.service';

describe('AffiliatedCorpService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AffiliatedCorpService]
    });
  });

  it('should be created', inject([AffiliatedCorpService], (service: AffiliatedCorpService) => {
    expect(service).toBeTruthy();
  }));
});
