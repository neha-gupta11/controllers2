package com.ttnd.controllers2

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(SampleController)
class SampleControllerSpec extends Specification {
	void setup() {

	}

	void cleanup() {

	}

	void "test something"() {
		expect:
			true
	}

	void "test intBinding"(){
		when:
			controller.intBinding(10,"String")

		then:
			response.text == '10String'

	}

	void "test autoBinding"(){
		when:
			params.intParam = 10
			params.stringParam = "String"
			controller.autoBinding()

		then:
			response.text == '10String'

	}
}
