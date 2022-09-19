package co.utp.misiontic.g12e1.proyectomodisteria.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
// @IdClass(ItemId.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
// @Table(uniqueConstraints={@UniqueConstraint(columnNames = {"pedido" , "producto"})})
public class Item implements Serializable{

    @Embeddable
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class ItemPk implements Serializable {
        //-------RELACIONES
        @ManyToOne
        @JoinColumn(name = "id_producto")
        private Producto producto;

        @ManyToOne
        @JoinColumn(name = "id_pedido")
        private Pedido pedido;

    }

    @EmbeddedId
    private ItemPk id;

    @Column(nullable = false)
    private Integer cantidad;

    
}
