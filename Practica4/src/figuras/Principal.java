package figuras;
import java.*;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Triangulo tri= new Triangulo(8, 4,"tri",Color.BLACK);
		
		//tri.imprimir();
		
	
		
		Cuadrado cuad= new Cuadrado(2,"cuad",Color.BLUE);
		
		//cuad.imprimir();
		
		
		Circunferencia circ= new Circunferencia(4.3,"circ",Color.GRAY); 
		
		//circ.imprimir();
		
		
		GestorFiguras listadoFiguras = new GestorFiguras();
		
		listadoFiguras.anadirFigura(cuad);
		listadoFiguras.anadirFigura(circ);
		listadoFiguras.anadirFigura(cuad);

		listadoFiguras.mostrarFiguras();
	
		listadoFiguras.sumAreas();
		
	
	}

}
