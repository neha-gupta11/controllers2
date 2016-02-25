package com.ttnd.controllers2

class DataBindingController {

    def implicitConstructor() {
        println "--------------------- "+params
        Employee employee = new Employee(params)
        render employee.properties
    }

    def usingProperties() {
        Employee employee = Employee.get(1)
        render "-----------------before"
        render employee.properties
        render "<br>"
        employee.properties = params
        render "-----------------after"
        render employee.properties
    }

    def bindDataAction() {
        Employee employee = Employee.get(1)
        render "-----------------before"
        render employee.properties
        render "<br>"
        bindData(employee, params, [exclude: ["name", "employeeId"]])
        render "-----------------after"
        render employee.properties
    }

    def bindOnlyInclusions(){
        Employee employee = Employee.get(1)
        render "-----------------before"
        render employee.properties
        render "<br>"
//        bindData(employee, params, [include: ["location", "age"]])
//        http://localhost:8080/controllers2/dataBinding/bindOnlyInclusions?name=Neha&employeeId=19&age=35&location=pune
        bindData(employee, params, [include: "age"])
        render "-----------------after"
        render employee.properties
    }

}
