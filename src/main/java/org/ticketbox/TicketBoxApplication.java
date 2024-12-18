package org.ticketbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TicketBoxApplication {

    @RequestMapping("/")
    String home() {
        String testEnv = System.getenv("TEST_ENV");
        System.out.println("TEST_ENV: " + testEnv);

        return "Test Api";
    }

    public static void main(String[] args) {
        SpringApplication.run(TicketBoxApplication.class, args);
    }

}
