package coloreado;

public class Cuadrado extends Figura implements Coloreado{
	private double lado;
	
	public Cuadrado(double lado,String color) {
		super(color);
		this.lado=lado;
	}
	@Override
    public String comoColorear() {
        return "Colorear los cuatro lados";
    }
	@Override
	public double Area() {
		return (lado*lado);
	}
	@Override
	public double Perimetro() {
		return 4+lado;
	}
	
}
