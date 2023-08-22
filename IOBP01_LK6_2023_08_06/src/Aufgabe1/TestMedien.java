package Aufgabe1;

public class TestMedien {

	public static void main(String[] args) {
		
		System.out.println("Anzahl verschiedene Buecher: " + Buch.getBestand());
		System.out.println("Anzahl verschiedene Zeitschriften: " + Zeitschrift.getBestand());
		
		Buch b1 = new Buch ("C als erste Programmiersprache", 5, "123-456-345-21");		
		Zeitschrift z1 = new Zeitschrift ("Java Spektrum", 6, "123-456-345-22");
		Buch b2 = new Buch ("C als erste Programmiersprachen", "vom Einsteiger zum Profi", 5, "123-456-345-21");		
		Zeitschrift z2 = new Zeitschrift ("Speckdrum", "Hoi", 6, "123-456-345-22");

		System.out.println("Anzahl verschiedene Buecher: " + Buch.getBestand());
		System.out.println("Anzahl verschiedene Zeitschriften: " + Zeitschrift.getBestand());
		
		Medium[] arr = new Medium[4];
		arr[0] = b1;
		arr[1] = z1;
		arr[2] = b2;
		arr[3] = z2;
		
		for (Medium ref : arr) {
			System.out.println(ref.getBeschreibung());
		}
	}

}
