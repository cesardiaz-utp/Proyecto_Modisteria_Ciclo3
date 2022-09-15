package co.utp.misiontic.g12e1.proyectomodisteria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
    private Integer pedidoId;
    private Integer clienteId;
    private Integer precio;
    private Item items[];
}
