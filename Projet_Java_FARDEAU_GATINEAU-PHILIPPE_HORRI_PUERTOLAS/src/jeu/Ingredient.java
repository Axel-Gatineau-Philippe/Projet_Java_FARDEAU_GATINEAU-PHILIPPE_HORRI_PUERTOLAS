package jeu;

import java.util.ArrayList;

import javafx.scene.image.ImageView;

/**
 * Classe Ingredient qui h�rite de Objet. Elle r�pr�sente les ingr�dients n�c�ssaire � la r�alisation des cookies dans le jeu.
 * @author all
 *
 */
public class Ingredient extends Objet{
	private static ArrayList<Ingredient> listeIngredients = new ArrayList<Ingredient>();

	/**
	 * Constructeur de la classe Ingredient
	 * @param n
	 * @param i
	 * @param z
	 * @param pos
	 */
	public Ingredient(String n, ImageView i, boolean b, Position pos) {
		super(n, i, b, pos);
		listeIngredients.add(this);
	}

}
  