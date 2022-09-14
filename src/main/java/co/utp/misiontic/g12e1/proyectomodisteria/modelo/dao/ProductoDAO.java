package co.utp.misiontic.g12e1.proyectomodisteria.modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.utp.misiontic.g12e1.proyectomodisteria.modelo.Categoria;
import co.utp.misiontic.g12e1.proyectomodisteria.modelo.Producto;
import co.utp.misiontic.g12e1.proyectomodisteria.util.JDBCUtilities;

public class ProductoDAO {
    public List<Producto> listarProductos() throws SQLException {
        var listaProductos = new ArrayList<Producto>();

        var statement = JDBCUtilities.getConnection().createStatement();
        var rset = statement.executeQuery("SELECT MAX(id) AS id FROM Pedido");

        try {
            while (rset.next()) {
                var p = new Producto(
                        rset.getInt("ID_Producto"),
                        rset.getString("Nombre"),
                        rset.getInt("Precio"),
                        rset.getString("Descripcion"));
                var categorias=listarCategorias(p.getId());
            }
        } finally {
            if(statement!=null){
                statement.close();
            }
            if(rset!=null){
                rset.close();
            }
        }
        return null;
    }

    public void listarColegio() {

    }

    public List<Categoria>listarCategorias(Integer id) throws SQLException{

        var listaCategorias = new ArrayList<Categoria>();

        var pstatement = JDBCUtilities.getConnection().prepareStatement("
                                SELECT * FROM Producto JOIN Tag USING (ID_Producto) JOIN Categoria USING(ID_Categoria) 
                                WHERE");
        pstatement.setInt(1, id);
        var rset = statement.executeQuery("SELECT MAX(id) AS id FROM Pedido");

        try {
            while (rset.next()) {
                var p = new Producto(
                        rset.getInt("ID_Producto"),
                        rset.getString("Nombre"),
                        rset.getInt("Precio"),
                        rset.getString("Descripcion"));
                var categorias=listarCategorias(p.getId());
            }
        } finally {
            if(statement!=null){
                statement.close();
            }
            if(rset!=null){
                rset.close();
            }
        }
        return null;
    }
}
