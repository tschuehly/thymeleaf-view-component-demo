package com.example.thymeleafcomponentdemo.core

import org.springframework.stereotype.Service

@Service
class ExampleService {
    fun getSomeProperty(): String{
        return "Hello World"
    }

    fun getSomeOtherProperty(): String {
        return "Hello Wim"
    }

    fun getSomethingElse():String{
        return "This is another Property"
    }
}