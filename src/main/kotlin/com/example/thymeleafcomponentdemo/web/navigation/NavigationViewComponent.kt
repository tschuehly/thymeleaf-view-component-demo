package com.example.thymeleafcomponentdemo.web.navigation


import com.example.thymeleafcomponentdemo.core.ExampleService
import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import de.tschuehly.thymeleafviewcomponent.toProperty

@ViewComponent
class NavigationViewComponent(
    private val exampleService: ExampleService
) {
    var counter = 0
    fun render(): ViewContext {
        counter = counter.plus(1)
        return ViewContext(
            "someOtherProperty" toProperty exampleService.getSomeOtherProperty(),
            "counter" toProperty counter
        )
    }
}