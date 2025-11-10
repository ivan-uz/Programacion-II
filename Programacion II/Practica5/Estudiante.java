package ss;

public class Estudiante {
	private String codigoEstudiante;
	private String nombre;
	
	public Estudiante(String codigo,String nombre) {
		this.codigoEstudiante=codigo;
		this.nombre=nombre;
	}
	
	public void mostrarInfo() {
		System.out.println("CODIGO: "+codigoEstudiante);
		System.out.println("NOMBRE: "+nombre);
	}
	
	
}
