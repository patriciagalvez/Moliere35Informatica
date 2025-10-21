import { Routes } from '@angular/router';
import { Inicio } from './pages/inicio/inicio';
import { Servicios } from './pages/servicios/servicios';
import { Contacto } from './pages/contacto/contacto';
import { InicioSesion } from './pages/inicio-sesion/inicio-sesion';
import { quienesSomos } from './pages/quienes-somos/quienes-somos';
import { DisenoWebComponent } from './pages/disenoweb/disenoweb';





export const routes: Routes = [
    {path: '', component: Inicio},
    {path: 'servicios', component: Servicios},
    {path: 'contacto',component: Contacto},
    {path: 'inicio-sesion',component: InicioSesion},
    {path: 'quienes-somos',component: quienesSomos},
    {path: 'disenoweb',component: DisenoWebComponent}
    
    
];
