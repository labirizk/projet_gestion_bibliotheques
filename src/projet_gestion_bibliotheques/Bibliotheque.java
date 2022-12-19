package projet_gestion_bibliotheques;
import java.util.LinkedList;


public class Bibliotheque {
	// INSTANCES DE CLASSE
	 private String ville;
	 private int capaciteVisiteurs;
	 private int capaciteObjets;
	 private int nombreEmployes;
	 
	 public static int nombreDeBibliotheque = 0;
	 
	 final static int capaciteVisiteursMin = 30;
	 final static int capaciteVisiteursMax = 250;
	 
	 final static int capaciteObjectssMin = 1000;
	 final static int capaciteObjectssMax = 150000;
	 
	 final static int nombreEmployeMin = 10;
	 final static int nombreEmployeMax = 100;
	 
	 
	 //Il n'y a qu'une seule bibliothèque par ville.
	 
// public static String[] mesVilles = new String[50]; avec cette commande nous pouvons créer une liste avec les villes existante.
//Par contre, pour parcourir cette liste et trouver si la ville existe déjà il faut faire une boucle For.
// Par conséquent, nous allons utiliser LinkedList afin de parcourir plus facilement la liste avec une boucle if.
	 
	 public static LinkedList<String> mesVilles = new LinkedList();
	 
	 
	public String getVille() {
		return ville;
	}
	//if (mesVilles.contains(ville) == false) ?? 
	
	public void setVille(String ville) {
		if (!mesVilles.contains(ville)) {
			
		}
		this.ville = ville;
		mesVilles.add(ville);
	}
	//La capacité visiteurs varient de 30 à 250 visiteurs/jours

	public int getCapaciteVisiteurs() {
		return capaciteVisiteurs;
	}
	
	public void setCapaciteVisiteurs(int capaciteVisiteurs) {
		if (capaciteVisiteurs > capaciteVisiteursMin && capaciteVisiteurs < capaciteVisiteursMax) {
			
            System.out.println("Vous pouvez rentrer un visiteur ");
		}
		else  {
            System.out.println("Attention, la capacité visiteurs est en dehors des limites");
		}
		this.capaciteVisiteurs = capaciteVisiteurs;
		
	return;
	}
	

	
	public int getcapaciteObjets() {
		return capaciteObjets;
	}
	
	// La capacité items varie de 1000 à 150 000 items par bibliothèque.
	public void setcapaciteObjets(int capaciteObjets) {
		if (capaciteObjets > capaciteObjectssMin && capaciteObjets < capaciteObjectssMax) {
			System.out.println("Vous pouvez rentrer un objet");
		}
		else {
			 System.out.println("Attention, la capacité des objets est en dehors des limites");	
		}
		this.capaciteObjets = capaciteObjets;
		return;
	}
	
	// Le nombre d'employé varie de 10 à 100 par bibliothèque.
	
	public int getNombreEmployes() {
		return nombreEmployes;
	}
		
	public void setNombreEmploye(int nombreEmployes) {
		if (nombreEmployes > nombreEmployeMin && nombreEmployes < nombreEmployeMax) {
	            System.out.println("Vous pouvez ajouter une biliothèque avec ce nombre d'employés");
		}
		else  {
	            System.out.println("Attention, le nombre d'employés dépasse les limites");
		}
		this.nombreEmployes = nombreEmployes;
		return;
	}
	///  CONSTRUCTEURS
	public Bibliotheque () {
        Bibliotheque.nombreDeBibliotheque += 1;
    }
   
    
    
    
    
    
    
    
}
