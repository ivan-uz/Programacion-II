package ss;

public class Pagina {
	private int numerodePagina;
	private String contenidoPagina;
	
	public Pagina(int numeroPagina,String contenido) {
		this.numerodePagina=numeroPagina;
		this.contenidoPagina=contenido;
	}
	
	public void mostrarPagina() {
		System.out.println("Pagina "+numerodePagina+" - "+contenidoPagina);
	}
	
	

}
