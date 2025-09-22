import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinaNumero extends Juego{
	private int numeroAAdivinar;
	
	public JuegoAdivinaNumero(int numerosDeVidas ) {
		super(numerosDeVidas);
		
	}
	
	public boolean validaNumero(int entero) {
		if(entero>=0 &&entero<=10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void juega() {
		this.reiniciaPartida();
		Random numero=new Random();
		int numeroAAdivinar=numero.nextInt(11);
		System.out.println(numeroAAdivinar);
		Scanner sc = new Scanner(System.in);
		
		while(numerosDeVidas!=0) {
		System.out.println("Adivine un numero entre 0 y 10");
		int na=sc.nextInt();
		
		if(!this.validaNumero(na)) {
			System.out.println("Ingrese nuevamente el numero entre 0 y 10");
			continue;
		}
		if(na==numeroAAdivinar) {
			System.out.println("Acertaste!!");
			this.actualizaRecord();
			break;
		}else {
			boolean vidas=this.quitaVida();
			if(na>numeroAAdivinar) {
				System.out.println("El numero es menor, intente de nuevo");
			}
			if(na<numeroAAdivinar) {
				System.out.println("El numero es mayor, intente de nuevo");
			}
			if(vidas==false) {
				System.out.println("Te quedaste sin vidas");
				break;
			}
		}
		}
		
	}
}
