package ss;

public class Biblioteca {
	private String nombreBiblioteca;
	private Libro[] libros;
	private Autor[] autor;
	private Prestamo[] prestamos;
	private Horario horario;
	
	public Biblioteca(String nombreBiblioteca,Libro[] libro,Autor[] autor) {
		this.nombreBiblioteca=nombreBiblioteca;
		this.libros=libro;
		this.autor=autor;
		this.prestamos=new Prestamo[100];
		this.horario=new Horario("lunes a viernes","08:00 ","17:00 ");	
	}
	
	public void agregarLibro(Libro libro) {
		for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = libro;
                break;
            }
        }
	}
	
	public void agregarAutor(Autor autor) {
		for (int i = 0; i < this.autor.length; i++) {
            if (this.autor[i] == null) {
            	this.autor[i] = autor;
                break;
            }
        }
	}
	
	public void prestarLibro(Estudiante estudiante,Libro libro) {
		for (int i = 0; i < prestamos.length; i++) {
            if (prestamos[i] == null) {
                prestamos[i] = new Prestamo(estudiante, libro);
                break;
            }
        }
	}
	public void mostrarEstado() {
		System.out.println("BIBLIOTECA "+nombreBiblioteca);
		horario.mostrarHorario();
		System.out.println("LISTA DE LIBROS");
		for (Libro li : libros) {
            if (li!= null) {
                System.out.println(li.getTitulo());
            }
        }
		System.out.println("LISTA AUTORES");
		for (Autor a : this.autor) {
            if (a!= null) {
                a.mostrarInfo();
            }
        }
		System.out.println("PRESTAMOS");
		for (Prestamo p : prestamos) {
            if (p!= null) {
                p.mostrarInfo();
            }
        }
	}
	public void cerrarBiblioteca() {
		System.out.println("LA BIBLIOTECA "+this.nombreBiblioteca+" HA CERRADO");
		this.prestamos=new Prestamo[100];
	}
}
