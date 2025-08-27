package ejercicio3;
import java.util.*;
public class Estructural {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double[] n=new double[10];
		System.out.println("Ingrese 10 numeros");
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextDouble();
		}
		
		double promedio=Promedio(n);
		double desviacion=Desviacion(n,promedio);
		
		System.out.println("El Promedio es "+promedio);
		System.out.println("El Promedio es "+desviacion);
		
		

	}
	
	public static double Promedio(double[] n) {
		double total=0;
		for(int i=0;i<n.length;i++) {
			total=total+n[i];
		}
		return total/n.length;
	}
	
	public static double Desviacion(double[] n,double promedio) {
		double total=0;
		for(int i=0;i<n.length;i++) {
			total=total+Math.pow(n[i]-promedio, 2);
		}
		return Math.sqrt(total/(n.length-1));
	}

}
