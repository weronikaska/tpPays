package tpPays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub*
		
		Pays monPays = new Pays("France", "français" , "euro" ); 
		Capitale maCapitale = new Capitale ("Paris" , 1052585 , 544215 , monPays);
		Continent monContinent = new Continent ("Europe" , 234567876);
		
		Ville maVille = new Ville ("Evry" , 24596 , 458554 , monPays);
		Ville uneVille = new Ville ("Ivry" , 5566235 , 854265, monPays);
		Ville saVille = new Ville ("lyon" , 546235 , 524525 , monPays);
		
		
		//System.out.println(monPays);
		
		
		// ajouter une ville a un pays
		//System.out.println(monPays.ajouterUneVille(maVille));
		//System.out.println(monPays.ajouterUneVille(uneVille));
		//System.out.println(monPays.ajouterUneVille(saVille));
		
		//System.out.println(monPays.supprimerVille(uneVille));
		
		//System.out.println(monPays.toString());
		
		//System.out.println(monPays.rechercherVille(uneVille));

		
		//----------------------------Menu----------------
	/*	
		Continent monContinent = new Continent("Europe", 23456785);
		Scanner clavier = new Scanner(System.in);
		int choix;

		do {
			System.out.println("\nMENU CONTINENT / PAYS / VILLE");
			System.out.println("\t 1- Ajouter un Pays");
			System.out.println("\t 2- Ajouter une Ville");
			System.out.println("\t 3- Afficher le continent");
			System.out.println("\t 4- Rechercher un Pays");
			System.out.println("\t 5- Rechercher une Ville (dans un pays)");
			System.out.println("\t 6- Supprimer un Pays");
			System.out.println("\t 7- Supprimer une Ville (dans un pays)");
			System.out.println("\t 0- Quitter");
			System.out.println("Votre choix ?");
			choix = clavier.nextInt();
			clavier.nextLine(); // vide le buffer apres nextInt()

			switch (choix) {

				case 1:
					System.out.println("Nom du pays :");
					String nomPays = clavier.nextLine();
					System.out.println("Langue :");
					String langue = clavier.nextLine();
					System.out.println("Monnaie :");
					String monnaie = clavier.nextLine();

					Pays nouveauPays = new Pays(nomPays, langue, monnaie);
					monContinent.ajouterUnPays(nouveauPays);
					System.out.println("Pays ajoute !");
					break;

				case 2:
					System.out.println("Dans quel pays ajouter la ville ? (nom du pays)");
					String nomPaysVille = clavier.nextLine();
					Pays paysTrouve = monContinent.rechercherPays(nomPaysVille);

					if (paysTrouve != null) {
						System.out.println("Nom de la ville :");
						String nomVille = clavier.nextLine();
						System.out.println("Nombre d'habitants :");
						int nbHabitants = clavier.nextInt();
						System.out.println("Superficie :");
						double superficie = clavier.nextDouble();
						clavier.nextLine();

						new Ville(nomVille, nbHabitants, superficie, paysTrouve);
						System.out.println("Ville ajoutee !");
					} else {
						System.out.println("Ce pays n'existe pas.");
					}
					break;

				case 3:
					System.out.println(monContinent);
					break;

				case 4:
					System.out.println("Nom du pays a rechercher :");
					String rechercherPays = clavier.nextLine();
					Pays unPays = monContinent.rechercherPays(rechercherPays);
					if (unPays != null) {
						System.out.println(unPays);
					} else {
						System.out.println("Ce pays n'existe pas");
					}
					break;

				case 5:
					System.out.println("Dans quel pays chercher la ville ?");
					String nomPaysRechVille = clavier.nextLine();
					Pays paysRechVille = monContinent.rechercherPays(nomPaysRechVille);

					if (paysRechVille != null) {
						System.out.println("Nom de la ville a rechercher :");
						String nomVilleRech = clavier.nextLine();
						Ville uneVille = new Ville();
						uneVille.setNom(nomVilleRech);
						Ville villeTrouvee = paysRechVille.rechercherVille(uneVille);

						if (villeTrouvee != null) {
							System.out.println(villeTrouvee);
						} else {
							System.out.println("Cette ville n'existe pas");
						}
					} else {
						System.out.println("Ce pays n'existe pas");
					}
					break;

				case 6:
					System.out.println("Nom du pays a supprimer :");
					String nomPaysSupp = clavier.nextLine();
					Pays paysASupprimer = monContinent.rechercherPays(nomPaysSupp);

					if (paysASupprimer != null) {
						boolean supprime = monContinent.supprimerPays(paysASupprimer);
						System.out.println("Pays supprimer");
					} else {
						System.out.println("Ce pays n'existe pas");
					}
					break;

				case 7:
					System.out.println("Dans quel pays supprimer la ville ?");
					String nomPaysSuppVille = clavier.nextLine();
					Pays paysSuppVille = monContinent.rechercherPays(nomPaysSuppVille);

					if (paysSuppVille != null) {
						System.out.println("Nom de la ville a supprimer :");
						String nomVilleSupp = clavier.nextLine();
						Ville villeASupprimer = new Ville();
						villeASupprimer.setNom(nomVilleSupp);
						Ville trouvee = paysSuppVille.rechercherVille(villeASupprimer);

						if (trouvee != null) {
							boolean supprime = paysSuppVille.supprimerVille(trouvee);
							System.out.println(supprime ? "Ville supprimee " : "Erreur lors de la suppression.");
						} else {
							System.out.println("Cette ville n'existe pas");
						}
					} else {
						System.out.println("Ce pays n'existe pas");
					}
					break;

				case 0:
					System.out.println("Fin du programme.");
					break;
			}
		} while (choix != 0);

		clavier.close();
	}*/
	}
}
