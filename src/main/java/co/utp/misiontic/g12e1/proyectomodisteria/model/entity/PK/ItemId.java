package co.utp.misiontic.g12e1.proyectomodisteria.model.entity.PK;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemId implements Serializable{
    private Integer idPedido;
    private Integer idProducto;
}
