package co.utp.misiontic.g12e1.proyectomodisteria.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.utp.misiontic.g12e1.proyectomodisteria.controller.dto.ProductoDto;
import co.utp.misiontic.g12e1.proyectomodisteria.service.CatalogoService;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CatalogoController {

    private CatalogoService catService;

    public CatalogoController(CatalogoService catService) {
        this.catService = catService;
    }

    @GetMapping(value = { "/", "/index", "/index.html" })
    public String goToCatalog(Model modelo){
        modelo.addAttribute("page", "index");
        return "index";
    }

    @RequestMapping("/shop")
    public String goToShop(Model modelo){


        var productos = Arrays.asList(
            new ProductoDto(1001,50.0,"CAMISA TEST","img/product-4.jpg")
        );

        modelo.addAttribute("productos", productos);
        modelo.addAttribute("page", "shop");

        return "shop";
    }

    @RequestMapping("/detail")
    public String goToDetail(Model modelo){
        modelo.addAttribute("page", "detail");
        return "detail";
    }
    @RequestMapping("/cart")
    public String goToCart(Model modelo){
        modelo.addAttribute("page", "cart");
        return "cart";
    }
    @RequestMapping("/checkout")
    public String goToCheckout(Model modelo){
        modelo.addAttribute("page", "checkout");
        return "checkout";
    }
    @RequestMapping("/contact")
    public String goToContact(Model modelo){
        modelo.addAttribute("page", "contact");
        return "contact";
    }
}
