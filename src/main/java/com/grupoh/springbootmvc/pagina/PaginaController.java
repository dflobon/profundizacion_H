package com.grupoh.springbootmvc.pagina;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/paginas")
public class PaginaController {
    private final PaginaService paginaService;

    public PaginaController(PaginaService paginaService) {
        this.paginaService = paginaService;
    }

    @GetMapping
    public String paginaIndex(Model model) {
        model.addAttribute("paginas", paginaService.getPaginas());
        return "vistaPaginaIndex";
    }

    @GetMapping("/api")
    public List<Pagina> getPaginas() {
        return paginaService.getPaginas();
    }

}
