import java.util.Scanner;

public class principal {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int choix = 0;
			do {
				System.out.println("Bienvenue dans le garage !");
				System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
				System.out.println("Que voulez vous faire ?");
				System.out.println("0 : Sortir du garage");
				System.out.println("1 : Créer une nouvelle voiture");
				System.out.println("2 : Modifier une voiture");
				System.out.println("3 : Consulter une voiture");
				System.out.println("4 : Lister les voitures");
				
				/*System.out.println("Créer une nouvelle voiture");
				System.out.println("Créer une nouvelle voiture");
				System.out.println("Créer une nouvelle voiture");*/
				choix = sc.nextInt();
				
				switch(choix)
				{
				case 0:
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					System.out.println("Fermeture du garage !");
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					break;
				case 1:
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					System.out.println("Création d'une voiture !");
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					creationVoiture();
					break;
				case 2:
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					System.out.println("Modification d'une voiture !");
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					modificationVoiture();
					break;
				case 3:
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					System.out.println("Consultation voiture");
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					consultationVoiture();
					break;
				case 4:
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					System.out.println("Liste des voitures présentent dans le garage :");
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					listerVoiture();
					break;
				default:
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
					System.out.println("Commande inconnu !");
					System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
				}
			}while(choix != 0);
	}
	
	static void creationVoiture()
	{
		String nom;
		String marque;
		double prix;
		
		System.out.println("Quel est le nom de la voiture :");
		sc.nextLine();
		nom = sc.nextLine();
		System.out.println("Quelle est la marque de la voiture :");
		marque = sc.nextLine();
		System.out.println("Quel est le prix de la voiture :");
		prix = sc.nextDouble();
		
		Voiture voiture = new Voiture(nom, marque, prix);
	}
	
	static void modificationVoiture()
	{
		
	}
	
	static void consultationVoiture()
	{
		
	}
	
	static void listerVoiture()
	{
		
	}
}
