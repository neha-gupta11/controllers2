package com.ttnd.controllers2

class TestController {

    def index() { }

    def intBinding(int intParam,String stringParam) {
        render intParam
        render stringParam
    }


}
