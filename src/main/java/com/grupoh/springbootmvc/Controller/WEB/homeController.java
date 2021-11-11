package com.grupoh.springbootmvc.Controller.WEB;

import com.grupoh.springbootmvc.Service.PaginaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;

@Controller
@RequestMapping("/paginas")
public class homeController {
    private PaginaService paginaService;
    public homeController(PaginaService paginaService) {this.paginaService = paginaService;}

    @GetMapping
    public String paginaIndex(Model model) {
        model.addAttribute("paginas", paginaService.getAllPaginas());
        return "vistaPaginaIndex";
    }
}
