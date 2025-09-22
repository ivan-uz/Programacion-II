public class Juego {
	
	protected int numerosDeVidas;
	private int record;
	
	public Juego(int numerosDeVidas) {
		this.numerosDeVidas = numerosDeVidas;
		this.record = 0;
	}

	public void reiniciaPartida() {
		System.out.println("Reinicio la partida");
	}
	
	public void actualizaRecord() {
		this.record=numerosDeVidas *10;
	}
	
	public boolean quitaVida() {
		this.numerosDeVidas=numerosDeVidas-1;
		if(numerosDeVidas>0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	

}
