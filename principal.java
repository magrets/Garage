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
			System.out.println("1 : Cr�er une nouvelle voiture");
			System.out.println("2 : Modifier une voiture");
			System.out.println("3 : Consulter une voiture voitures");
			System.out.println("4 : Lister les voitures");
			
			choix = sc.nextInt();
			
			switch(choix)
			{
			case 1:
				System.out.println("Cr�ation d'une voiture !");
				creationVoiture();
				break;
			case 2:
				System.out.println("Modification d'une voiture !");
				modificationVoiture();
				break;
			case 3:
				System.out.println("Consultation voiture");
				consultationVoiture();
				break;
			case 4:
				System.out.println("Liste des voitures pr�sentent dans le garage :");
				listerVoiture();
				break;
			default:
				System.out.println("Commande inconnu !");
			}
		}while(choix < 1 && choix > 4);
		
		/*System.out.println("Cr�er une nouvelle voiture");
		System.out.println("Cr�er une nouvelle voiture");
		System.out.println("Cr�er une nouvelle voiture");*/
		
	}
	
	static void creationVoiture()
	{
		
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
