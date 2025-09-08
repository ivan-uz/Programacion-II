public class Circulo2D {
	private double x,y;
	private double radio;
	
	public double getRadio() {
		return radio;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public Circulo2D() {
		this.x=0;
		this.y=0;
		this.radio=1;
	}
	
	public Circulo2D(double x,double y,double radio) {
		this.x=x;
		this.y=y;
		this.radio=radio;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(this.radio,2);
	}
	
	public double getPerimetro() {
		return 2*this.radio*Math.PI;
	}
	
	public boolean contiene(double x,double y) {
		double distancia=Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));
		if(distancia<this.radio) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean contiene(Circulo2D circulo) {
		double distancia=Math.sqrt(Math.pow((circulo.x-this.x),2)+Math.pow((circulo.y-this.y),2));
		if(distancia<(this.radio-circulo.radio)) {
			return true;
		}else {
			return false;
		}
		
	}
	public boolean sobrepone(Circulo2D circulo) {
		double distancia=Math.sqrt(Math.pow((circulo.x-this.x),2)+Math.pow((circulo.y-this.y),2));
		if(distancia<(this.radio+circulo.radio)) {
			return true;
		}else {
			return false;
		}
	}

}
