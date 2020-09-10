import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PokemonCrudComponent} from './pokemon-crud/pokemon-crud.component';

const routes: Routes = [
  {path:'crud-app',component:PokemonCrudComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
