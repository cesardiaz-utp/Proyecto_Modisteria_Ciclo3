package co.utp.misiontic.g12e1.proyectomodisteria.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import co.utp.misiontic.g12e1.proyectomodisteria.controller.dto.CheckFiltroDto;
import co.utp.misiontic.g12e1.proyectomodisteria.controller.dto.FiltroDto;
import co.utp.misiontic.g12e1.proyectomodisteria.controller.dto.FiltroRequest;
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
    public String goToCatalog(Model modelo) {
        modelo.addAttribute("page", "index");
        return "index";
    }

    @GetMapping("/shop")
    public String goToShop(Model modelo) {
        System.out.println("get?");

        List<ProductoDto> productos;
        productos = catService.getProductos();
        modelo.addAttribute("productos", productos);

        var filtros = Arrays.asList(

                new FiltroDto("Colegios", Arrays.asList(
                        new CheckFiltroDto("colegioa", "Colegio A", "colegio-a"),
                        new CheckFiltroDto("colegiob", "Colegio B", "colegio-b"))),
                new FiltroDto("Producto", Arrays.asList(
                        new CheckFiltroDto("pantalon", "Pantalon", "pantalon"),
                        new CheckFiltroDto("camisa", "Camisa", "camisa"),
                        new CheckFiltroDto("otros", "Otros", "otros"))),
                new FiltroDto("Tipo de Uniforme", Arrays.asList(
                        new CheckFiltroDto("diario", "Diario", "diario"),
                        new CheckFiltroDto("fisica", "Fisica", "fisica"))));
        modelo.addAttribute("filtros", filtros);

        modelo.addAttribute("page", "shop");

        return "shop";
    }
    @PostMapping("/shop")
    public String goToShopa(@RequestBody FiltroRequest formBody, Model modelo) {

        System.out.println(formBody.isColegioa());
        
        var productos = catService.getProductos();
        modelo.addAttribute("productos", productos);

        var filtros = Arrays.asList(

                new FiltroDto("Colegios", Arrays.asList(
                        new CheckFiltroDto("colegioa", "Colegio A", "colegio-a"),
                        new CheckFiltroDto("colegiob", "Colegio B", "colegio-b"))),
                new FiltroDto("Producto", Arrays.asList(
                        new CheckFiltroDto("pantalon", "Pantalon", "pantalon"),
                        new CheckFiltroDto("camisa", "Camisa", "camisa"),
                        new CheckFiltroDto("otros", "Otros", "otros"))),
                new FiltroDto("Tipo de Uniforme", Arrays.asList(
                        new CheckFiltroDto("diario", "Diario", "diario"),
                        new CheckFiltroDto("fisica", "Fisica", "fisica"))));
        modelo.addAttribute("filtros", filtros);

        modelo.addAttribute("page", "shop");

        return "shop";
    }

    @RequestMapping("/detail")
    public String goToDetail(Model modelo) {
        modelo.addAttribute("page", "detail");
        return "detail";
    }

    @RequestMapping("/cart")
    public String goToCart(Model modelo) {
        modelo.addAttribute("page", "cart");
        return "cart";
    }

    @RequestMapping("/checkout")
    public String goToCheckout(Model modelo) {
        modelo.addAttribute("page", "checkout");
        return "checkout";
    }

    @RequestMapping("/contact")
    public String goToContact(Model modelo) {
        modelo.addAttribute("page", "contact");
        return "contact";
    }
}
