package com.grupoh.springbootmvc.Service;

import com.grupoh.springbootmvc.Entity.Pagina;
import com.grupoh.springbootmvc.Entity.Usuario;
import com.grupoh.springbootmvc.Repository.PaginaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class PaginaService {
    private final PaginaRepository paginaRepository;

    @Autowired
    public PaginaService(PaginaRepository paginaRepository) {
        this.paginaRepository = paginaRepository;
    }


    public Pagina getPaginaFromTitulo(String titulo) {
        Pagina paginaEnc = paginaRepository.findPaginaByTitulo(titulo);
        if (paginaEnc != null) {
            return paginaEnc;
        } else throw new NoSuchElementException(
                "No existe una pagina con titulo " + titulo + " en la BD"
        );
    }

    // Method to delete all paginas into the DB
    public void deleteAllPaginas() {
        if (!paginaRepository.findAll().isEmpty()) {
            paginaRepository.deleteAll();
        } else throw new NoSuchElementException(
                "No se encuentran paginas en la BD"
        );

    }

    // Method to save all paginas into the DB
    public void saveAllPaginas(List<Pagina> lista) {
        paginaRepository.saveAll(lista);
    }

    // Method to get all the paginas in to the DB
    public List<Pagina> getAllPaginas() {
        List<Pagina> paginas = paginaRepository.findAll();
        if (!paginas.isEmpty()) {
            return paginas;
        } else throw new NoSuchElementException(
                "No se encuentran páginas en la BD"
        );
    }

    public Optional<Pagina> getPaginaFromId(Long paginaId) {
        if (paginaRepository.existsById(paginaId)) {
            return paginaRepository.findById(paginaId);
        } else throw new NoSuchElementException(
                "Pagina con id " + paginaId + " no existe en la BD"
        );

    }

    public void addPagina(Pagina pagina) {
        Long idPag = pagina.getId();
        if (idPag != null) {
            if (!paginaRepository.existsById(idPag)){
                paginaRepository.save(pagina);
            } else throw new IllegalStateException(
                    "La pagina con id " + idPag + " ya existe. Inserte una pagina sin id para que se asigne automaticamente"
            );
        } else paginaRepository.save(pagina);
        System.out.println(pagina);

    }

    public void deletePaginaById(Long paginaId) {
        if (paginaRepository.existsById(paginaId)) {
            paginaRepository.deleteById(paginaId);
        } else throw new NoSuchElementException(
                "Pagina con id " + paginaId + " no existe"
        );
    }

    public void updatePagina(Long paginaId, Pagina pagina) {
        if (paginaRepository.existsById(paginaId)) {
            pagina.setId(paginaId);
            paginaRepository.save(pagina);
            System.out.println(pagina);
        } else throw new NoSuchElementException(
                "Compania con id " + paginaId + " no existe"
        );
    }

    public List<Pagina> getUserPages( Usuario u ) {
        List<Pagina> paginasUser = paginaRepository.getUserPages(u.getId());
        if (!paginasUser.isEmpty()) {
            return paginasUser;
        } else throw new NoSuchElementException(
                "El usuario con id " + u.getId() + " no tiene paginas asignadas"
        );
    }
}
