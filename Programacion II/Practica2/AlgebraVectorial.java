public class AlgebraVectorial {
	private double[] a,b;
	
	public AlgebraVectorial() {
		this.a=new double[0];
		this.b=new double[0];
		
	}
	
	public AlgebraVectorial(double[] v1,double[]v2) {
		this.a=v1;
		this.b=v2;
		
	}
	public boolean Perpendicular(int[] v1,int[] v2) {
		double s=0;
		double s1=0;
		for(int i=0;i<v1.length;i++) {
			double ss=(v1[i]+v2[i]);
			double ss1=(v1[i]-v2[i]);
			s=s+(ss*ss);
			s1=s1+(ss1*ss1);
		}
		return s==s1;
	}
	
	
	public boolean Perpendicular(double[] v1,int[] v2) {
		double s=0;
		double s1=0;
		for(int i=0;i<v1.length;i++) {
			double ss=(v1[i]-v2[i]);
			double ss1=(v2[i]-v1[i]);
			s=s+(ss*ss);
			s1=s1+(ss1*ss1);
		}
		return s==s1;
	}
	
	public boolean Perpendicular(int[] v1,double[] v2) {
		double s=0;
		for(int i=0;i<v1.length;i++) {
			s=s+(v1[i]*v2[i]);
		}
		return s==0;
	}
	
	public boolean Perpendicular(double[] v1,double[] v2) {
		double s=0;
		double s1=0;
		double s2=0;
		for(int i=0;i<v1.length;i++) {
			double sum = v1[i]+v2[i];
			s=s+(sum*sum);
			s1=s1+(v1[i]*v1[i]);
			s2=s2+(v2[i]*v2[i]);
		
		}
		return s==s1+s2;
	}
	
	public boolean Paralela(double[] v1,double[] v2, double k) {
		double[] s1= new double[v2.length];
		for(int i=0;i<v2.length;i++) {
			s1[i]=k*v2[i];
		}
		return v1.equals(s1);
	}
	public boolean Paralela(double[] v1,double[] v2) {
		double s= 0;
		s=(v1[0]*v2[1])-(v1[1]*v2[0]);
		return s==0;
	}
	
	public double Proyeccion_de_a_sobre_b(double[] v1,double[] v2) {
		double s=0;
		double s1=0;
		double s3=0;
		double s4=0;
		System.out.println();
		for(int i=0;i<v1.length;i++) {
			s=s+v1[i]*v2[i];
			s1=s1+(Math.pow(v2[i],2));
		s3=(s/s1);
		}
		for(int j=0;j<v2.length;j++) {
			s4=(s3*v2[j]);
		}
		return s4;
	}
	
	public double Componente_de_a_en_b(double[] v1,double[] v2) {
		
		double s=0;
		double s1=0;
		for(int i=0;i<v1.length;i++) {
			s=s+v1[i]*v2[i];
			s1=s1+(Math.sqrt(Math.pow(v2[i],2)));
		
		}
		return s/s1;
	}

}
