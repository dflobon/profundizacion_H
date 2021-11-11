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

    @GetMapping(path = "{paginaId}")
    public Optional<Pagina> getPaginaFromId(@PathVariable("paginaId") Long paginaId) {
        return paginaService.getPaginaFromId(paginaId);
    }
    @GetMapping(path = "/titulo/{titulo}")
    public Pagina getPaginaFromTitulo(@PathVariable("titulo") String titulo) {
        return paginaService.getPaginaFromTitulo(titulo);
    }

    @PostMapping()
    public void createPagina(@RequestBody Pagina pagina) {
        paginaService.addPagina(pagina);
    }
    @DeleteMapping(path = "{paginaId}")
    public void deletePaginaById(@PathVariable("paginaId") Long paginaId){
        paginaService.deletePaginaById(paginaId);
    }
    @DeleteMapping(path = "deleteAll")
    public void deleteAllPaginas() {
        paginaService.deleteAllPaginas();
    }

    @PutMapping(path = "{paginaId}")
    public void updatePaginaById(
            @PathVariable("paginaId") Long paginaId,
            @RequestBody Pagina pagina
    ) {
        paginaService.updatePagina(paginaId, pagina);
    }


}
