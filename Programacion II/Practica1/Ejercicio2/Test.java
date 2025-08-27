package ejercicio2;
import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new  Scanner(System.in);
        System.out.println("Ingrese : a, b, c");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        
        
        EcuacionLineal2 ec1= new EcuacionLineal2(a,b,c);
        
        if(ec1.getDiscriminante()>0) {
        	System.out.println("La ecuacion tiene dos raıces " +ec1.getRaiz1() +"  y  "+ec1.getRaiz2());
        } else if(ec1.getDiscriminante()==0){
        	System.out.println("La ecuacion tiene una raız " +ec1.getRaiz1());
        	
        }else {
        	System.out.println("La ecuacion no tiene raıces reales");
        }
        
        
        System.out.println("Ingrese : a, b, c");
        double aa=sc.nextDouble();
        double bb=sc.nextDouble();
        double cc=sc.nextDouble();
        EcuacionLineal2 ec2= new EcuacionLineal2(aa,bb,cc);
        
        if(ec2.getDiscriminante()>0) {
        	System.out.println("La ecuacion tiene dos raıces " +ec2.getRaiz1() +"  y  "+ec2.getRaiz2());
        } else if(ec2.getDiscriminante()==0){
        	System.out.println("La ecuacion tiene una raız " +ec2.getRaiz1());
        	
        }else {
        	System.out.println("La ecuacion no tiene raıces reales");
        }
        
        
        System.out.println("Ingrese : a, b, c");
        double aaa=sc.nextDouble();
        double bbb=sc.nextDouble();
        double ccc=sc.nextDouble();
        
        EcuacionLineal2 ec3= new EcuacionLineal2(aaa,bbb,ccc);
        
        if(ec3.getDiscriminante()>0) {
        	System.out.println("La ecuacion tiene dos raıces " +ec3.getRaiz1() +"  y  "+ec3.getRaiz2());
        } else if(ec3.getDiscriminante()==0){
        	System.out.println("La ecuacion tiene una raız " +ec3.getRaiz1());
        	
        }else {
        	System.out.println("La ecuacion no tiene raıces reales");
        }
        
	}

}
