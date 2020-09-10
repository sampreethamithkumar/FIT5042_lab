import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PokemonCrudComponent } from './pokemon-crud/pokemon-crud.component';
import { InMemoryWebApiModule } from 'angular-in-memory-web-api';
import {PokemonDataService} from "./data/PokemonDataService";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    PokemonCrudComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    InMemoryWebApiModule.forRoot(PokemonDataService,{
      passThruUnknownUrl: true
    })
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
