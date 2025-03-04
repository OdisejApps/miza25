// Uvozimo razrede za delo z vhodno-izhodnimi operacijami ter pripomočke
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Razred za prikaz grafičnega uporabniškega vmesnika
 * raširja razred za delo z okni
 * @author Vojko Pezdir
 * @version Primer 20
 */
 
 
public class Miza extends JFrame implements ActionListener {
	// Deklariramo zasebbne elemente lastnosti GUI
	private JPanel povrsina;
	private JButton dodajButton;
	private JTextField znamkaTextField;
	private JTextField stopnjaAlkoholaTextField;
	private PivskaSteklenicaTableModel modelTabele;
	
	
	/**
	 * Glavna metoda program. Zažene se vedno ob zagonu.
	 * @param args Seznam argumentov iz ukazne vrstice
	 */
	public static void main(String[] args) {
	
		// Izpišemo začetek
		System.out.println("Zaganjam GUI ...");
		
		//Ustvarimo objekt razreda Miza (kličemo konstruktor razreda Miza)
		Miza m = new Miza();
	}
	
	/**
	 * Konstruktor, ki nastavi osnovne lastnosti okna
	 */
	public Miza() {
		
		// Pokličemo konstruktor nadrazreda JFrame s title
		super("Miza s steklenicami");
		
		
		// Nastavimo obnašanje gumba [x], da konča aplikacijo - glej dokumentacijo
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Nastavimo velikost okna
		setSize(800, 600);
		
		// Inicializiramo elemente GUI
		povrsina = new JPanel();
		
		// Vnosna polja za dodajanje stklenice
		znamkaTextField = new JTextField(32);
		stopnjaAlkoholaTextField = new JTextField(4);
		
		// Dodamo vnosna polja na površino
		povrsina.add(new JLabel("Znamka piva:"));
		povrsina.add(znamkaTextField);
		povrsina.add(new JLabel("Stopnja alkohola:"));
		povrsina.add(stopnjaAlkoholaTextField);
	
		dodajButton = new JButton("Dodaj");
		
		// Gumbu dodamo action listener za dodajanje steklenic
		dodajButton.addActionListener(this);
		
		// Dodamo gumb na površino
		povrsina.add(dodajButton);
		
		// Inicializirmao model tabele
		modelTabele = new PivskaSteklenicaTableModel();
		
		// Tabelo postavimo na površino (samo element JTable)
		// Ustvarimo anonimen objekt razreda JTable z modelom
		povrsina.add(new JTable(modelTabele));
		
		
		// Površino dodamo na okno
		add(povrsina);
		
		// Prikažemo okno setVisible
		setVisible(true);
		

	}
	
	/**
	* Metoda, ki jo predpisuje vmesnik ActionListener
	* se kliče vedno, ko je pritisnjen gumb
	* @param e Dogodek ob kliku
	*/
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Dodajam steklenico... ");
		System.out.println("Znamka piva: " + znamkaTextField.getText());
		System.out.println("Stopnja alkohola: " + stopnjaAlkoholaTextField.getText());
		
		// Spremenljivka za stopnjo alkohola iz teksta v double
		double sa = Double.parseDouble(stopnjaAlkoholaTextField.getText());
		
		// Ustvarimo nov objekt pivska steklenica
		PivskaSteklenica nova = new PivskaSteklenica(500, znamkaTextField.getText(), 8.0, sa);
		
		// dodamo v tabelo
		modelTabele.addPivskaSteklenica(nova);
		
	}
}