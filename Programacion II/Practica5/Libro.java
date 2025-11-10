package ss;

public class Libro {
	private String Titulo;
	private int ISBN;
	private Pagina[] paginas;
	
	public String getTitulo() {
		return Titulo;
	}
	public Libro(String titulo,int ISBN,Pagina[] paginas) {
		this.Titulo=titulo;
		this.ISBN=ISBN;
		this.paginas=new Pagina[paginas.length];
		
		for (int i = 0; i < paginas.length; i++) {
            this.paginas[i] = paginas[i];
        }
		
		
		
	}
	public void leer() {
		for(Pagina p:paginas) {
			p.mostrarPagina();;
		}
	}

}
