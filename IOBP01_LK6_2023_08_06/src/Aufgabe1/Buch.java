package Aufgabe1;

public class Buch extends Medium{
	private static int bestand = 0;
	private String isbn;
	
	public Buch(String titel, int anzahlExemplare, String isbn)
	{
		this(titel, "", anzahlExemplare, isbn);
	}
	
	public Buch (String titel, String unterTitel, int anzahlExemplare, String isbn)
	{
		super(titel, unterTitel, anzahlExemplare);
		this.isbn = isbn;
		bestand++;
	}
	
	public static int getBestand() {
		return bestand;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBeschreibung ()
	{
		return "Buch: " + super.getBeschreibung() + ", ISBN;" + isbn;
	}
}
