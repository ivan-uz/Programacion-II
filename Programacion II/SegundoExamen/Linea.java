package sss;

public class Linea {
	private String color;
	private Persona[] filaPersonas;
	private Cabina[] cabinas;
	private int cantidadCabinas;
	public Linea(String color) {
		this.color = color;
	
	}
	
	public void agregarPersona(Persona p){
		for(int i=1;i<this.filaPersonas.length;i++){
			this.filaPersonas[i]=p;
		}
	}
	
	public void agregarCabina(int nroCab){
		for(int i=1;i<this.cabinas.length;i++){
			this.cabinas[i]=cabinas[nroCab];
		}
	}
	

}
