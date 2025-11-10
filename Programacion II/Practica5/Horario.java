package ss;

public class Horario {
	private String diasApertura;
	private String horaApertura;
	private String horaCierre;
	
	public Horario(String diasApertura,String horaApertura,String horaCierre) {
		this.diasApertura=diasApertura;
		this.horaApertura=horaApertura;
		this.horaCierre=horaCierre;
	}
	
	public void mostrarHorario() {
		System.out.println("HORARIO "+diasApertura+" de "
	+horaApertura+" hasta "+horaCierre);
	}
	
	

}
