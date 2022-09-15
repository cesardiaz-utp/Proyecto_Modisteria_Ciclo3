package co.utp.misiontic.g12e1.proyectomodisteria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
    private Integer id;
    private String name;
    private String descripcion;
    public Categoria(Integer id, String name) {
        this.id = id;
        this.name = name;
    }    
}
