package co.utp.misiontic.g12e1.proyectomodisteria.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

import co.utp.misiontic.g12e1.proyectomodisteria.model.entity.PK.ItemId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@IdClass(ItemId.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id
    private Long idPedido;

    @Id
    private Integer idProducto;

    @Column(name = "Cantidad", nullable = false)
    private Integer cantidad;

    //-------RELACIONES

    @ManyToOne
    private Pedido pedido;
    @ManyToOne
    private Producto producto;
}
