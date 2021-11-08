package com.grupoh.springbootmvc.Repository;

import com.grupoh.springbootmvc.Entity.Pagina;
import com.grupoh.springbootmvc.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PaginaRepository extends JpaRepository<Pagina, Long> {

    // @Query("SELECT s FROM Pagina s WHERE s.titulo = ?1")
    Pagina findPaginaByTitulo(String titulo);
    List<Pagina> findAll();

    @Query(
            value = "SELECT * FROM pagina p WHERE u.status = 1" +
                    "SELECT p.id, p.tipo, p.pagWeb, p.titulo, p.contenido, p.obsoleto, p.fecha, p.imagen" +
                    "            FROM usuariopagina up" +
                    "            INNER JOIN pagina p ON p.id = up.id" +
                    "            WHERE up.user_id = ?1",
            nativeQuery = true

            )
    List<Pagina> getUserPages(Long idUsuario);
}
