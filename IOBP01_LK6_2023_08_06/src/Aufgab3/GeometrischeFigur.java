package Aufgab3;

public abstract class GeometrischeFigur {
	public abstract double berechneFlaeche();
	public abstract double berechneUmfang();
	
	public void print() {
	System.out.println("Die Flaeche betraegt: " + berechneFlaeche());
	System.out.println("Der Umfang betraegt: " + berechneUmfang());
	}
}
