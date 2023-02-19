package com.example.thymeleafcomponentdemo.web.home

import com.example.thymeleafcomponentdemo.core.ExampleService
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component
import org.thymeleaf.context.Context
import org.thymeleaf.spring6.SpringTemplateEngine
import org.thymeleaf.spring6.expression.ThymeleafEvaluationContext

@Component
class HomeViewComponent(
    private val exampleService: ExampleService,
    private val templateEngine: SpringTemplateEngine,
    private val applicationContext: ApplicationContext
) {

    fun data(context: Context) {
        context.setVariable("myProperty", exampleService.getSomeProperty())
    }

    fun render(): String {
        val myContext = Context()
        data(myContext)
        myContext.setVariable(
            ThymeleafEvaluationContext.THYMELEAF_EVALUATION_CONTEXT_CONTEXT_VARIABLE_NAME,
            ThymeleafEvaluationContext(applicationContext, null)
        )
        return templateEngine.process("HomeViewComponent.html", myContext)
    }
}