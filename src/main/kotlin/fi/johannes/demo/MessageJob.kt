package fi.johannes.demo

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component


/**
 * Johannes on 21.7.2022.
 */
@Component
class MessageJob(private val props: AppProps) {

    @Scheduled(fixedDelay = 3000)
    fun printer() {
        println("${props.id} message is: ${props.message}")
    }
}

