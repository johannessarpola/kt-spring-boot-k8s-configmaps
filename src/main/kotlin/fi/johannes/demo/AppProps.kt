package fi.johannes.demo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.context.annotation.Configuration

/**
 * Johannes on 19.7.2022.
 */
@ConstructorBinding
@Configuration
@ConfigurationProperties(prefix = "app")
class AppProps {
    lateinit var id: String
    lateinit var message: String
}