package aspectos;

import dominio.*;

public aspect Logging {
	
	String mensajeObtenerCategorias = "Se ha llamado al m�todo para obtener todas las categorias";
	pointcut obtenerCategorias() : call(List<Categorias> *.obtenerTodas());
	
	before() : obtenerCategorias() {
		System.out.println(mensajeObtenerCategorias);
	}
	
	String mensajeObtenerCategoriaPorId = "Se ha llamado al m�todo para obtener una categoria por Id";
	pointcut obtenerCategoriaPorId() : call(Categoria *.ObtenerPorId(Integer));
	
	before() : obtenerCategoriaPorId() {
		System.out.println(mensajeObtenerCategoriaPorId);
	}
	
	String mensajeEliminarCategoria = "Se ha llamado al m�todo eliminar categoria";
	pointcut eliminarCategoria() : call(void *.eliminar(Categoria));
	
	before() : eliminarCategoria() {
		System.out.println(mensajeEliminarCategoria);
	}
}
