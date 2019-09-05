import { Component, OnInit, Input } from '@angular/core';
import { AppareilService } from '../services/appareil.service';

@Component({
  selector: 'app-appareil',
  templateUrl: './appareil.component.html',
  styleUrls: ['./appareil.component.scss']
})
export class AppareilComponent implements OnInit {
   @Input() appareilName: string ;
   @Input()  appareilStatus: string ;
   @Input()  indexOfAppareil: number;
  constructor(private appareilService: AppareilService) { }

  ngOnInit() {
  }
  getStatus(){
    return this.appareilStatus;
  }
  getColor(){
  if(this.appareilStatus === 'allume'){
  return 'green';

  }else if(this.appareilStatus === 'eteint'){
  return 'red'
  }
  }
  onSwitchOn(){
    this.appareilService.switchOnOne(this.indexOfAppareil);
  }
  onSwitchOff(){
    this.appareilService.switchOfOne(this.indexOfAppareil);
  }
  }

