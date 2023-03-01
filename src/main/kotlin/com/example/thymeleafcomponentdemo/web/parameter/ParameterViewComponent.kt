package com.example.thymeleafcomponentdemo.web.parameter

import com.example.thymeleafcomponentdemo.core.ExampleService
import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewComponentContext


@ViewComponent
class ParameterViewComponent(
    private val exampleService: ExampleService
) {
    fun render(parameter: String?) = ViewComponentContext(
            "office" to (parameter ?: throw Error("You need to pass in a parameter")),
    )
}