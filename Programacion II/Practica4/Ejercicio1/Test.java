package empleados;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Empleado[] emp1=new Empleado[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Introduzca Nombre ");
			String nom=sc.next();
			System.out.println("Introduzca Salario");
			double sal=sc.nextDouble();
			emp1[i]=new EmpleadoTiempoCompleto(nom,sal);
		}
		for(int i=3;i<5;i++) {
			System.out.println("Introduzca Nombre ");
			String nom=sc.next();
			System.out.println("Introduzca Horas");
			double ht=sc.nextDouble();
			System.out.println("Introduzca Tarifa");
			double th=sc.nextDouble();
			emp1[i]=new EmpleadoTiempoHorario(nom,ht,th);		
		}
		for(Empleado em:emp1) {
			System.out.println(em.toString());
			System.out.println(em.CalcularSalarioMensual());
		}
	}
}
