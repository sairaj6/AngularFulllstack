import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [

  {path: 'visit', loadChildren:"../app/visits/visits.module#VisitsModule"},
  {path :'',redirectTo:'visitlist',pathMatch:'full'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
