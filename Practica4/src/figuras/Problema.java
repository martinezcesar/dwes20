package figuras;

public class Problema {
//119,62
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado c1= new Cuadrado(4.2,"tr",Color.BLACK);
		
		Triangulo t1= new Triangulo(8, 15,"trd",Color.BLACK);
		
		Circunferencia cir1= new Circunferencia(4.8,"trg",Color.BLACK);
		
		Circunferencia cir2= new Circunferencia(1.5,"trh",Color.BLACK);
		
		//perimetro
		
		double hipot;
		double lad_may;
		double lad_men;
		double cuart_c2;
		
		cuart_c2=(cir2.perimetro()*0.75);
		
		
		hipot=t1.hipotenusa()-(cir1.getRadio()*2.0)+(cir1.perimetro()*0.5);
		
		lad_may=t1.getAltura()-cir2.getRadio()+(c1.getLado()*3.0)-c1.getLado();
		
		lad_men=t1.getBase()-cir2.getRadio()+cuart_c2;
		
		
		double perimetro_fig;
		
		perimetro_fig=hipot+lad_may+lad_men;
		
		System.out.println("perimetro figura: "+perimetro_fig);
		
		
		//area
		
		
		double area_tri;
		double ci1;
		double ci2;
		double cuad;
		double figura;
		
		area_tri=t1.area();
		
		ci1=(cir1.area()*0.5);
		
		ci2=( cir2.area()*0.75  );
		
		cuad=c1.area();
		
		figura=area_tri+ci1+ci2+cuad;
		
	
		
		System.out.println("area figura "+figura);
		
		
		
		
		
		
		

	}

}
