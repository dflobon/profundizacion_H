package com.grupoh.springbootmvc.Controller.API;

import com.grupoh.springbootmvc.Service.PaginaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerPaginaAPI {

    public PaginaService paginaService;

    public ControllerPaginaAPI(PaginaService paginaService) {
        this.paginaService = paginaService;
    }
}
