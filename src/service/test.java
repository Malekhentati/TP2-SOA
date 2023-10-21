package service;

import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        BanqueService b = new BanqueService();
        b.conversion(360);
        
        

        // Exemple d'ajout de comptes
        Compte compte1 = new Compte(1, 1000.0, "2023-10-21");
        Compte compte2 = new Compte(2, 1500.0, "2023-10-21");

        b.comptes.add(compte1);
        b.comptes.add(compte2);

        // Exemple d'utilisation des méthodes
        Compte compteRecherche = b.getCompte(1);
        if (compteRecherche != null) {
            System.out.println("Solde du compte 1 : " + compteRecherche.getSolde());
        } else {
            System.out.println("Compte non trouvé");
        }

        List<Compte> listeComptes = b.getComptes();
        System.out.println("Liste de tous les comptes :");
        for (Compte compte : listeComptes) {
            System.out.println("Code du compte : " + compte.getCode());
        }
    }
	}

