public class Test {

	public static void main(String[] args) {
		JuegoAdivinaNumero j1=new JuegoAdivinaNumero(3);
		j1.juega();

		JuegoAdivinaPar j2=new JuegoAdivinaPar(3);
		JuegoAdivinaImpar j3=new JuegoAdivinaImpar(3);
		System.out.println("PAR");
		j2.juega();
		System.out.println("IMPAR");
		j3.juega();

	}

}
