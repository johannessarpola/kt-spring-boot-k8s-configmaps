package fi.johannes.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

/**
 * Johannes on 19.7.2022.
 */
@Controller
class MessageController(private val props: AppProps) {

    @GetMapping("/")
    fun message(model: Model): String {

        model["title"] = props.id
        model["message"] = props.message
        return "index"
    }

}