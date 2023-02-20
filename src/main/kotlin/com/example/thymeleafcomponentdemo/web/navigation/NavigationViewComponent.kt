package com.example.thymeleafcomponentdemo.web.navigation


import com.example.thymeleafcomponentdemo.core.ExampleService
import de.tschuehly.thymeleafviewcomponent.ViewComponent

@ViewComponent
class NavigationViewComponent(
    private val exampleService: ExampleService
) {
    fun render(): Any = mapOf(
        "someOtherProperty" to exampleService.getSomeOtherProperty()
    )
}