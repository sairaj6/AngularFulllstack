import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import{ HttpClientModule} from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ToastrModule } from 'ngx-toastr';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';
import { VisitsModule } from './visits/visits.module'
import{ VisitService } from './visits/visit.service'

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    ToastrModule,
    VisitsModule

  ],
  providers: [VisitService],
  bootstrap: [AppComponent]
})
export class AppModule { }
