import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'HospitalManager-Front';
  constructor(private route: Router){}

  mudarRota(): void{
    this.route.navigate(['/leitos'])
  }

}
