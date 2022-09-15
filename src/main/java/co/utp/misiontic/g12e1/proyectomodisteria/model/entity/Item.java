package co.utp.misiontic.g12e1.proyectomodisteria.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Producto producto;
    private Integer cantidad;
}
