package ss;
public class Test {
	public static void main(String[] args) {
		Autor a1=new Autor("Nataniel Aguirre","Boliviana");
		Autor a2=new Autor("Jaime Saenz","Boliviano");
		Autor a3=new Autor("Marcelo Quiroga Santa Cruz","Boliviano");
	
		Pagina[] paginas= {
				new Pagina(1,"uno"),
				new Pagina(2,"dos"),
				new Pagina(3,"tres")
		};
		Pagina[] paginas2= {
				new Pagina(4,"cuatro"),
				new Pagina(5,"cinco"),
				new Pagina(6,"seis")
		};
		Pagina[] paginas3= {
				new Pagina(7,"siete"),
				new Pagina(8,"ocho"),
				new Pagina(9,"nueve")
		};
	    Libro l1 = new Libro("Los Rosales en invierno",123,paginas);
	    String[] contenido2= {
				"cuatro","cinco","seis"
		};
	    Libro l2 = new Libro("Cueva finita",456,paginas2);
	    String[] contenido3= {
				"siete","ocho","nueve"
		};
	    Libro l3 = new Libro("Los deshabitados",456,paginas3);
	    Autor[] autores=new Autor[100];
	    Libro[] libros =new Libro[100];
	    Estudiante e1=new Estudiante("123abc","Juan Perez");
	    Estudiante e2=new Estudiante("456def","Juana Suarez");
	    Biblioteca b1=new Biblioteca("GENERAL",libros,autores);
	    b1.agregarLibro(l1);
	    b1.agregarLibro(l2);
	    b1.agregarLibro(l3);
	    b1.agregarAutor(a1);
	    b1.agregarAutor(a2);
	    b1.agregarAutor(a3);
	    b1.prestarLibro(e1, l1);
	    b1.mostrarEstado();
	    System.out.println("--------------------------------------------");
	    System.out.println("COMPOSICION");

	    l1.leer();
	    l1=null;
	    System.gc();
	  
	    b1.cerrarBiblioteca();
	    b1=null;
	    System.gc();
	    
	    System.out.println("--------------------------------------------");
	    System.out.println("AGREGACION");
	    Biblioteca b2=new Biblioteca("PRIVADA",libros,autores);
	    b2.mostrarEstado();
		
	    System.out.println("--------------------------------------------");
	    System.out.println("ASOCIACION");
	    Estudiante e3=new Estudiante("456asd","Miguel M");
	    Estudiante e4=new Estudiante("789qwe","Jose J");
	    
	    Libro l4 = new Libro("Los alegres",456,paginas3);
	    Libro l5 = new Libro("Los in-alegres",456,paginas3);
	    
	    Prestamo p1=new Prestamo(e3,l4);
	    Prestamo p2=new Prestamo(e4,l5);
	  
	    p1.mostrarInfo();
	    p2.mostrarInfo();
	   
	}

}
