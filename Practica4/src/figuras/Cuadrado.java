package figuras;

public class Cuadrado extends Figura {


	
	private double lado;

	public Cuadrado(double lado,String titulo, Color color) {
		super( titulo,  color);
		this.lado = lado;
	}

	
	public double getLado() {
		return lado;
	}




	public void setLado(double lado) {
		this.lado = lado;
	}


	public double perimetro (){

		
		return lado+lado+lado+lado;
		
		
	}
	
//	public double area (){
//		
//		
//		return lado*lado;
//		
//		
//	}
	
	@Override
	public double area() {
		
		return lado*lado;
//		
		
	}
	


	public void imprimir(){
		
		System.out.println("datos de Cuadrado:");
		System.out.println("lado: "+lado);
		System.out.println(super.toString());
		
		
		
	}


	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]"  + super.toString();
	}


	
	
	


	
}
