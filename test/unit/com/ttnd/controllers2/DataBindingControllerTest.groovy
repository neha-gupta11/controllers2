package com.ttnd.controllers2

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DataBindingController)
class DataBindingControllerTest extends Specification {

	void "canary"() {
		expect:
			true
	}

	void "test implicitConstructor"() {
		when:
			params.name = name
			params.age = age
			params.employeeId = employeeId
			params.location = location
			params.dob = dob

			controller.implicitConstructor()

		then:
			println response.text as Employee

		where:
			name    | employeeId | age | location | dob
			"Rahul" | "IG0101"   | 20  | "Noida"  | null
			"Rahul" | "IG0101"   | 20  | ""       | null
	}


}
