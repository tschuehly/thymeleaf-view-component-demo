package com.example.thymeleafcomponentdemo.web.parameter

import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import de.tschuehly.thymeleafviewcomponent.toProperty


@ViewComponent
class ParameterViewComponent {
    fun render(parameter: String?) = ViewContext(
            "office" toProperty (parameter ?: throw Exception("You need to pass in a parameter")),
    )
}