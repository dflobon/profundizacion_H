package com.grupoh.springbootmvc.Controller.WEB;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
public class homeController {
        @GetMapping("/")
        public String agregarConsulta(Model model) {
            model.addAttribute("name", "Hola");
            return "AgregarConsulta";
        }
}
