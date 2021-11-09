package com.grupoh.springbootmvc.Service;

import com.grupoh.springbootmvc.Entity.Pagina;
import com.grupoh.springbootmvc.Entity.Usuario;
import com.grupoh.springbootmvc.Repository.PaginaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

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

    // Method to delete all paginas into the DB
    public void deleteAllPaginas() {
        paginaRepository.deleteAll();
    }

    // Method to save all paginas into the DB
    public void saveAllPaginas(List<Pagina> lista) {
        paginaRepository.saveAll(lista);
    }

    // Method to get all the paginas in to the DB
    public List<Pagina> getAllPaginas() {
        return paginaRepository.findAll();
    }

    public Optional<Pagina> getPaginaFromId(Long paginaId) {
        return paginaRepository.findById(paginaId);
    }

    public void addPagina(Pagina pagina) {
        paginaRepository.save(pagina);
        System.out.println(pagina);
    }

    public void deletePaginaById(Long paginaId) {
        if (paginaRepository.existsById(paginaId)) {
            paginaRepository.deleteById(paginaId);
        } else throw new IllegalStateException(
                "Pagina con id " + paginaId + " no existe"
        );
    }

    public void updatePagina(Long paginaId, Pagina pagina) {
        if (paginaRepository.existsById(paginaId)) {
            pagina.setId(paginaId);
            paginaRepository.save(pagina);
            System.out.println(pagina);
        } else throw new IllegalStateException(
                "Compania con id " + paginaId + " no existe"
        );
    }

    public List<Pagina> getUserPages( Usuario u ) {
        return paginaRepository.getUserPages(u.getId());
    }
}
