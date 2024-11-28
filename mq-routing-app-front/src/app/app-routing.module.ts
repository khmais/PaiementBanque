import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MessagesComponent } from './components/messages/messages.component';
import { PartnersComponent } from './components/partners/partners.component';


const routes: Routes = [ 
  { path: 'messages', component: MessagesComponent }, 
  { path: 'partners', component: PartnersComponent }, 
  { path: '', redirectTo: '/messages', pathMatch: 'full' } 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
