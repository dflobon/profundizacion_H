package com.grupoh.springbootmvc.Controller;

import com.grupoh.springbootmvc.Entity.Pagina;
import com.grupoh.springbootmvc.Service.PaginaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/paginas")
public class PaginaController {
    private final PaginaService paginaService;

    public PaginaController(PaginaService paginaService) {
        this.paginaService = paginaService;
    }

    // ================ WEB =======================
    @GetMapping
    public String paginaIndex(Model model) {
        model.addAttribute("paginas", paginaService.getAllPaginas());
        return "vistaPaginaIndex";
    }
    // ================ WEB =======================
    // ================ API =======================
    @RequestMapping("/api")
    public List<Pagina> getPaginas() {
        return paginaService.getAllPaginas();
    }

    @GetMapping("/api/{titulo}")
    @ResponseBody
    public Pagina getPaginas(@PathVariable("titulo") String titulo) {
        return paginaService.getPagina(titulo);
    }
    // ================ API =======================

}
