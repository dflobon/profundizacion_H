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


    public List<Pagina> getPaginas() {
        return paginaRepository.findAll();
    }

    // Method to get all the paginas in to the DB
    public List<Pagina> getAllPaginas() {
        return paginaRepository.findAll();
    }

}
