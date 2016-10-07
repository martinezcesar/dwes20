package figuras;

import java.util.ArrayList;
import java.util.Iterator;
import java.*;



public class GestorFiguras {

	
    private ArrayList<Figura> listaFiguras ;
	
	

	public GestorFiguras(){
		
		this.listaFiguras = new ArrayList<Figura>();
		
		
	}
	
	public void anadirFigura(Figura fig){
		
		boolean enc=false;
		
		for(int i=0;i<listaFiguras.size() && enc==false;i++){
			
			if(fig.getTitulo().equalsIgnoreCase(listaFiguras.get(i).getTitulo())){
				
				System.out.println("la figura ya esta");
				enc=true;
			}
		}
		
		
		if(enc==false){
		listaFiguras.add(fig);
		System.out.println("figura añadida");
		}
		
		
		
		
		
		
	}
	
	public void eliminarFigura(String titu){
		
		for(int i=0; i<listaFiguras.size();i++){
			
			if(titu.equalsIgnoreCase(listaFiguras.get(i).getTitulo())){
				
				listaFiguras.remove(i);
				
				System.out.println("figura borrada de la lista");
			}
			
			else{
				
				System.out.println("la figura no esta en la lista");
			}
		}
		
	}
	
	
	
	public void mostrarFiguras(){
		
		
		System.out.println("las figuras son:");
		
	
		
		    for(int x=0;x<listaFiguras.size();x++) {
		    	System.out.println(listaFiguras.get(x).toString());
	        }
		
	}
	
	
	public void sumAreas(){
		
		double sum=0;
		
		 for(int i=0;i<listaFiguras.size();i++) {
		    	
			 sum=sum+listaFiguras.get(i).area();
			 	
		    	
		    	
	        }
		 
		 System.out.println("suma de areas es "+sum);
		
	}
	
	

	@Override
	public String toString() {
		return "GestorFiguras [ListaFiguras=" + listaFiguras + "]";
	}
	
	
	
	
	
	
	
}
