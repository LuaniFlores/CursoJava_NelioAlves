package entities_exemplo02;

import entities_enums02.Color;

// Classe abstrata 
public abstract class Shape {

	private Color color;

	public Shape() {
	}
	
	public Shape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// Método abstrato
	public abstract double area();
}
