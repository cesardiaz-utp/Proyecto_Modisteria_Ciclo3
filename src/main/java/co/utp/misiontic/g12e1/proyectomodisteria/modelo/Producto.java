package co.utp.misiontic.g12e1.proyectomodisteria.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private Integer id;
    private String name;
    private Integer precio;
    private Categoria categorias[];
    private String descripcion;
    
    public Producto(Integer id, String name, Integer precio, String descripcion) {
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.descripcion=descripcion;
    }
    
}
