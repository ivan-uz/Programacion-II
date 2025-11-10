package ss;

public class Autor {
	private String nombre;
	private String nacionalidad;
	
	public Autor(String nombre,String nacionalidad) {
		this.nombre=nombre;
		this.nacionalidad=nacionalidad;
	}
	
	public void mostrarInfo() {
		System.out.println("NOMBRE: " +nombre);
		System.out.println("NACIONALIDAD: "+ nacionalidad);
	}
	

}
