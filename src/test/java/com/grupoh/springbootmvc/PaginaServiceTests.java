package com.grupoh.springbootmvc;

import com.grupoh.springbootmvc.Entity.Pagina;
import com.grupoh.springbootmvc.Repository.PaginaRepository;
import com.grupoh.springbootmvc.Service.PaginaService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Conjunto de tests sobre la clase PaginaService")
public class PaginaServiceTests {

    @Autowired
    PaginaService paginaService;

    @DisplayName("Test que inserta varias páginas y luego las consulta")
    @Test
    public void insertarVariasPaginas() {


        Pagina uno = new Pagina(
                "Tipo 1",
                "www.pagina1.es",
                "Título 1",
                "Contenido de la página 1",
                "url a la imagen 1"
        );

        Pagina dos = new Pagina(
                "Tipo 2",
                "www.pagina2.com",
                "Título 2",
                "Contenido de la página 2",
                "url a la imagen 2"
        );

        Pagina tres = new Pagina(
                "Tipo 3",
                "www.pagina3.gal",
                "Título 3",
                "Contenido de la página 3",
                "url a la imagen 3"
        );

        List<Pagina> paginasAGuardar = List.of(uno, dos, tres);

        //Se guardan las páginas
        paginaService.saveAllPaginas(paginasAGuardar);

        //Se buscan las páginas y se mira que sean iguales a las insertadas
        List<Pagina> paginasBuscadas = paginaService.getAllPaginas();


        //Se comparan ambas listas
        assertTrue(paginasAGuardar.size() == paginasBuscadas.size()
                && paginasAGuardar.containsAll(paginasBuscadas)
                && paginasBuscadas.containsAll(paginasAGuardar));
    }
}
