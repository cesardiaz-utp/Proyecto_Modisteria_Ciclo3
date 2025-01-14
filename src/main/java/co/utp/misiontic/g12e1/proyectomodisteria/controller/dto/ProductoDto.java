package co.utp.misiontic.g12e1.proyectomodisteria.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {
    private Integer id;
    private Double precio;
    private String nombre;
    private String imageUrl;
    
}
