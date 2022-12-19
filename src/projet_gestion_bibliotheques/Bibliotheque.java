package projet_gestion_bibliotheques;
import java.util.LinkedList;


public class Bibliotheque {
	// INSTANCES DE CLASSE
	 private String ville;
	 private int capaciteVisiteurs;
	 private int capaciteObjets;
	 
	 public static int nombreDeBibliotheque = 0;
	 
	 //Il n'y a qu'une seule bibliothèque par ville.
	 
// public static String[] mesVilles = new String[50]; avec cette commande nous pouvons créer une liste avec les villes existante.
//Par contre, pour parcourir cette liste et trouver si la ville existe déjà il faut faire une boucle For.
// Par conséquent, nous allons utiliser LinkedList afin de parcourir plus facilement la liste avec une boucle if.
	 
	 public static LinkedList<String> mesVilles = new LinkedList();
	 
	 
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		if (mesVilles.contains(ville)) {
			
		}
		this.ville = ville;
		mesVilles.add(ville);
	}
	//La capacité visiteurs varient de 30 à 250 visiteurs/jours

	public int getCapaciteVisiteurs() {
		return capaciteVisiteurs;
	}
	public void setCapaciteVisiteurs(int capaciteVisiteurs) {
		this.capaciteVisiteurs = capaciteVisiteurs;
	}
	
	
	public int getcapaciteObjets() {
		return capaciteObjets;
	}
	public void setcapaciteObjets(int capaciteObjets) {
		this.capaciteObjets = capaciteObjets;
	}
	
	///  CONSTRUCTEURS
    public Bibliotheque () {
        Bibliotheque.nombreDeBibliotheque += 1;
    }
   
}
