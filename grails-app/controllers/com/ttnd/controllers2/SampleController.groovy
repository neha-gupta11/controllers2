package com.ttnd.controllers2

class SampleController {

    def index() { }

    def intBinding(int intParam,String stringParam) {
        render intParam
        render stringParam
    }

    //autoBinding
    def autoBinding() {
        render params.intParam
        render params.stringParam
    }

    //params magic
    def paramsConversion(){
//        http://localhost:8080/controllers2/sample/paramsConversion?age=20&dob=23-02-2016
        int age= params.int("age")
        Date dob=params.date("dob","dd-MM-yyyy")
        render age
        render dob
    }

    def fetchList(){
//        http://localhost:8080/controllers2/sample/fetchList?items=elem1&items=elem2&items=elem3
        List list=params.list("items")
        render list
    }

    def dataBindWithErrors(){
        println "------------------------------------ "+params
        def b = new Employee(params)
        println b.hasErrors()
        if (b.hasErrors()) {
            println "The value ${b.errors.getFieldError('age')}"
            if (b.errors.hasFieldErrors("age")) {
                println b.errors.getFieldError("age").rejectedValue
            }
        }

        render b.properties
    }

    def signleEndedAssociation(){
        def b = new Employee(params)
//        http://localhost:8080/controllers2/sample/signleEndedAssociation?dept.id=1
        render b.properties
    }

}
