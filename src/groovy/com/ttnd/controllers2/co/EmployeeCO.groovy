package com.ttnd.controllers2.co

import com.ttnd.controllers2.Department
import grails.validation.Validateable

@Validateable
class EmployeeCO {
	String name
	String employeeId
	int age
	String location
	Date dob
	Department dept

	static constraints = {
		employeeId unique: true
		location nullable: true
		dob nullable: true
	}
}
