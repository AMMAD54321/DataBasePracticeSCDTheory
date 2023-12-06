package com.com;
// Import statements
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class SemesterProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SemesterProjectApplication.class, args);
    }
}
@Controller
class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/details")
    public String details() {
        return "details";
    }


}