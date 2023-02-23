package com.example.thymeleafcomponentdemo.web

import com.example.thymeleafcomponentdemo.web.home.HomeViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewComponentContext
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class Router(
    val homeViewComponent: HomeViewComponent
) {
    @GetMapping( "/")
    @ResponseBody
    fun homeComponent(): ViewComponentContext {
        return homeViewComponent.render()
    }

    @GetMapping("/test")
    @ResponseBody
    fun test() = "test"
}