package coloreado;

public class Circulo extends Figura{
	private double radio;
	public Circulo(double radio,String color) {
		super(color);
		this.radio=radio;
	}
	@Override
	public double Area() {
		return Math.PI*(radio*radio);
	}
	@Override
	public double Perimetro() {
		return 2*Math.PI*radio;
	}
}
