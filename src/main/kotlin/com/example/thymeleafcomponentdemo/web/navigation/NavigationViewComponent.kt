package com.example.thymeleafcomponentdemo.web.navigation


import com.example.thymeleafcomponentdemo.core.ExampleService
import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewComponentContext

@ViewComponent
class NavigationViewComponent(
    private val exampleService: ExampleService
) {
    fun render() = ViewComponentContext(
            "someOtherProperty" to exampleService.getSomeOtherProperty()
    )
}