package ejercicio1;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
        System.out.println("Ingrese : a, b, c, d, e, f");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        double f=sc.nextDouble();
        
        EcuacionLineal e1=new EcuacionLineal(a,b,c,d,e,f);
        
        if(e1.tieneSolucion()){
            System.out.println("X = "+e1.getX()+"    "+"Y = "+e1.getY());
        }else{
            
            System.out.println("La escuacion no tiene solucion");
        }
        
        
        System.out.println("Ingrese : a, b, c, d, e, f");
        double aa=sc.nextDouble();
        double bb=sc.nextDouble();
        double cc=sc.nextDouble();
        double dd=sc.nextDouble();
        double ee=sc.nextDouble();
        double ff=sc.nextDouble();
        
        EcuacionLineal e2=new EcuacionLineal(aa,bb,cc,dd,ee,ff);
        
        if(e2.tieneSolucion()){
            System.out.println("X = " +e2.getX() +"    "+"Y = "+e2.getY());
        }else{
            
            System.out.println("La escuacion no tiene solucion");
        }

	}

}
