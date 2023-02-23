package com.example.thymeleafcomponentdemo.web.home

import com.example.thymeleafcomponentdemo.core.ExampleService
import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewComponentContext

@ViewComponent
class HomeViewComponent(
    private val exampleService: ExampleService,
) {
    fun render() = ViewComponentContext(
        mapOf(
            "myProperty" to exampleService.getSomeProperty()
        )
    )
}