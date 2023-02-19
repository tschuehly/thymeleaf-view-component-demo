package com.example.thymeleafcomponentdemo.web.navigation


import com.example.thymeleafcomponentdemo.config.ViewComponent
import com.example.thymeleafcomponentdemo.core.ExampleService

@ViewComponent
class NavigationViewComponent(
    private val exampleService: ExampleService
) {
    fun render(): Any = mapOf(
        "someOtherProperty" to exampleService.getSomeOtherProperty()
    )
}