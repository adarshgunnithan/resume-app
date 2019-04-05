import { TestBed } from '@angular/core/testing';

import { ResumeService.TsService } from './resume-service.ts.service';

describe('ResumeService.TsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ResumeService.TsService = TestBed.get(ResumeService.TsService);
    expect(service).toBeTruthy();
  });
});
