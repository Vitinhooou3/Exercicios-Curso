import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
import { FormsModule } from '@angular/forms';
import { RotaComponent } from './rota/rota.component';
import { HttpClientModule } from '@angular/common/http'
import { EnderecoService } from './Service/endereco.service';


@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    RotaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [EnderecoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
