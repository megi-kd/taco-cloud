package tacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Slf4j
@Configuration
public class WebConfigForNoHomeController implements WebMvcConfigurer {

    //View controllers can be used to handle HTTP GET requests for which no model data or
    //processing is required
    //this method can be also added to SpringBootApplication class, where main method is declared
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        log.info("Handling /secondHome without controller");
        registry.addViewController("/secondHome").setViewName("secondHome");
    }
}
