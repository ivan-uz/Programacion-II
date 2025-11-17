package sss;

public class Cabina {
	private int nroCabina;
	private Persona[] personasAbordo;
	
	
	public Cabina(int nroCabina) {
		this.nroCabina = nroCabina;
	}
	
	public void agregarPersona(Persona p){
		for(int i=1;i<this.personasAbordo.length;i++){
			this.personasAbordo[i]=p;
		}
	}
	
	
	

}
