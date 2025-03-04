/**
 * Razred za prikaz uporabe dedovanja
 * Razširja razred steklenica
 * @author Vojko Pezdir
 * @version Primer 19a
 */

public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca {
	// Vse lastnosti atributi od nadrazreda se prenesejo
	//Deklariramo dodatne lastnosti, ki so skupne le pivskim steklenicam
	
	/**
	 * Znamka piva
	 */
	private String znamka;
	
	/**
	 * Temperatura v steklenici
	 */
	private double temperatura;
	
	/**
	 * Stopnja alkohola piva v odstotkih in ne v deležu
	 */
	private double stopnjaAlkohola;
	
	
	/**
	 * Konstruktor za inicializacijo nove steklenice, ki je polna in zaprta
	 * nosi enak ime kot class in datoteka!!!
	 * Inicializira vse lastnosti
	 * @param k kapaciteta steklenice (ml)
	 * @param z Znamka piva
	 */	
	public PivskaSteklenica(int k, String z) {
		// pokličemo drug konstruktor
		this(k, z, 8.0);
	}	 

	/**
	 * Konstruktor za inicializacijo nove steklenice, ki je polna in zaprta
	 * nosi enak ime kot class in datoteka!!!
	 * Inicializira vse lastnosti
	 * @param k kapaciteta steklenice (ml)
	 * @param z Znamka piva
	 * @param t Začetna temperatura steklenice
	 */	
	public PivskaSteklenica(int k, String z, double t) {
		// pokličemo drug konstruktor
		this(k, z, t, 4.50);
	}	

	
	/**
	 * Konstruktor za inicializacijo nove steklenice, ki je polna in zaprta
	 * nosi enak ime kot class in datoteka!!!
	 * Inicializira vse lastnosti
	 * @param k kapaciteta steklenice (ml)
	 * @param z Znamka piva
	 * @param t temperatura piva v °C
	 * @param s stopnja alkohola v odstotkih	 
	 */	
	public PivskaSteklenica(int k, String z, double t, double s) {
		
		// Pokličemo konstruktor nadrazreda - Steklenica, ki bo inicializiral vse lastnosti nadrazreda
		super (k, "Pivo");
		
		// Inicializiramo dodatne lastnosti
		znamka = z;
		temperatura = t;
		stopnjaAlkohola = s;
		
		//Izpišemo podatke o pivu
		System.out.println("Pivska steklenica je znamke: " + z + ", velikosti: " + k +"ml" + ", s temperaturo: " + t + "°C" + ", s stopnjo alkohola " + s + "%.");
	}	
	
	/**
	 * Metoda prepisana z vmesnikom alkoholnaPijaca
	 * vrne stopnjo alkohola v odstotkih 
	 */	
	public double getStopnjaAlkohola() {
		return stopnjaAlkohola;
	}
	
	/**
	 * Metoda vrne znamko piva
	 * 
	 */	
	public String getZnamka() {
		return znamka;
	}
}