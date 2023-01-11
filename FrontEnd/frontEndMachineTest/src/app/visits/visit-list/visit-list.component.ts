import { Component, OnInit } from '@angular/core';
import { VisitService } from '../visit.service';
import { ToastrService } from 'ngx-toastr';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Visit } from '../visit';


@Component({
  selector: 'tests-visit-list',
  templateUrl: './visit-list.component.html',
  styleUrls: ['./visit-list.component.scss']
})
export class VisitListComponent implements OnInit {

  //declare variables
  term: string;
  page: number =1;

  constructor(private toastr: ToastrService,
    public router: Router,
    public visitorService:VisitService
    ) { }

  ngOnInit(): void {
    this.getAllVisitorsForComponent();
    this.visitorService.getEmployees();
  }

  //1 Get method for all Visitors
  getAllVisitorsForComponent(){
    //call service here
    this.visitorService.getAllVisitors();
    console.log("get All Visitors");
    this.visitorService.getAllVisitorsList().subscribe(
      (response)=>{
        console.log(response);
    
      },
      (error)=>{
        console.log(error);
      }
    );
  }

  // populate Form When click on
  populateForm(visit: Visit){
    console.log(visit);
    this.visitorService.formVisitorData=Object.assign({},visit);
  }

  //add Visitor
  addVendor(form ?: NgForm){
    this.router.navigate(['visitadd']);
    console.log("inserting....");
    this.visitorService.addVisitors(form.value).subscribe(
      (result)=>{
        console.log(result);
        this.toastr.success("Visitors Record Inserted Successfully","MachineTestAppv2023");
      },
      (error)=>{
        console.log(error)
        this.toastr.error("Something Wrong... Try again","MachineTestAppv2023");
      }
      );
  }

}

