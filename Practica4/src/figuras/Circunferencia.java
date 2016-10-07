package figuras;

public class Circunferencia extends Figura  {
	
	private double radio;

	public Circunferencia(double radio , String titulo, Color color) {
		super( titulo,  color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double perimetro (){
		
		
		return (2*Math.PI*radio);
		
		
	}
	
	public double area (){
		
		
		return ( (Math.PI*(Math.pow(radio, 2))) );
		
		
		
	}
	
	


	public void imprimir(){
		
		System.out.println("datos de Circunferencia:");
		System.out.println("radio: "+radio);
		System.out.println(super.toString());
		
		
		
	}

	@Override
	public String toString() {
		return "Circunferencia [radio=" + radio + "]" + super.toString();
	}
	
	
	
	
	

}
