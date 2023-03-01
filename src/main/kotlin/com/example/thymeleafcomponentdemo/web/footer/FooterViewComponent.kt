package com.example.thymeleafcomponentdemo.web.footer

import com.example.thymeleafcomponentdemo.core.ExampleService
import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewComponentContext

@ViewComponent
class FooterViewComponent (
    private val exampleService: ExampleService,
    ) {
        fun render() = ViewComponentContext(
            "helloWorld" to exampleService.getHelloWorld()
        )
}