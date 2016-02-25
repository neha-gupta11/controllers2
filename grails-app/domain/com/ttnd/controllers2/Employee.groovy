package com.ttnd.controllers2

class Employee {

    String name
    String employeeId
    int age
    String location
    Date dob

    static belongsTo = [dept:Department]

    static constraints = {
    }
}
