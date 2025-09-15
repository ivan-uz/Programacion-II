public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,4};
		double[] a1= {3,4};
		double[] b= {-4,3};
		int[] b1= {-4,3};
		AlgebraVectorial vec1=new AlgebraVectorial();
		System.out.println("Perpendicular "+vec1.Perpendicular(a, b1));
		System.out.println("Perpendicular "+vec1.Perpendicular(a1, b1));
		System.out.println("Perpendicular "+vec1.Perpendicular(a1, b));
		System.out.println("Perpendicular "+vec1.Perpendicular(a, b));
		System.out.println("Paralela "+vec1.Paralela(a1, b,2));
		System.out.println("Paralela "+vec1.Paralela(a1, b));
		System.out.println("Proyeccion_de_a_sobre_b es "+
		(vec1.Proyeccion_de_a_sobre_b(a1, b)));
		System.out.println("La Componente es "+
		vec1.Componente_de_a_en_b(a1, b));

	}

}
