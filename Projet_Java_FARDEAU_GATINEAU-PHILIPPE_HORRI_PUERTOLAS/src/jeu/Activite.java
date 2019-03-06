package jeu;

/**
 * Classe Activite, super-classe de Enigme et Jeu. 
 * @author all
 *
 */
public class Activite {
	private String nom;
	private boolean estReussi;
	private Ingredient ingredient;
	
	/**
	 * Constructeur de la classe Activite
	 * @param n
	 */
	public Activite(String n) {
		super();
		nom = n;
		estReussi = false; 
	}


	/**
	 * M�thode permettant de passer "estReussi" � vrai lorsque l'on r�ussi une �nigme 
	 */
	public void setReussi()
	{
		estReussi = true; 
	}

	/**
	 * M�thode qui permet de r�cuperer la valeur de "estReussi"
	 * @return estReussi
	 */
	public boolean getReussi() {
		return this.estReussi;
	}
	
	/**
	 * M�thode qui permet de r�cuperer la valeur de l'ingr�dient
	 * @return ingredient
	 */
	public Ingredient getIngredient() {
		return this.ingredient;
	}
	 
	/**
	 * M�thode qui permet de mettre l'ingr�dient de l'activit� "this" � i
	 * @param i
	 */
	public void setIngredient(Ingredient i) {
		this.ingredient = i;
	}
}
