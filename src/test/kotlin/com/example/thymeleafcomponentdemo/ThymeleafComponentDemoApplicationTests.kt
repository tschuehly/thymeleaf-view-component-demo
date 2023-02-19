package com.example.thymeleafcomponentdemo

import com.example.thymeleafcomponentdemo.web.home.HomeViewComponent
import com.example.thymeleafcomponentdemo.web.navigation.NavigationViewComponent
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class ThymeleafComponentDemoApplicationTests {

    @Autowired
    lateinit var homeViewComponent: HomeViewComponent
    @Autowired
    lateinit var navigationViewComponent: NavigationViewComponent
    val restTemplate = TestRestTemplate()

    @Test
    fun testHomeRender(){
        homeViewComponent.render().also {
            println(it)
        }
    }

    @Test
    fun testNavRender(){
        navigationViewComponent.render().also {
            println(it)
        }
    }
    @Test
    fun getIndexPage(){
        restTemplate.getForEntity("http://localhost:8080/",String::class.java).also {
            println(it)
        }
    }
}
