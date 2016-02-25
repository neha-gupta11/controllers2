package com.ttnd.controllers2


import grails.test.mixin.*
import spock.lang.*

@TestFor(EmployeeController)
@Mock(Employee)
class EmployeeControllerSpec extends Specification {

	def setup() {
	}

	def cleanup() {
	}

	void "canary test"() {
		expect:
			true
	}
}
