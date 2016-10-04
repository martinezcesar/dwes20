package figuras;

public class Triangulo extends Figura {

	
	
	private double base;
	private double altura;
	
	
	
	public Triangulo(double base, double altura,String titulo, Color color) {
		
		super( titulo, color);
		this.base = base;
		this.altura = altura;
		
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public double perimetro (){
		
		double h;
		
		h=Math.hypot(base, altura);
		
		return h+altura+base;
		
		
	}
	
	public double hipotenusa (){
		double h;

		
	
		
		h=Math.hypot(base, altura);
		return h;
		
		
	}
	
	public double area (){
		
		
		return ( (base*altura)*0.5 );
		
		
		
	}


	public void imprimir(){
		
		System.out.println("datos de Triangulo:");
		System.out.println("base: "+base);
		System.out.println("altura: "+altura);
		System.out.println(super.toString());
		
		
		
		
	}


	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]"  + super.toString();
	}
	
	



	
	
	
}
