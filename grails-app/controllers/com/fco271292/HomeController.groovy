package com.fco271292

class HomeController {

    def index() { 
    	render "Hola ${new Date().format("dd-MM-yyyy")}"
    }
}
