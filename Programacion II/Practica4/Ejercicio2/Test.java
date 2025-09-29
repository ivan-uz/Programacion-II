package coloreado;
import java.util.Random;
public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura[] fi=new Figura[5];
		Random rd=new Random();
		int num=rd.nextInt(2)+1;
		System.out.println(num);
		for(int i =0;i<5;i++) {
			if(num==1) {
				int lado=rd.nextInt(5)+1;
				fi[i]=new Cuadrado(lado,"rojo");
			}else {
				int radi=rd.nextInt(5)+1;
				fi[i]=new Circulo(radi,"azul");
			}
		}
		for(Figura f:fi) {
			System.out.println("Area : "+f.Area()+ "  Perimetro : "+f.Perimetro());
			if(f instanceof Coloreado) {
				Coloreado color=(Coloreado)f;
				System.out.println(color.comoColorear());
			}
		}
	}

}
