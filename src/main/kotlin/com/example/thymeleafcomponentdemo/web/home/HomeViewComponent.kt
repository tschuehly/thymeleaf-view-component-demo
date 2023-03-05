package com.example.thymeleafcomponentdemo.web.home

import com.example.thymeleafcomponentdemo.core.ExampleService
import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import de.tschuehly.thymeleafviewcomponent.toProperty

@ViewComponent
class HomeViewComponent(
    private val exampleService: ExampleService,
) {
    fun render() = ViewContext(
            "helloWorld" toProperty exampleService.getHelloWorld(),
            "coffee" toProperty exampleService.getCoffee()
    )
}
