package com.grupoh.springbootmvc;

import com.grupoh.springbootmvc.Controller.WEB.PaginaController;
import com.grupoh.springbootmvc.Service.PaginaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PaginaControllerTest {

    @Autowired
    private PaginaController paginaController;
    private PaginaService paginaService;

    @Test
    public void contextLoads() {
        paginaService.getPagina("hola");
        assertThat(paginaController).isNotNull();
    }
}
