package co.utp.misiontic.g12e1.proyectomodisteria.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.utp.misiontic.g12e1.proyectomodisteria.model.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{

    // List<Producto> findAllByCategoriaIdIn(List<Long> tags);

    // Optional<Producto> findAllByCategoriaId(Long categoriaId);
    
    List<Producto> findAllByPrecio(Integer p);
}
