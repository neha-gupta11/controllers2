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

}
