package com.example.thymeleafcomponentdemo.web

import com.example.thymeleafcomponentdemo.web.home.HomeViewComponent
import com.example.thymeleafcomponentdemo.web.navigation.NavigationViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import de.tschuehly.thymeleafviewcomponent.ViewContextContainer
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class Router(
    val homeViewComponent: HomeViewComponent,
    private val navigationViewComponent: NavigationViewComponent
) {
    @GetMapping( "/")
    fun homeComponent(): ViewContext {
        return homeViewComponent.render()
    }

    @GetMapping("/oob-test")
    fun multipleComponent(): ViewContextContainer{
        return ViewContextContainer(
            navigationViewComponent.render(),
            homeViewComponent.render()
        )
    }
}