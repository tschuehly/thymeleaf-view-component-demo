package com.example.thymeleafcomponentdemo.web

import com.example.thymeleafcomponentdemo.web.home.HomeViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Router(
    val homeViewComponent: HomeViewComponent
) {
    @GetMapping( "/")
    fun homeComponent(): ViewContext {
        return homeViewComponent.render()
    }
}