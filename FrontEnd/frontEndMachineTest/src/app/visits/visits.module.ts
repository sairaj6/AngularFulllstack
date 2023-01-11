import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { VisitAddComponent } from './visit-add/visit-add.component';
import { VisitListComponent } from './visit-list/visit-list.component';
import { VisitsComponent } from './visits.component';

import { NgxPaginationModule } from 'ngx-pagination';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ToastrModule } from 'ngx-toastr';
import { AppRoutingModule } from '../app-routing.module';
import { RouterModule, Routes } from '@angular/router';



const VisitRoutes: Routes = [

  {
    path: '',
    component:VisitsComponent,
    children: [
      {
        path: 'visitadd/:visitId',
        component: VisitAddComponent,
      },
      {
        path: 'visitadd',
        component: VisitAddComponent,
      },
      {
        path: 'visitlist',
        component: VisitListComponent,
      },
    ],
  },
];

@NgModule({
  declarations: [VisitAddComponent, VisitListComponent, VisitsComponent],
  imports: [
    CommonModule,
    NgxPaginationModule,
    Ng2SearchPipeModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot(),
    AppRoutingModule,
    RouterModule.forChild(VisitRoutes)
    
  ]
})
export class VisitsModule { }
