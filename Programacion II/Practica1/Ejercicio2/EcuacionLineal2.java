package ejercicio2;

public class EcuacionLineal2 {
	private double a,b,c;
	
	public EcuacionLineal2(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
		
	}
	
	public double getDiscriminante() {
		return ((b*b)-4*a*c);
	}
	
	public double getRaiz1() {
		return (-b+(Math.sqrt((b*b)-4*a*c)))/2*a;
	}
	public double getRaiz2() {
		return (-b-(Math.sqrt((b*b)-4*a*c)))/2*a;
	}

}
