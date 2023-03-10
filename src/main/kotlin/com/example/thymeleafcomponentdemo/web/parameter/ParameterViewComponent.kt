package com.example.thymeleafcomponentdemo.web.parameter

import com.example.thymeleafcomponentdemo.core.ExampleService
import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import de.tschuehly.thymeleafviewcomponent.toProperty


@ViewComponent
class ParameterViewComponent(
    private val exampleService: ExampleService
) {
    fun render(parameter: String?, parameter2: String?) = ViewContext(
        "testparameter" toProperty (parameter ?: throw Exception("You need to pass in a parameter")),
        "office" toProperty (parameter2 ?: exampleService.getOfficeHours())
    )
}