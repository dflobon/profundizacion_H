package com.grupoh.springbootmvc;

import com.grupoh.springbootmvc.Controller.PaginaController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PaginaControllerTest {

    @Autowired
    private PaginaController paginaController;

    @Test
    public void contextLoads() {
        assertThat(paginaController).isNotNull();
    }
}