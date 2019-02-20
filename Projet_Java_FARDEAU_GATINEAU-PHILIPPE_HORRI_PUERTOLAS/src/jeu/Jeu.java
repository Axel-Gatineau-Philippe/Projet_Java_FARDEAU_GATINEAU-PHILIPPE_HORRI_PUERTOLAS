package jeu;

public class Jeu {
	private Personne personne;
	private Carte map;
	
	
	public Jeu(Personne p, Carte m) {
		super();
		personne = p;
		map = m;
	}

	public void demarrerJeu() {}
	
	public String afficherMenu(){
		return null;
	}
	
	public void quitter() {}
	
	public void reset() {}
	
	public static String msgBienvenue() {
		return "  \n  Bonjour Julia! Comment vas-tu aujourd'hui? \r\n" + 
				"  C'est aujourd'hui que ton mari rentre, n'est-ce pas? J'ai entendu dire que tu voulais cuisiner des cookies, as-tu tous les ingr�dients? \r\n" + 
				"  NON? Julia... Tu es une vraie t�te en l'air... \r\n" + 
				"  \r\n" + 
				"  ...\r\n" + 
				"  ...\r\n" + 
				"  ...\r\n\n" + 
				"  Bon, les habitants t\'aiment beaucoup, et je suis s�r qu'ils seront ravis de t'aider � r�colter ce qu\'il te manque. \r\n" + 
				"  La fermi�re fait du beurre, le p�cheur garde toujours des oeufs avec lui. Je pense que le b�cheron a encore le sucre qu'il avait emprunt� � sa grand-m�re." + 
				"  \n  Pour les p�pites de chocolat... C'est le tr�sor cach� de la mine, donc tu en trouveras l� bas. \r\n" + 
				"  Et pour la farine, c\'est moi qui t\'en donnerai, tu n\'auras qu'� venir me trouver sur la place.\r\n" + 
				"  \n  Tu ne sais plus te d�placer???? Julia, enfin... Il te suffit d'utiliser les fl�ches de ton clavier, ou encore les touches ZQSD." + 
				"  \n  Pour parler � quelqu'un, il te suffit d'utiliser la touche E, et pour ramasser les objets, la touche R." + 
				"  \n  Pour te promener � travers les diff�rents endroits, il faut que tu suives ton plan, et que tu appuies sur A pour changer de zone! \r\n" + 
				"  N'oublie pas: concentre-toi, les ingr�dients ne te seront pas donn�s comme par magie, il te faudra r�fl�chir...\r\n" + 
				"  Ballade toi dans chaque nouvel endroit, tu trouveras s�rement quelques objets cach�s... \r\n" + 
				"  Tout ce que tu trouveras ou gagneras sera rang� dans ton sac � dos." + 
				"  \n\n  Bon courage!";
	}
}
