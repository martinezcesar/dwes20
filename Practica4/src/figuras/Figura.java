package figuras;

public class Figura {
	
	
	String titulo;
	
	Color color;

	
	
	public Figura() {
		
		
	}
	
	public Figura(String titulo, Color color) {
		this.titulo = titulo;
		this.color = color;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [titulo=" + titulo + ", color=" + color + "]";
	}
	
	
	
	

}
