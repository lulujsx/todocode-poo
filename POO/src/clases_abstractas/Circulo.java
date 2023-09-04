package clases_abstractas;

public class Circulo extends Figura {
	
	private double radio;
	
	public Circulo() {
		
	}
	
	public Circulo(double radio, double x, double y) {
		super(x,y);
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		double pi = 3.14;
		return pi * radio * radio;
	}
}
