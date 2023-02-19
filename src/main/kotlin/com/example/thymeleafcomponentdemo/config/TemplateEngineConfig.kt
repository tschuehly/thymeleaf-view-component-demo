package com.example.thymeleafcomponentdemo.config

import org.thymeleaf.spring6.SpringTemplateEngine
import org.thymeleaf.templateresolver.FileTemplateResolver
import org.thymeleaf.templateresolver.ITemplateResolver

class TemplateEngineConfig {

    companion object {
        fun templateEngine(clazz: Class<*>): SpringTemplateEngine {
            val templateEngine = SpringTemplateEngine()
            templateEngine.addTemplateResolver(templateResolver(clazz))
            return templateEngine
        }

        private fun templateResolver(clazz: Class<*>): ITemplateResolver {
            val resolver = FileTemplateResolver()
            resolver.setPrefix("src/main/kotlin/" + clazz.packageName.replace(".", "/") + "/")
            resolver.setSuffix(".html")
            resolver.setTemplateMode("HTML")
            resolver.setOrder(1)
            resolver.setCacheable(true)
            return resolver
        }
    }
}