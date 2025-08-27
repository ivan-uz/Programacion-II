package ejercicio3;
import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double[] n=new double[10];
		
		System.out.println("Ingrese 10 numeros");
		
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextDouble();
		}
		
		Estadistica es1=new Estadistica(n);
		
		System.out.println("El promedio es : " + es1.Promedio());
		System.out.println("La desviacion estandar es : " + es1.Desviacion());
		
	}

}
