import { Injectable } from '@angular/core';
import{ Visit } from './visit';
import {Employee } from '../shared/employee';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class VisitService {

  //declare variables--- global variable
  formVisitorData: Visit=new Visit();

  //list of Visitors
  visits:Visit[];
  employees :Employee[];

  constructor(private httpClient: HttpClient) { }

  // to get all vendors
  getAllVisitors(){
    this.httpClient.get(environment.apiUrl +'/api/visits')
    .toPromise()
    .then(
      (response)=>{
        console.log(response);
        this.visits=response as Visit[];
      },
      (error)=>{
        console.log(error);
      }
      );
  }

  getAllVisitorsList():Observable<any>{
    return this.httpClient.get(environment.apiUrl+'/api/visits');
  }

  //to add Visits;
  addVisitors(visit:Visit): Observable<any>{
    return this.httpClient.post(environment.apiUrl+'/api/visits',visit);
  }

   //to get Visitors by id
   getVisitorsById(id:number):Observable<any>
   {
     return this.httpClient.get(environment.apiUrl +'/api/visits/'+id);
   }

   //get all Employees
   getEmployees():void{
    this.httpClient.get(environment.apiUrl +'/api/employees')
    .toPromise()
    .then(
      (response)=>{
        console.log(response);
        this.employees=response as Employee[];
      },
      (error)=>{
        console.log(error);
      }
      );
  }

}
