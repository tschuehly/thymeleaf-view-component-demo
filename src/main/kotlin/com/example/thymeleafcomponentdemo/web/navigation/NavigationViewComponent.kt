package com.example.thymeleafcomponentdemo.web.navigation


import com.example.thymeleafcomponentdemo.core.ExampleService
import org.springframework.stereotype.Component
import org.thymeleaf.context.Context
import org.thymeleaf.spring6.SpringTemplateEngine

@Component
class NavigationViewComponent(
    private val exampleService: ExampleService,
    private val templateEngine: SpringTemplateEngine
) {

    fun data(context: Context) {
        context.setVariable("someOtherProperty", exampleService.getSomeOtherProperty())
    }

    fun render(): String {
        val myContext = Context()
        data(myContext)
        return templateEngine.process("NavigationViewComponent.html", myContext)
    }
}