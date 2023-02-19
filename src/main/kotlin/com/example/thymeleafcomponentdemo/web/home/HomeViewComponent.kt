package com.example.thymeleafcomponentdemo.web.home

import com.example.thymeleafcomponentdemo.config.ViewComponent
import com.example.thymeleafcomponentdemo.core.ExampleService

@ViewComponent
class HomeViewComponent(
    private val exampleService: ExampleService,
) {
    fun render() : Any = mapOf(
            "myProperty" to exampleService.getSomeProperty()
        )
}