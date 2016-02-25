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

}
