package com.example.thymeleafcomponentdemo.web.home

import com.example.thymeleafcomponentdemo.core.ExampleService
import de.tschuehly.thymeleafviewcomponent.ViewComponent

@ViewComponent
class HomeViewComponent(
    private val exampleService: ExampleService,
) {
    fun render() : Any = mapOf(
            "myProperty" to exampleService.getSomeProperty()
        )
}