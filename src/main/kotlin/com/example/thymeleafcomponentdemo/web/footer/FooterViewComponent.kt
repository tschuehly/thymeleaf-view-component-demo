package com.example.thymeleafcomponentdemo.web.footer

import com.example.thymeleafcomponentdemo.config.ViewComponent
import com.example.thymeleafcomponentdemo.core.ExampleService

@ViewComponent
class FooterViewComponent (
    private val exampleService: ExampleService,
    ) {
        fun render() : Any = mapOf(
            "someProperty" to exampleService.getSomeProperty()
        )
}