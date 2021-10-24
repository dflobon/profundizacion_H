package com.grupoh.springbootmvc.pagina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaginaService {
    private final PaginaRepository paginaRepository;

    public PaginaService(PaginaRepository paginaRepository) {
        this.paginaRepository = paginaRepository;
    }

    @Autowired
    public List<Pagina> getPaginas() {
        return paginaRepository.findAll();
    }

}
