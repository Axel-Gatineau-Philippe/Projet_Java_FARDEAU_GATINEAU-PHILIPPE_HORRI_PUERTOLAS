package jeu;

import java.util.ArrayList;
import java.util.Collection;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Classe Carte qui contient toutes les m�thodes relatives aux cartes
 * @author all
 *
 */
public class Carte {
	private String nom;
	private ImageView image;
	private int x;
	private int y;
	private ArrayList<Zone> lesSorties;
	private static ArrayList<Bonus> lesBonus;
	private static ArrayList<Personnage> lesPersonnages;
	
	/**
	 * Constructeur de la classe Carte
	 * @param n
	 * @param i
	 * @param x
	 * @param y
	 */
	public Carte(String n, ImageView i, int x, int y) {
		super();
		nom = n;
		image = i;
		this.lesSorties = new ArrayList<Zone>();
		lesBonus = new ArrayList<Bonus>();
		lesPersonnages = new ArrayList<Personnage>();
	}
	
	/**
	 * M�thode qui permet d'ajouter un personnage � la liste static "lesPersonnages" qui contien tous les personnages pr�sents sur la carte.
	 * @param p
	 */
	public static void ajouterPersonnage(Personnage p) {
		lesPersonnages.add(p);
	}
	
	/**
	 * M�thode qui permet d'ajouter un bonus � la liste static "lesBonus" qui contient tous les bonus pr�sents sur la carte.
	 * @param b
	 */
	public static void ajouterBonus(Bonus b) {
		lesBonus.add(b);
	}
	
	
	/**
	 * M�thode permettant de cacher les personnages, c'est-�-dire que si le personnage ne doit pas �tre sur la carte, il sera invisible. 
	 */
	public void personnageVisible() {
		for (Personnage p : lesPersonnages) {
			if(p.getCarte() == this) {
				p.getImage().setVisible(true);
			}else {
				p.getImage().setVisible(false);
			}
		}
	}
	
	/**
	 * M�thode permettant de cacher les bonus, c'est-�-dire que si le bonus ne doit pas �tre sur la carte, il sera invisible. 
	 */
	public void bonusVisible() {
		for (Bonus b : lesBonus) {
			if(b.getCarte() == this && !b.isPresent()) {
				b.getImageView().setVisible(true);
			}else {
				b.getImageView().setVisible(false);
			}
		}
	}
	
	/**
	 * M�thode qui permet de r�cuperer le nom de la carte.	
	 * @return
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * M�thode qui permet d'ajouter une zone � la carte courante.
	 * @param z
	 */
	public void ajouterZone(Zone z){
		this.lesSorties.add(z);
	}

	/**
	 * M�thode qui permet de r�cup�rer l'image de la carte.
	 * @return image
	 */
	public ImageView getImage() {
		return image;
	}

	/**
	 * M�thode qui permet de r�cup�rer la liste des zones de sortie de la carte.
	 * @return lesSorties
	 */
	public ArrayList<Zone> getLesSorties() {
		return lesSorties;
	}
	
	
	/**
	 * M�thode qui permet de r�cup�rer la liste des bonus pr�sents sur la carte.
	 * @return lesBonus
	 */
	public ArrayList<Bonus> getLesBonus() {
		return lesBonus;
	}
	
	/**
	 * M�thode qui permet de r�cup�rer la liste des personnages pr�sents sur la carte.
	 * @return lesPersonnages
	 */
	public ArrayList<Personnage> getLesPersonnages(){
		return lesPersonnages;
	}

	
	/**
	 * M�thode qui permet d'instancier la liste de bonus de la carte courante avec la liste plac�e en param�tre.
	 * @param lesObjets
	 */
	public void setLesObjets(ArrayList<Bonus> lesObjets) {
		this.lesBonus = lesObjets;
	}
}
