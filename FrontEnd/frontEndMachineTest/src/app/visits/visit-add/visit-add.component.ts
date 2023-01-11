import { Component, OnInit } from '@angular/core';
import { VisitService } from '../visit.service';
import { ActivatedRoute, Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'tests-visit-add',
  templateUrl: './visit-add.component.html',
  styleUrls: ['./visit-add.component.scss']
})
export class VisitAddComponent implements OnInit {


  //declare variables
  _vivitId: number;

  constructor(private toastr: ToastrService, 
    private route:ActivatedRoute,
    private router: Router,
    public visitorsService:VisitService) { }

  ngOnInit(): void {
    this._vivitId = this.route.snapshot.params['visitId']
  }

  //Submit Method
  onSubmit(form: NgForm){
    console.log(form.value);

    let _addVisitId = this.visitorsService.formVisitorData.visitId;

    // check conditions
    if(_addVisitId == 0 || _addVisitId == null){
      this.addVisitor(form);
      this.router.navigateByUrl("/visitlist");
      //window.location.reload();
    }
    else{
      
      //window.location.reload();
      this.redirect();
    }
  }

  //Insert Method
  addVisitor(form ?: NgForm){
    console.log("inserting....");
    this.visitorsService.addVisitors(form.value).subscribe(
      (result)=>{
        console.log(result);
        //reset Form
        //notification
        this.toastr.success("Visitors Record Inserted Successfully","MachineTestAppv2023");
      },
      (error)=>{
        console.log(error)
        this.toastr.error("Something Wrong... Try again","MachineTestAppv2023");
      }
      );
    }

  redirect(){
    this.router.navigate(['visitlist']);
  }

  
}
