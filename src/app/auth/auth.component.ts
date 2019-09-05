import { Component, OnInit } from '@angular/core';
import { AuthService } from '../services/auth.service';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.scss']
})
export class AuthComponent implements OnInit {
  AuthStatus: boolean;


  constructor(private authService: AuthService) { }

  ngOnInit() {
    this.AuthStatus = this.authService.isAuth;
  }
onSignIn(){
  this.authService.signIn().then(
    () => {
      console.log("connexion reussie");
      this.AuthStatus = this.authService.isAuth;
    }
  );
}
onSignOut(){
  this.authService.signOut();
  this.AuthStatus = this.authService.isAuth;
}
}
