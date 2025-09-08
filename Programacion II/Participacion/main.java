public class main {

	public main(String[] args) {
		// TODO Auto-generated method stub
		
		Circulo2D c1=new Circulo2D(2, 0, 1);
		Circulo2D c2=new Circulo2D(2,0,0.5);
		Circulo2D c3=new Circulo2D(0,0,2);
		
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimetro());
		c1.contiene(2.5, 0);
		c1.contiene(c2);
		c1.sobrepone(c3);
		

	}

}
