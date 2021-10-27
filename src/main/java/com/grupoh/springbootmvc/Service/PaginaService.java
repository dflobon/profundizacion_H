package com.grupoh.springbootmvc.Service;

import com.grupoh.springbootmvc.Entity.Pagina;
import com.grupoh.springbootmvc.Repository.PaginaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaginaService {
    private final PaginaRepository paginaRepository;

    @Autowired
    public PaginaService(PaginaRepository paginaRepository) {
        this.paginaRepository = paginaRepository;
    }


    public Pagina getPagina(String titulo) {
        return paginaRepository.findPaginaByTitulo(titulo);
    }

    // Method to save all paginas into the DB
    public void saveAllPaginas(List<Pagina> lista) {
        paginaRepository.saveAll(lista);
    }

    // Method to get all the paginas in to the DB
    public List<Pagina> getAllPaginas() {
        return paginaRepository.findAll();
    }

}
