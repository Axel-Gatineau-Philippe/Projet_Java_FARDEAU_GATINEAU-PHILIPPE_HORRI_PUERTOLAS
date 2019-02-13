package fenetre;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import jeu.Ingredient;
import jeu.Joueur;
import jeu.MapAnnexe;
import jeu.MapPrincipale;
import jeu.Carte;
import jeu.Deplacement;
import jeu.Objet;
import jeu.Personnage;
import jeu.Position;
import jeu.Zone;

public class MainJL extends Application {

	public MainJL() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 543, 416, Color.WHITE);
		FileInputStream file2 = new FileInputStream("./images/personnages/julia.png");
		Image image = new Image(file2);
		ImageView c = new ImageView();
		c.setImage(image);
		/*c.setY(100);
		c.setX((scene.getWidth() / 2) - c.getFitWidth() / 2);*/

		FileInputStream file = new FileInputStream("./images/maps/centre.png");
		Image image4 = new Image(file);
		ImageView i = new ImageView();
		i.setImage(image4);
		
		FileInputStream file4 = new FileInputStream("./images/maps/foret.png");
		Image image2 = new Image(file4);
		ImageView i2 = new ImageView();
		i2.setImage(image2);
		MapAnnexe ma = new MapAnnexe("Foret",i2, 0,0);
		
		Text t = new Text("Zone\nd'int�raction\n(appuyer sur 'E'\npour int�ragir)");
		t.setX(410);
		t.setY(30);

		FileInputStream file3 = new FileInputStream("./images/ingredients/beurre.png");
		Image image3 = new Image(file3);
		
		Zone z = new Zone(new Position(450,150), new Position(546,300), Deplacement.DROITE, ma);
		
		MapPrincipale m = new MapPrincipale("Centre",i, 0,0);
		m.ajouterZone(z);
		Joueur j = new Joueur(5, "JULIA", new Position(200,200), m, c);
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				
				Carte c = j.seDeplacer(event);
				if(c != null){
					root.getChildren().set(0, c.getImage());
					j.setMap(c);
					j.getImage().setY(200);
					j.getImage().setX(200);
				}
				/*switch (event.getCode()) {
				case UP:
					if (c.getX() < 536 && c.getX() > -6 && c.getY() > 0 && c.getY() < 395)
						c.setY(c.getY() - 5);
					break;
				case DOWN:
					if (c.getX() < 536 && c.getX() > -6 && c.getY() > -6 && c.getY() < 380)
						c.setY(c.getY() + 5);
					break;
				case LEFT:
					if (c.getX() < 536 && c.getX() > 0 && c.getY() > -6 && c.getY() < 395)
						c.setX(c.getX() - 5);
					break;
				case RIGHT:
					if (c.getX() < 530 && c.getX() > -6 && c.getY() > -6 && c.getY() < 395)
						c.setX(c.getX() + 5);
					break;
				case E:
					if (c.getX() > 400 && c.getX() < 546 && c.getY() >= 0 && c.getY() < 100) {
						
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Interaction Objet");
						alert.setHeaderText("Vous avez int�ragi avec un objet en pressant la touche 'E'.");
						alert.setContentText("Cliquez sur la croix pour fermer.");
						alert.showAndWait();
					}
					break;
				}*/
			}
		});

		
		root.getChildren().addAll(i, c, t);
		stage.setTitle("JavaFX Scene Graph Demo");
		stage.setScene(scene);
		stage.show();

	}

}
