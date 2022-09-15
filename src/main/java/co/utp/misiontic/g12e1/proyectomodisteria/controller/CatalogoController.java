package co.utp.misiontic.g12e1.proyectomodisteria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.utp.misiontic.g12e1.proyectomodisteria.service.CatalogoService;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CatalogoController {

    private CatalogoService catService;

    public CatalogoController(CatalogoService catService) {
        this.catService = catService;
    }

    @RequestMapping("/catalog")
    public String goToCatalog(Model modelo){
        return "catalog";
    }
}
