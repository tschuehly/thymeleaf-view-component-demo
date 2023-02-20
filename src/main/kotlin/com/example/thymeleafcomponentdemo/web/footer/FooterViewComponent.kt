package com.example.thymeleafcomponentdemo.web.footer

import com.example.thymeleafcomponentdemo.core.ExampleService
import de.tschuehly.thymeleafviewcomponent.ViewComponent

@ViewComponent
class FooterViewComponent (
    private val exampleService: ExampleService,
    ) {
        fun render() : Any = mapOf(
            "someProperty" to exampleService.getSomeProperty()
        )
}