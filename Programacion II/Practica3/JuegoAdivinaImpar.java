public class JuegoAdivinaImpar extends JuegoAdivinaNumero{

	public JuegoAdivinaImpar(int numerosDeVidas) {
		super(numerosDeVidas);
	}
	@Override
	public boolean validaNumero(int entero) {
		if(entero < 0 || entero > 10) {
			return false;
		}
		if (entero % 2 == 0) {
	        System.out.println("ERROR");
	        return false;
	    }
		return true;
	}

}
