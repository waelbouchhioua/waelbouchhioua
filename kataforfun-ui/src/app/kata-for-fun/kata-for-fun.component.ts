import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { KataForFunService } from '../kata-for-fun.service';

@Component({
  selector: 'app-kata-for-fun',
  templateUrl: './kata-for-fun.component.html'
})
export class KataForFunComponent implements OnInit, OnDestroy {

  // table des résultats
  resultList: NumberConverted[] = [];

  constructor(private kataForFunService: KataForFunService) { }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
  }

  convertNumber(inputNumber: number): void {
    if (inputNumber) {
      // appel WS GET
      this.kataForFunService.sendNumber(inputNumber).subscribe(
        (response) => {
          this.resultList.push({numberToConvert: inputNumber, result: response.result});
        },
        (error) => {
          console.error(error);
        }
        );
      }
  }
}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
