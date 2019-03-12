package jeu;

import javafx.scene.image.ImageView;

/**
 * Classe abstraite Objet. Il s'agit de la super classe de tous les objets du jeu (bonus et ingr�dients)
 *
 */
public abstract class Objet {
	private String nom;
	private ImageView image;
	private Position position;
	private boolean present;
	private Carte carte;

	
	/**
	 * Constructeur de la classe Objet.
	 * @param nom
	 * @param image
	 * @param present
	 * @param p
	 */
	public Objet(String nom, ImageView image, boolean present, Position p) {
		super();
		this.nom = nom;
		this.image = image;
		this.position = p;
		this.present = present;
		this.setPositionImage(position);
	}

	/**
	 * M�thode qui retourne "true" si l'objet est pr�sent.
	 * @return
	 */
	public boolean isPresent() {
		return present;
	}

	/**
	 * M�thode qui permet de mettre l'objet comme pr�sent.
	 * @param present
	 */
	public void setPresent(boolean present) {
		this.present = present;
	}

	/**
	 * M�thode permettant de r�cuprer la position de l'objet.
	 * @return position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * M�thode permettant de placer l'objet sur la carte.
	 * @param position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * M�thode permettant de r�cuperer le nom de l'objet.
	 */
	 
	public String getNom() {
		return nom;
	}
	
	/**
	 * M�thode permettant de r�cuperer l'image de l'objet.
	 * @return image
	 */
	public ImageView getImageView(){
		return this.image;
	}
	
	/**
	 * M�thode permettant de placer la position de l'image de l'objet.
	 * @param p
	 */
	public void setPositionImage(Position p) {
		this.image.setX(p.getX());
		this.image.setY(p.getY());
	}
	
	/**
	 * M�thode permettant de placer l'objet.
	 * @param x
	 * @param y
	 */
	public void setPosition(int x, int y){
		this.position.setX(x);
		this.position.setY(y);
	} 
}
