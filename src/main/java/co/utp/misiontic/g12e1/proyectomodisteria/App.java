package co.utp.misiontic.g12e1.proyectomodisteria;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.utp.misiontic.g12e1.proyectomodisteria.model.entity.Categoria;
import co.utp.misiontic.g12e1.proyectomodisteria.model.entity.Producto;
import co.utp.misiontic.g12e1.proyectomodisteria.model.repository.CategoriaRepository;
import co.utp.misiontic.g12e1.proyectomodisteria.model.repository.ProductoRepository;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	private class DataLoader implements CommandLineRunner {

		private ProductoRepository productoRepository;
		private CategoriaRepository categoriaRepository;

		@Override
		public void run(String... args) throws Exception {
			loadData();

		}

		private void loadData() {
			// loadCategories();
			// loadProducto();
		}

		private void loadCategories() {
			categoriaRepository.saveAll(Arrays.asList(
					new Categoria("Pantalon"),
					new Categoria("Camisa"),
					new Categoria("Otros"),
					new Categoria("Colegio A"),
					new Categoria("Colegio B"),
					new Categoria("Fisica"),
					new Categoria("Diario"),
					new Categoria("Preescolar")));
		}

		private void loadProducto(){
			productoRepository.saveAll(Arrays.asList(
				new Producto ("Pantalon Diario", 50.0, "img/product-4.jpg"),
				new Producto ("Camisa Fisica", 30.0, "img/product-5.jpg")
			));
		}
	}

}
