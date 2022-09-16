package co.utp.misiontic.g12e1.proyectomodisteria.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProducto;

    @Column(name = "Nombre" , nullable = false , length = 100)
    private String name;
    @Column(name = "Precio", nullable = false, length = 100)
    private Integer precio;
    @Column(name = "Descripcion" , nullable = false , length = 255)
    private String descripcion;
    

    //-------RELACIONES
    @ManyToMany
    @JoinTable(name = "Categoria",
    joinColumns=@JoinColumn(name="ID_Producto"),
    inverseJoinColumns=@JoinColumn(name="ID_Categoria"))
    private List<Categoria> categorias;

    @JoinTable(name = "Talla",
    joinColumns=@JoinColumn(name="ID_Producto"),
    inverseJoinColumns=@JoinColumn(name="ID_Talla"))
    @ManyToMany
    private List<Talla> tallas;

    
    @OneToMany(mappedBy = "idProducto")
    private List<Item> compras;
    
}
