package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblvisit")
public class Visit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer visitId;
	private String custName;
	private String contactPerson;
	private Integer contactNo;
	private String interestProduct;
	private String visitSubject;
	private String description;
	private LocalDate visitDate;
	private Boolean isDisabled;
	private Boolean isDeleted;
	
	private Integer empId;
	@ManyToOne	
	@JoinColumn(name="empId",insertable = false,updatable = false)
	private Employee employee;
	
	public Visit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Visit(Integer visitId, String custName, String contactPerson, Integer contactNo, String interestProduct,
			String visitSubject, String description, LocalDate visitDate, Boolean isDisabled, Boolean isDeleted) {
		super();
		this.visitId = visitId;
		this.custName = custName;
		this.contactPerson = contactPerson;
		this.contactNo = contactNo;
		this.interestProduct = interestProduct;
		this.visitSubject = visitSubject;
		this.description = description;
		this.visitDate = visitDate;
		this.isDisabled = isDisabled;
		this.isDeleted = isDeleted;
	}

	public Visit(Integer visitId, String custName, String contactPerson, Integer contactNo, String interestProduct,
			String visitSubject, String description, LocalDate visitDate, Boolean isDisabled, Boolean isDeleted,
			Integer empId, Employee employee) {
		super();
		this.visitId = visitId;
		this.custName = custName;
		this.contactPerson = contactPerson;
		this.contactNo = contactNo;
		this.interestProduct = interestProduct;
		this.visitSubject = visitSubject;
		this.description = description;
		this.visitDate = visitDate;
		this.isDisabled = isDisabled;
		this.isDeleted = isDeleted;
		this.empId = empId;
		this.employee = employee;
	}

	public Integer getVisitId() {
		return visitId;
	}

	public void setVisitId(Integer visitId) {
		this.visitId = visitId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public Integer getContactNo() {
		return contactNo;
	}

	public void setContactNo(Integer contactNo) {
		this.contactNo = contactNo;
	}

	public String getInterestProduct() {
		return interestProduct;
	}

	public void setInterestProduct(String interestProduct) {
		this.interestProduct = interestProduct;
	}

	public String getVisitSubject() {
		return visitSubject;
	}

	public void setVisitSubject(String visitSubject) {
		this.visitSubject = visitSubject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}

	public Boolean getIsDisabled() {
		return isDisabled;
	}

	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Visit [visitId=" + visitId + ", custName=" + custName + ", contactPerson=" + contactPerson
				+ ", contactNo=" + contactNo + ", interestProduct=" + interestProduct + ", visitSubject=" + visitSubject
				+ ", description=" + description + ", visitDate=" + visitDate + ", isDisabled=" + isDisabled
				+ ", isDeleted=" + isDeleted + ", empId=" + empId + ", employee=" + employee + "]";
	}
	
	
	
	
} 
