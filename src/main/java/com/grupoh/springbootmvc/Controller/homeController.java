package com.grupoh.springbootmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

public class homeController {
    @Controller
    class HomeController {

        @GetMapping("/")
        String index(Principal principal) {
            return principal != null ? "vistaDefault" : "logina";
        }

    }
}
