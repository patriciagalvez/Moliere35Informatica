import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-top-bar',
  imports: [],
  templateUrl: './top-bar.html',
  styleUrls: ['./top-bar.css'], 
  standalone: true,
})
export class TopBar {

  /*Inyecto la depencia Router*/

  constructor (private rourter: Router){
    
  }

  /* Creo lo métodos de las rutas de la barra de navegación*/
  backHome() {
    this.rourter.navigate(['/']);
   }
  servicios() {
    this.rourter.navigate(['/servicios']);
   }
  disenoWeb() { 
    this.rourter.navigate(['/disenoweb']);
   }
  quienesSomos() { 
    this.rourter.navigate(['/quienes-somos']);
   }
 
 
  contacto() { 
    this.rourter.navigate(['/contacto']);
   }
  inicioSesion() { this.rourter.navigate(['/inicio-sesion']);
   }
}
