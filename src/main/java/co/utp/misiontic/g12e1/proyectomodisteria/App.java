package co.utp.misiontic.g12e1.proyectomodisteria;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import co.utp.misiontic.g12e1.proyectomodisteria.model.entity.Categoria;
import co.utp.misiontic.g12e1.proyectomodisteria.model.entity.Producto;
import co.utp.misiontic.g12e1.proyectomodisteria.model.repository.CategoriaRepository;
import co.utp.misiontic.g12e1.proyectomodisteria.model.repository.ProductoRepository;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Component	
	private class DataLoader implements CommandLineRunner {

		private ProductoRepository productoRepository;
		private CategoriaRepository categoriaRepository;

		@Override
		public void run(String... args) throws Exception {
			System.out.println("-----LOAD DATA----------");
			loadData();

		}

		private void loadData() {
			// loadCategories();
			// loadProducto();
		}

		

		private void loadCategories() {
			categoriaRepository.saveAll(Arrays.asList(
					new Categoria(1001L,"Pantalon"),
					new Categoria(1002L,"Camisa"),
					new Categoria(1003L,"Otros"),
					new Categoria(1004L,"Colegio A"),
					new Categoria(1005L,"Colegio B"),
					new Categoria(1006L,"Fisica"),
					new Categoria(1007L,"Diario"),
					new Categoria(1008L,"Preescolar")));
		}

		private void loadProducto(){
			productoRepository.saveAll(Arrays.asList(
				new Producto ("Pantalon Diario", 50.0, "img/product-4.jpg"),
				new Producto ("Camisa Fisica", 30.0, "img/product-5.jpg")
			));
		}
	}

}
