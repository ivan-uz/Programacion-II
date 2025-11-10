package ss;

public class Prestamo {
	private String fechaPrestamo;
	private String fechaDevolucion;
	private Estudiante estudiante;
	private Libro libro;
	
	public Prestamo(Estudiante estudiante,Libro libro) {
		this.fechaPrestamo="01/01/2025";
		this.fechaDevolucion="07/01/2025";;
		this.estudiante=estudiante;
		this.libro=libro;
	}
	
	public void mostrarInfo() {
		System.out.println("PRESTAMO");
		estudiante.mostrarInfo();
		System.out.println("LIBRO: "+libro.getTitulo());
		System.out.println("FECHA PRESTAMO: "+fechaPrestamo);
		System.out.println("FECHA DEVOLUCION: "+fechaDevolucion);
	}
	
	

}
