package Aufgabe1;

public class Zeitschrift extends Medium{
	public static int bestand = 0;
	private String issn;

	public Zeitschrift(String titel, int anzahlExemplare, String issn)
	{
		this(titel, "", anzahlExemplare, issn);
	}
	
	public Zeitschrift(String titel, String unterTitel, int anzahlExemplare, String issn)
	{
		super(titel, unterTitel, anzahlExemplare);
		this.issn = issn;
		bestand++;
	}
	
	public static int getBestand() {
		return bestand;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getBeschreibung ()
	{
		return "Zeitschrift: " + super.getBeschreibung() + ", ISSN;" + issn;
	}
}
