package com.example.thymeleafcomponentdemo.web

import com.example.thymeleafcomponentdemo.web.home.HomeViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewComponentContext
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Router(
    val homeViewComponent: HomeViewComponent
) {
    @GetMapping( "/")
    fun homeComponent(): ViewComponentContext {
        return homeViewComponent.render()
    }
}