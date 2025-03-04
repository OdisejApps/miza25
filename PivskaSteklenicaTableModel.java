// Uvozimo razrede za delo z vhodno-izhodnimi operacijami ter pripomočke
import javax.swing.table.*;

/**
 * Razred za delo s tabelo pivskih stkelenic
 * raširja privzeti razred tabele
 * @author Vojko Pezdir
 * @version Primer 20
 */
 
 
public class PivskaSteklenicaTableModel extends DefaultTableModel {
	/**
	* Konstruktor, ki ustvari tabelo steklenic na mizi
	*/
	public PivskaSteklenicaTableModel () {
		
		// Pokličemo konstruktor nadrazreda
		super();
		
		
		// dodamo stolpce v tabelo
		addColumn("Znamka");
		addColumn("Stopnja alkohola");
		
		// Dodamo testni vnos Ustvarimo seznam objektov (nizov), ki predstvlja vrstico tabele
		Object[] vrstica = new Object[] {"Testna znamka", "5.0"};
		
		//Vrstico vstavimo
		addRow(vrstica);
	}	

	/**
	* Metoda, ki doda pivsko steklenico v tabelo
	* @param ps Objekt, ki ga damo v tabelo
	*/
	
	public void addPivskaSteklenica(PivskaSteklenica ps) {
				
		// Ustvarimo seznam objektov (nizov), ki predstvlja vrstico tabele
		Object[] vrstica = new Object[] {ps.getZnamka(), ps.getStopnjaAlkohola()};
		addRow(vrstica);
	}
}