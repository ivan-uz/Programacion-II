package ejercicio3;

public class Estadistica {
	private double[] n;
	
	public Estadistica(double[] n) {
		this.n=n;
	}
	
	public double Promedio() {
		double total=0;
		for(int i=0;i<n.length;i++) {
			total=total+n[i];
		}
		return total/n.length;
	}
	
	public double Desviacion() {
		double total=0;
		for(int i=0;i<n.length;i++) {
			total=total+Math.pow(n[i]-this.Promedio(), 2);
		}
		return Math.sqrt(total/(n.length-1));
	}

}
