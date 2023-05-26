import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-kata-for-fun-form',
  templateUrl: './kata-for-fun-form.component.html'
})
export class KataForFunFormComponent implements OnInit {
  numberValue = new FormControl('', [Validators.required, Validators.pattern(/^\d+$/)]);
  numberInput: number;
  @Output() submitNumberOutput = new EventEmitter<Number>();

  constructor() {}

  ngOnInit(): void {
  }

  submitNumber(): void {
    if (this.numberValue.valid) {
      this.submitNumberOutput.emit(this.numberInput);
    }
  }

}
