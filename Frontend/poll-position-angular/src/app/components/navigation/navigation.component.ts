import { Component } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent {

  constructor(private router: Router) {
  }
  loggedIn():boolean{
    return localStorage.getItem("userToken") !== null;
  }


  logout() {
    localStorage.clear();
    this.router.navigateByUrl("");
  }
}
