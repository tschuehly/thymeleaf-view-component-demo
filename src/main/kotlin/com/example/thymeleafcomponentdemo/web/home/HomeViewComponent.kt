package com.example.thymeleafcomponentdemo.web.home

import com.example.thymeleafcomponentdemo.core.ExampleService
import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewComponentContext
import org.springframework.web.bind.annotation.ResponseBody

@ViewComponent
class HomeViewComponent(
    private val exampleService: ExampleService,
) {
    fun render() = ViewComponentContext(
        mapOf(
            "helloWorld" to exampleService.getHelloWorld(),
            "coffee" to exampleService.getCoffee()
        )
    )
}