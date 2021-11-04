package com.grupoh.springbootmvc.Controller.API;

import com.grupoh.springbootmvc.Entity.Pagina;
import com.grupoh.springbootmvc.Service.PaginaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/paginas")
public class ControllerPaginaAPI {

    public PaginaService paginaService;

    public ControllerPaginaAPI(PaginaService paginaService) {
        this.paginaService = paginaService;
    }

    @RequestMapping()
    public List<Pagina> getPaginas() {
        return paginaService.getAllPaginas();
    }

    @GetMapping("{paginaId}")
    public Optional<Pagina> getPaginaFromId(@PathVariable("paginaId") Long paginaId) {
        return paginaService.getPaginaFromId(paginaId);
    }
    @PostMapping()
    public void createPagina(@RequestBody Pagina pagina) {
        paginaService.addPagina(pagina);
    }


}
