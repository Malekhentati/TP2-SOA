package service;

import java.util.ArrayList;
import java.util.List;

public class BanqueService {

		public double conversion(double montant) {
			
			return montant * 336;
		}
		 public List<Compte> comptes = new ArrayList<>();

		    // Méthode pour obtenir un compte par son code
		    public Compte getCompte(int code) {
		        for (Compte compte : comptes) {
		            if (compte.getCode() == code) {
		                return compte;
		            }
		        }
		        return null; // Retourner null si le compte n'est pas trouvé
		    }

		    // Méthode pour obtenir la liste de tous les comptes
		    public List<Compte> getComptes() {
		        return comptes;
		    }
		
	}


