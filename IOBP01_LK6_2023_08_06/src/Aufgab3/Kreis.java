package Aufgab3;

public class Kreis extends GeometrischeFigur{

	private int radius;
	
	public Kreis(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double berechneFlaeche() {
		return (radius*radius*Math.PI);
	}

	@Override
	public double berechneUmfang() {
		return (2*Math.PI*radius);
	}
	
	@Override
	public void print() {
		System.out.println("Der Kreis hat den Radius: " + radius);
		super.print();
	}

}
