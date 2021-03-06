package jeu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import fenetre.MainFX;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Classe Jeu qui contient les m�thodes principales du jeu (menu, d�marrage, red�marrage etc..)
 *
 */
public class Jeu {
	private Personne personne;
	private Carte map; 
	
	
	public Jeu(Personne p, Carte m) {
		super();
		personne = p;
		map = m;
	}

	/**
	 * M�thode static permettant de quitter le jeu
	 * @param stage
	 * @param menu
	 */
	public static void quitter(Stage stage, Stage menu) {
		stage.close();
		menu.close();
	}
	
	/**
	 * M�thode static permettant de fermer la fen�tre courante
	 * @param stage
	 */
	public static void fermer(Stage stage) {
		stage.close();
	}
	
	/**
	 * M�thode permettant de redemarrer le jeu
	 * @param stage
	 * @param menu
	 */
	public static void redemarrer(Stage stage) {
		stage.close();
		try {
			Joueur.setVie(0);
			demarrerJeu(stage);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * M�thode static permettant de demander de l'aide
	 * @param stage
	 */
	public static void aide(Stage stage) {
		stage.close();
		FileInputStream commandes = null;
		try {
			commandes = new FileInputStream("./images/divers/tabcommandes.JPG");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Image imCommande = new Image(commandes);
		ImageView ivCommande = new ImageView();
		ivCommande.setImage(imCommande);
		
		BorderPane borderpane = new BorderPane();
		borderpane.setCenter(ivCommande);
		Scene sceneCommande = new Scene(borderpane, 600, 300);
		
		Stage fenetreCommande = new Stage();
		fenetreCommande.setTitle("Commandes");
		fenetreCommande.setScene(sceneCommande);
		fenetreCommande.show();
	}
	
	
	/**
	* M�thode permettant d'initialiser les �l�ments graphiques et de d�marrer le jeu
	* @throws FileNotFoundException
	*/
	public static void demarrerJeu(Stage stage) throws FileNotFoundException {
		// Initialisation des fichiers des cartes
		FileInputStream village = new FileInputStream("./images/maps/centre.png");
		FileInputStream lac = new FileInputStream("./images/maps/lac.png");
		FileInputStream mine = new FileInputStream("./images/maps/mine.png");
		FileInputStream ferme = new FileInputStream("./images/maps/ferme.png");
		FileInputStream maison = new FileInputStream("./images/maps/maison.png");
		FileInputStream foret = new FileInputStream("./images/maps/foret.png");
		
		// Initialisation des fichiers des personnages et du joueur
		FileInputStream julia = new FileInputStream("./images/personnages/julia.png");
		FileInputStream bucheron = new FileInputStream("./images/personnages/bucheron.png");
		FileInputStream fermiere = new FileInputStream("./images/personnages/fermiere.png");
		FileInputStream pecheur = new FileInputStream("./images/personnages/pecheur.png");
		FileInputStream quies1 = new FileInputStream("./images/personnages/quies1.png");
		FileInputStream quies2 = new FileInputStream("./images/personnages/quies2.png");
		FileInputStream quies3 = new FileInputStream("./images/personnages/quies3.png");
		FileInputStream quiesMaire = new FileInputStream("./images/personnages/quiesMaire.png");
		
		// Initialisation des ingr�dients
		FileInputStream beurre = new FileInputStream("./images/ingredients/beurre.png");
		FileInputStream chocolat = new FileInputStream("./images/ingredients/chocolat.png");
		FileInputStream farine = new FileInputStream("./images/ingredients/farine.png");
		FileInputStream oeufs = new FileInputStream("./images/ingredients/oeufs.png");
		FileInputStream sucre = new FileInputStream("./images/ingredients/sucre.png");
		
		// Initialisation des bonus
		FileInputStream fouet = new FileInputStream("./images/bonus/fouet.png");
		FileInputStream maryse = new FileInputStream("./images/bonus/maryse.png");
		FileInputStream papier = new FileInputStream("./images/bonus/papier.png");
		FileInputStream plaque = new FileInputStream("./images/bonus/plaque.png");
		FileInputStream saladier = new FileInputStream("./images/bonus/saladier.png");
		
		// Initialisation des vies
		FileInputStream vie1 = new FileInputStream("./images/divers/hearts1.png");
		FileInputStream vie2 = new FileInputStream("./images/divers/hearts2.png");
		FileInputStream vie3 = new FileInputStream("./images/divers/hearts3.png");
		
		// Initialisation des images
		Image imVillage = new Image(village);
		Image imLac = new Image(lac);
		Image imMine = new Image(mine);
		Image imFerme = new Image(ferme);
		Image imMaison = new Image(maison);
		Image imForet = new Image(foret);
		
		Image imJulia = new Image(julia);
		Image imBucheron = new Image(bucheron);
		Image imFermiere = new Image(fermiere);
		Image imPecheur = new Image(pecheur);
		Image imQuies1 = new Image(quies1);
		Image imQuies2 = new Image(quies2);
		Image imQuies3 = new Image(quies3);
		Image imQuiesMaire = new Image(quiesMaire);
		
		Image imBeurre = new Image(beurre);
		Image imChocolat = new Image(chocolat);
		Image imFarine = new Image(farine);
		Image imOeufs = new Image(oeufs);
		Image imSucre = new Image(sucre);
		
		Image imFouet = new Image(fouet);
		Image imMaryse = new Image(maryse);
		Image imPapier = new Image(papier);
		Image imPlaque= new Image(plaque);
		Image imSaladier = new Image(saladier);
		
		Image imVie1 = new Image(vie1);
		Image imVie2 = new Image(vie2);
		Image imVie3 = new Image(vie3);

		// Initialisation des imageViews	
		ImageView ivVillage = new ImageView();
		ImageView  ivLac = new ImageView();
		ImageView  ivMine = new ImageView();
		ImageView  ivFerme = new ImageView();
		ImageView  ivMaison = new ImageView();
		ImageView  ivForet = new ImageView();
		
		ImageView  ivJulia = new ImageView();
		ImageView  ivBucheron = new ImageView();
		ImageView  ivFermiere = new ImageView();
		ImageView  ivPecheur = new ImageView();
		ImageView  ivQuies1 = new ImageView();
		ImageView  ivQuies2 = new ImageView();
		ImageView  ivQuies3 = new ImageView();
		ImageView  ivQuiesMaire = new ImageView();
		
		ImageView  ivBeurre = new ImageView();
		ImageView  ivChocolat = new ImageView();
		ImageView  ivFarine = new ImageView();
		ImageView  ivOeufs = new ImageView();
		ImageView  ivSucre = new ImageView();
		
		ImageView  ivFouet = new ImageView();
		ImageView  ivMaryse = new ImageView();
		ImageView  ivPapier = new ImageView();
		ImageView  ivPlaque= new ImageView();
		ImageView  ivSaladier = new ImageView();
		
		ImageView ivVie1 = new ImageView();
		ImageView ivVie2 = new ImageView();
		ImageView ivVie3 = new ImageView();
		
		//Initialisation des imageViews
		ivVillage.setImage(imVillage);
		ivLac.setImage(imLac);
		ivMine.setImage(imMine);
		ivFerme.setImage(imFerme);
		ivMaison.setImage(imMaison);
		ivForet.setImage(imForet);
		
		ivJulia.setImage(imJulia);
		ivBucheron.setImage(imBucheron);
		ivFermiere.setImage(imFermiere);
		ivPecheur.setImage(imPecheur);
		ivQuies1.setImage(imQuies1);
		ivQuies2.setImage(imQuies2);
		ivQuies3.setImage(imQuies3);
		ivQuiesMaire.setImage(imQuiesMaire);
				
		ivBeurre.setImage(imBeurre);
		ivChocolat.setImage(imChocolat);
		ivFarine.setImage(imFarine);
		ivOeufs.setImage(imOeufs);
		ivSucre.setImage(imSucre);
		
		ivFouet.setImage(imFouet);
		ivMaryse.setImage(imMaryse);
		ivPapier.setImage(imPapier);
		ivPlaque.setImage(imPlaque);
		ivSaladier.setImage(imSaladier);
		
		ivVie1.setImage(imVie1);
		ivVie2.setImage(imVie2);
		ivVie3.setImage(imVie3);
		
		// Initialisation des cartes 		
		Carte carteVillage = new Carte("Place du village", ivVillage, 0, 0);
		Carte carteLac = new Carte("Lac", ivLac, 0, 0);
		Carte carteMine = new Carte("Mine", ivMine, 0, 0);
		Carte carteFerme = new Carte("Ferme", ivFerme, 0, 0);
		Carte carteMaison = new Carte("Maison", ivMaison, 0, 0);
		Carte carteForet = new Carte("For�t", ivForet, 0, 0);
		
		// Initialisation des positions main
		Position positionMainHaut1 = new Position(50,-6);
		Position positionMainHaut2 = new Position(490,50);
		Position positionMainBas1 = new Position(40,355);
		Position positionMainBas2 = new Position(500,416);
		Position positionMainGauche1 = new Position(-6,80);
		Position positionMainGauche2 = new Position(45,360);
		Position positionMainDroite1 = new Position(500,80);
		Position positionMainDroite2 = new Position(543,360);
		
		// Initialisation des positions
		Position positionJulia = new Position(245,100);
		Position positionBucheron = new Position(400,155);
		Position positionFermiere = new Position(90,125);
		Position positionPecheur = new Position(140,100);
		Position positionQuies1 = new Position(130,110);
		Position positionQuies2 = new Position(350,90);
		Position positionQuies3 = new Position(110,250);
		Position positionMaire = new Position(245,210);
		
		Position positionBeurre = new Position(0,0);
		Position positionChocolat = new Position(30,30);
		Position positionFarine = new Position(0,0);
		Position positionOeufs = new Position(0,0);
		Position positionSucre = new Position(0,0);
		
		Position positionFouet = new Position(430,10);
		Position positionMaryse = new Position(20,40);
		Position positionPapier = new Position(370,65);
		Position positionPlaque = new Position(25,260);
		Position positionSaladier = new Position(5,270);
		
		Position positionZoneFouet1 = new Position(430,0);
		Position positionZoneFouet2 = new Position(546,70);
		Position positionZoneMaryse1 = new Position(15,15);
		Position positionZoneMaryse2 = new Position(80,80);
		Position positionZonePapier1 = new Position(340,30);
		Position positionZonePapier2 = new Position(420,110);
		Position positionZonePlaque1 = new Position(5,240);
		Position positionZonePlaque2 = new Position(60,305);
		Position positionZoneSaladier1 = new Position(5,225);
		Position positionZoneSaladier2 = new Position(50,290);
		
		Position positionZoneBucheron1 = new Position(380,125);
		Position positionZoneBucheron2 = new Position(430,205);
		Position positionZoneFermiere1 = new Position(65,90);
		Position positionZoneFermiere2 = new Position(115,170);
		Position positionZonePecheur1 = new Position(125,85);
		Position positionZonePecheur2 = new Position(200,155);
		Position positionZoneQuies11 = new Position(95,125);
		Position positionZoneQuies12 = new Position(150,175);
		Position positionZoneQuies21 = new Position(325,75);
		Position positionZoneQuies22 = new Position(375,155);
		Position positionZoneQuies31 = new Position(85,225);
		Position positionZoneQuies32 = new Position(130,300);
		Position positionZoneMaire1 = new Position(220,220);
		Position positionZoneMaire2 = new Position(265,275);
		Position positionZoneChocolat1 = new Position(30,30);
		Position positionZoneChocolat2 = new Position(70,70);
		
		// Positions des zones du village
		Position positionHautVillage1 = positionMainHaut1;
		Position positionHautVillage2 = positionMainHaut2;
		Position positionBasVillage1 = positionMainBas1;
		Position positionBasVillage2 = positionMainBas2;
		Position positionDroiteVillage1 = positionMainDroite1;
		Position positionDroiteVillage2 = positionMainDroite2;
		Position positionGaucheVillage1 = new Position(0,150);
		Position positionGaucheVillage2 = new Position(50,250);
		
		// Position zone du lac
		Position positionBasLac1 = positionMainBas1;
		Position positionBasLac2 = positionMainBas2;
		
		// Position zone de la mine
		Position positionDroiteMine1 = positionMainDroite1;
		Position positionDroiteMine2 = positionMainDroite2;
		
		// Positions des zones de la ferme
		Position positionHautFerme1 = positionMainHaut1;
		Position positionHautFerme2 = positionMainHaut2;
		Position positionDroiteFerme1 = positionMainDroite1;
		Position positionDroiteFerme2 = positionMainDroite2;
		
		// Positions des zones de la maison de Julia
		Position positionHautMaison1 = positionMainHaut1;
		Position positionHautMaison2 = positionMainHaut2;
		Position positionGaucheMaison1 = positionMainGauche1;
		Position positionGaucheMaison2 = positionMainGauche2;
		
		// Positions des zones de la foret
		Position positionGaucheForet1 = positionMainGauche1;
		Position positionGaucheForet2 = positionMainGauche2;
		Position positionBasForet1 = positionMainBas1;
		Position positionBasForet2 = positionMainBas2;
		
		
		// Zones de d�placement entre les cartes
		Zone zVillageLac = new Zone(positionHautVillage1, positionHautVillage2,Deplacement.HAUT, carteLac);
		carteVillage.ajouterZone(zVillageLac);
		Zone zLacVillage = new Zone(positionBasLac1, positionBasLac2, Deplacement.BAS, carteVillage);
		carteLac.ajouterZone(zLacVillage);
		
		Zone zVillageMine = new Zone(positionGaucheVillage1, positionGaucheVillage2, Deplacement.GAUCHE, carteMine);
		carteVillage.ajouterZone(zVillageMine);
		Zone zMineVillage = new Zone(positionDroiteMine1, positionDroiteMine2, Deplacement.DROITE, carteVillage);
		carteMine.ajouterZone(zMineVillage);
		
		Zone zVillageFerme = new Zone(positionBasVillage1, positionBasVillage2, Deplacement.BAS, carteFerme);
		carteVillage.ajouterZone(zVillageFerme);
		Zone zFermeVillage = new Zone (positionHautFerme1, positionHautFerme2, Deplacement.HAUT, carteVillage);
		carteFerme.ajouterZone(zFermeVillage);
		
		Zone zVillageForet = new Zone (positionDroiteVillage1, positionDroiteVillage2, Deplacement.DROITE, carteForet);
		carteVillage.ajouterZone(zVillageForet);
		Zone zForetVillage = new Zone (positionGaucheForet1, positionGaucheForet2, Deplacement.GAUCHE, carteVillage);
		carteForet.ajouterZone(zForetVillage);
		
		Zone zFermeMaison = new Zone (positionDroiteFerme1, positionDroiteFerme2, Deplacement.DROITE, carteMaison);
		carteFerme.ajouterZone(zFermeMaison);
		Zone zMaisonFerme = new Zone(positionGaucheMaison1, positionGaucheMaison2, Deplacement.GAUCHE, carteFerme);
		carteMaison.ajouterZone(zMaisonFerme);
		
		Zone zForetMaison = new Zone(positionBasForet1, positionBasForet2, Deplacement.BAS, carteMaison);
		carteForet.ajouterZone(zForetMaison);
		Zone zMaisonForet = new Zone(positionHautMaison1, positionHautMaison2, Deplacement.HAUT, carteForet);
		carteMaison.ajouterZone(zMaisonForet);		
		
		// Initialisation des zones 
		Zone zFouet = new Zone(positionZoneFouet1, positionZoneFouet2);
		Zone zMaryse = new Zone(positionZoneMaryse1, positionZoneMaryse2);
		Zone zPapier = new Zone(positionZonePapier1, positionZonePapier2);
		Zone zPlaque = new Zone(positionZonePlaque1, positionZonePlaque2);
		Zone zSaladier = new Zone(positionZoneSaladier1, positionZoneSaladier2);
		
		Zone zBucheron = new Zone(positionZoneBucheron1, positionZoneBucheron2);
		Zone zFermiere = new Zone(positionZoneFermiere1, positionZoneFermiere2);
		Zone zPecheur = new Zone(positionZonePecheur1, positionZonePecheur2);
		Zone zQuies1 = new Zone(positionZoneQuies11, positionZoneQuies12);
		Zone zQuies2 = new Zone(positionZoneQuies21, positionZoneQuies22);
		Zone zQuies3 = new Zone(positionZoneQuies31, positionZoneQuies32);
		Zone zMaire = new Zone(positionZoneMaire1, positionZoneMaire2);
		Zone zChoco = new Zone(positionZoneChocolat1, positionZoneChocolat2);
		
		// Initialisation des ingr�dients
		Ingredient iBeurre = new Ingredient ("Beurre", ivBeurre, false, positionBeurre);
		Ingredient iChocolat = new Ingredient ("Chocolat", ivChocolat, false, positionChocolat);
		Ingredient iFarine = new Ingredient ("Farine", ivFarine, false, positionFarine);
		Ingredient iOeufs = new Ingredient ("Oeufs", ivOeufs, false, positionOeufs);
		Ingredient iSucre = new Ingredient ("Sucre", ivSucre, false, positionSucre);
		
		// Initialisation des enigmes
		Enigme actBucheron = new Enigme("P�re et fils", "3", "Un p�re et un fils ont � eux deux 36 ans. Sachant que le p�re a 30 ans de plus que le fils, quel �ge a le fils ?", "6", "3", "5");
		actBucheron.setIngredient(iSucre);
		Enigme actMaire= new Enigme("Qui est-ce?", "Le personnage qui a des lunettes", "Mon personnage porte un pantalon, mais n'a pas de t-shirt de la couleur du ciel... Qui est-ce?", "Le personnage qui a un chapeau de gendarme", "Le personnage qui a les cheveux longs", "Le personnage qui a des lunettes");
		actMaire.setIngredient(iFarine);
		Enigme actFermiere = new Enigme("Poulets et lapins", "3 lapins, 2 poules", "Dans un enclos, la fermi�re a des poules et des lapins. Elle y voit 5 t�tes et 16 pattes. Combien y a-t-il de poules et de lapins? ", "1 lapin, 4 poules", "2 lapins, 3 poules", "3 lapins, 2 poules");
		actFermiere.setIngredient(iBeurre);
		Enigme actPecheur = new Enigme("Les n�nuphars", "9", "Les n�nuphars doublent de volume chaque nuit. Au bout de 10 nuits le lac est rempli de n�nuphars. Combien de jours faut-il pour remplir la moiti� du lac ?", "9", "5", "7");
		actPecheur.setIngredient(iOeufs);
		Enigme actChocolat = new Enigme("Le chocolat", "Me ramasser","Bonjour ! Je suis Chocolette ! Que voulez vous faire de moi ?","Me ramasser", "Me manger", "Me laisser ici");
		actChocolat.setIngredient(iChocolat);
		
		// Initialisation des ingr�dients		
		Bonus bFouet = new Bonus("Fouet", ivFouet, false, positionFouet, 5, zFouet, carteVillage);
		Bonus bMaryse = new Bonus("Maryse", ivMaryse, false, positionMaryse, 10, zMaryse, carteLac);
		Bonus bPapier = new Bonus("Papier", ivPapier, false, positionPapier, 10, zPapier, carteForet);
		Bonus bPlaque = new Bonus("Plaque", ivPlaque, false, positionPlaque, 5, zPlaque, carteFerme);
		Bonus bSaladier = new Bonus("Saladier", ivSaladier, false, positionSaladier, 15, zSaladier, carteMaison); 
		
		FileInputStream fcoffre = new FileInputStream("./images/divers/coffre.png");
		ImageView ivCoffre = new ImageView(new Image(fcoffre));
		ivCoffre.setX(400);
		ivCoffre.setY(300);
		
		Coffre coffre = new Coffre(new Position(380,280), new Position(500,400), ivCoffre);

		
		ivVie3.setX(0);
		ivVie3.setY(0);
		
		ivVie2.setX(0);
		ivVie2.setY(0);
		
		ivVie1.setX(0);
		ivVie1.setY(0);
		
		// Initialisation des personnages et du joueur
		Joueur joueurJulia = new Joueur(10, "Julia", positionJulia, carteVillage, ivJulia);
		Personnage persoBucheron = new Personnage(actBucheron, "Bucheron", positionBucheron, ivBucheron, iSucre, carteForet, zBucheron);
		Personnage persoFermiere = new Personnage(actFermiere, "Fermiere", positionFermiere, ivFermiere, iBeurre, carteFerme,  zFermiere);
		Personnage persoPecheur = new Personnage(actPecheur, "Pecheur", positionPecheur, ivPecheur, iOeufs,carteLac, zPecheur);
		Personnage persoQuies1 = new Personnage("Quies1", positionQuies1, ivQuies1, carteVillage, zQuies1);
		Personnage persoQuies2 = new Personnage("Quies2", positionQuies2, ivQuies2, carteVillage, zQuies2);
		Personnage persoQuies3 = new Personnage("Quies3", positionQuies3, ivQuies3, carteVillage, zQuies3);
		Personnage persoMaire = new Personnage(actMaire, "Maire", positionMaire, ivQuiesMaire, iFarine, carteVillage, zMaire);
		Personnage persoChocolat = new Personnage(actChocolat,"Chocolette",positionChocolat, ivChocolat,iChocolat,carteMine,zChoco);
		Carte.ajouterPersonnage(persoBucheron);
		Carte.ajouterPersonnage(persoFermiere);
		Carte.ajouterPersonnage(persoPecheur);
		Carte.ajouterPersonnage(persoMaire);
		Carte.ajouterPersonnage(persoQuies1);
		Carte.ajouterPersonnage(persoQuies2);
		Carte.ajouterPersonnage(persoQuies3);
		Carte.ajouterPersonnage(persoChocolat);
		Carte.ajouterBonus(bFouet);
		Carte.ajouterBonus(bMaryse);
		Carte.ajouterBonus(bPapier);
		Carte.ajouterBonus(bPlaque);
		Carte.ajouterBonus(bSaladier);
		carteVillage.personnageVisible();
		carteVillage.bonusVisible();
		
		Group root = new Group();
		
		Scene scene = new Scene(root, 533, 407, Color.WHITE);
		
		// Utilisation des options + d�placement
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				
				switch(event.getCode()) {
				case M: 
					menu(stage);
					break;
				case I:
					Joueur.Inventaire(stage);
					break;
				}
				Carte c = null;
				try {
					c = joueurJulia.seDeplacer(event);
					if(actChocolat.getReussi()) {
						ivChocolat.setVisible(false);
					}
					if(Joueur.getVie() == 1) {
						root.getChildren().set(15, ivVie2);
					}
					if(Joueur.getVie() == 2) {
						root.getChildren().set(15, ivVie1);
					}
					if(Joueur.getVie() == 3) {
						redemarrer(stage);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				if(c != null){
					root.getChildren().set(0, c.getImage());
					joueurJulia.setCarte(c);
				}
			}
		});
		
		root.getChildren().addAll(carteVillage.getImage(), persoQuies1.getImage(), 
		persoQuies2.getImage(), persoQuies3.getImage(), persoMaire.getImage(), persoBucheron.getImage(),
		persoPecheur.getImage(),persoFermiere.getImage(), bFouet.getImageView(), bMaryse.getImageView(), 
		bPapier.getImageView(), bPlaque.getImageView(), bSaladier.getImageView(), ivCoffre, joueurJulia.getImage(), ivVie3, ivChocolat);
		stage.setTitle("Cookies Mama");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
				
		// Message de bienvenue	
		FileInputStream maireMsg = new FileInputStream("./images/personnages/quiesMaire.png");
		Image imMaireMsg = new Image(maireMsg);
		ImageView  ivMaireMsg = new ImageView();
		ivMaireMsg.setImage(imMaireMsg);		
		
		Stage msgBienvenue = new Stage();
		msgBienvenue.initModality(Modality.APPLICATION_MODAL);
		msgBienvenue.initOwner(stage);
		VBox msgBienvenueBox = new VBox(30);
		Text textMsg = new Text(Jeu.msgBienvenue());
		
		Button btnMsg = new Button();
		btnMsg.setText("Compris !");		
		btnMsg.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				fermer(msgBienvenue);
			}
		});
		
		Scene sceneMsg = new Scene (msgBienvenueBox, 850, 500);
		msgBienvenueBox.getChildren().addAll(textMsg, ivMaireMsg, btnMsg);
		msgBienvenue.setScene(sceneMsg);
		msgBienvenue.setResizable(false);
		msgBienvenue.setTitle("Bienvenue");
		msgBienvenue.show();
	}
	



	/**
	 * M�thode permettant d'afficher le menu. Quatres options sont disponibles : -
	 * Aide : conna�tre les commandes disponibles - Red�marrer : red�marre le jeu -
	 * Quitter : quitte le jeu - Fermer : ferme le menu
	 * 
	 * @param stage
	 */
	public static void menu(Stage stage) {
		Stage menu = new Stage();
		menu.initModality(Modality.APPLICATION_MODAL);
		menu.initOwner(stage);
		GridPane menuBox = new GridPane();

		Button btnRedemarrer = new Button();
		btnRedemarrer.setPrefWidth(130);
		btnRedemarrer.setText("Red�marrer");
		btnRedemarrer.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				menu.close();
				redemarrer(stage);
			}
		});
		
		Button btnQuitter = new Button();
		btnQuitter.setPrefWidth(130);
		btnQuitter.setText("Quitter");
		btnQuitter.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				quitter(stage, menu);
			}
		});
		
		Button btnAide = new Button();
		btnAide.setPrefWidth(130);
		btnAide.setText("Aide ?");
		btnAide.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				aide(menu);
			}
		});
		
		Button btnFermer = new Button();
		btnFermer.setPrefWidth(130);
		btnFermer.setAlignment(Pos.CENTER);
		btnFermer.setText("Fermer");
		btnFermer.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				fermer(menu);
			}
		});
		
		GridPane.setRowIndex(btnAide, 0);
		GridPane.setColumnIndex(btnAide, 0);
		
		GridPane.setRowIndex(btnRedemarrer, 1);
		GridPane.setColumnIndex(btnRedemarrer, 0);
		
		GridPane.setRowIndex(btnQuitter, 2);
		GridPane.setColumnIndex(btnQuitter, 0);
		
		GridPane.setRowIndex(btnFermer, 3);
		GridPane.setColumnIndex(btnFermer, 0);
		
		RowConstraints row1 = new RowConstraints(50);
		RowConstraints row2 = new RowConstraints(50);
		RowConstraints row3 = new RowConstraints(50);
		RowConstraints row4 = new RowConstraints(50);
		
		menuBox.getRowConstraints().addAll(row1, row2, row3, row4);

		menuBox.getChildren().addAll(btnAide, btnRedemarrer, btnQuitter, btnFermer);
		Scene sceneMenu = new Scene (menuBox, 100, 220);
		menu.setTitle("Menu");
		menu.setScene(sceneMenu);
		
		menu.setResizable(false);
		menu.show();
	}
	
	
	/**
	 * M�thode permettant de retourner le message de bienvenue au d�marrage du jeu.
	 * @return
	 */
	public static String msgBienvenue() {
		return "  \n  Bonjour Julia! Comment vas-tu aujourd'hui ? \r\n" + 
				"  C'est aujourd'hui que ton mari rentre, n'est-ce pas ? J'ai entendu dire que tu voulais cuisiner des cookies, as-tu tous les ingr�dients ? \r\n" + 
				"  NON? Julia... Tu es une vraie t�te en l'air... \r\n" + 
				"  ...\r\n" + 
				"  ...\r\n" + 
				"  ...\r\n\n" + 
				"  Bon, les habitants t\'aiment beaucoup, et je suis s�r qu'ils seront ravis de t'aider � r�colter ce qu\'il te manque. \r\n" + 
				"  La fermi�re fait du beurre, le p�cheur garde toujours des oeufs avec lui. Je pense que le b�cheron a encore le sucre qu'il avait emprunt� � sa grand-m�re." + 
				"  \n  Pour les p�pites de chocolat... C'est le tr�sor cach� de la mine, donc tu en trouveras l� bas. \r\n" + 
				"  Et pour la farine, c\'est moi qui t\'en donnerai, tu n\'auras qu'� venir me trouver sur la place.\r\n" + 
				"  \n  Tu ne sais plus te d�placer ???? Julia, enfin... Il te suffit d'utiliser les fl�ches de ton clavier, ou encore les touches ZQSD." + 
				"  \n  Pour parler � quelqu'un, il te suffit d'utiliser la touche E, et pour ramasser les objets, la touche R." + 
				"  \n  Pour te promener � travers les diff�rents endroits, il faut que tu suives ton plan, et que tu appuies sur A pour changer de zone ! \r\n" + 
				"  N'oublie pas: concentre-toi, les ingr�dients ne te seront pas donn�s comme par magie, il te faudra r�fl�chir...\r\n" + 
				"  Ballade toi dans chaque nouvel endroit, tu trouveras s�rement quelques objets cach�s... \r\n" + 
				"  Tout ce que tu trouveras ou gagneras sera rang� dans ton sac � dos." + 
				"  \n\n  Bon courage !\n  PS : Appuyez sur la touche M pour voir s'ouvrir le champ des possibles :-)";
	}
}
