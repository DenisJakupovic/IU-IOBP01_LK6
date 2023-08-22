package Aufgab3;

public class Quadrat extends GeometrischeFigur {
	private int seitenlaenge;
	
	//laenge in mm
	public Quadrat(int seitenlaenge) {
		this.seitenlaenge = seitenlaenge;
		}

	@Override
	public double berechneFlaeche() {
		return (seitenlaenge * seitenlaenge);
	}

	@Override
	public double berechneUmfang() {
		return (4 * seitenlaenge);
	}
	
	@Override
	public void print() {
		System.out.println("Das Quadrat hat die Seitenlaenge: " + seitenlaenge);
		super.print();
	}

	
	
}
