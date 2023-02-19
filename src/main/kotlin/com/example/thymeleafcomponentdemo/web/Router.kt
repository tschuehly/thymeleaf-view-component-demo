package com.example.thymeleafcomponentdemo.web

import com.example.thymeleafcomponentdemo.web.home.HomeViewComponent
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class Router(
    val homeViewComponent: HomeViewComponent
) {
    @GetMapping( "/", produces = [MediaType.TEXT_HTML_VALUE])
    @ResponseBody
    fun homeComponent(): String {
        return homeViewComponent.render()
    }
}