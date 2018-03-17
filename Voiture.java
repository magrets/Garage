
public class Voiture {
	//Caractéristiques
	String nom;
	String marque;
	double prix;
	
	//Méthodes
	public Voiture() 
	{
		System.out.println("Entrer d'une nouvelle voiture au garage !");
		nom ="Inconnu";
		marque ="Inconnu";
		prix = 0;
	}
	
	public Voiture(String pNom, String pMarque, double pPrix) {
		System.out.println("Entrer d'une nouvelle voiture au garage !");
		nom = pNom;
		marque = pMarque;
		prix = pPrix;
	}
}
