package com.grupoh.springbootmvc.pagina;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PaginaRepository extends JpaRepository<Pagina, Long> {

    // @Query("SELECT s FROM Pagina s WHERE s.titulo = ?1")
    Optional<Pagina> findPaginaByTitulo(String titulo);

}
