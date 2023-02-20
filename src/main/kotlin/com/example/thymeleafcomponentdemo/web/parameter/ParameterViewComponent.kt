package com.example.thymeleafcomponentdemo.web.parameter

import com.example.thymeleafcomponentdemo.config.ViewComponent
import com.example.thymeleafcomponentdemo.core.ExampleService


@ViewComponent
class ParameterViewComponent(
    private val exampleService: ExampleService
) {
    fun render(parameter: String?): Any = mapOf(
        "somethingElse" to (parameter ?: exampleService.getSomethingElse())
    )
}