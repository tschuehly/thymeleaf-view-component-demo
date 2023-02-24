package com.example.thymeleafcomponentdemo.web

import com.example.thymeleafcomponentdemo.web.home.HomeViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewComponentContext
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.ModelAndView

@Controller
class Router(
    val homeViewComponent: HomeViewComponent
) {
    @GetMapping( "/")
//    @ResponseBody
    fun homeComponent(): ViewComponentContext {
        return homeViewComponent.render()
    }

    @GetMapping("/test")
    fun test() = ModelAndView("test", mapOf("test" to "test 2"))
}