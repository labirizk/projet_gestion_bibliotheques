package projet_gestion_bibliotheques;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
//import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

public class start1 {
	public static void main(String[] args) {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

		LocalDateTime dateEmbauche1 = LocalDateTime.parse("2022-01-01 08:00", formatter);
		LocalDateTime dateEmbauche2 = LocalDateTime.parse("2022-01-02 08:00", formatter);
		LocalDateTime dateEmbauche3 = LocalDateTime.parse("2022-01-03 08:00", formatter);
		LocalDateTime dateEmbauche4 = LocalDateTime.parse("2022-01-04 08:00", formatter);

		Poste posteDirecteur = new Poste("directeur");
		Poste posteEmployePoly = new Poste("employe polyvalent");

		Employe directeur1 = new Employe("Nicolazic", "Damien", "adresse directeur 1", dateEmbauche1, 80000f,
				"direction", posteDirecteur);
		Employe directeur2 = new Employe("Abi Rizk", "Lara", "adresse directeur 2", dateEmbauche2, 80000f, "direction",
				posteDirecteur);
		Employe directeur3 = new Employe("Phoeung", "Geneviève", "adresse directeur 3", dateEmbauche3, 80000f,
				"direction", posteDirecteur);
		Employe directeur4 = new Employe("Delhaye", "Sadi", "adresse directeur 4", dateEmbauche4, 80000f, "direction",
				posteDirecteur);

		Employe employe1 = new Employe("Lavilley", "Viencent", "adresse employe 1", dateEmbauche1, 20000f, "salarie",
				posteEmployePoly);
		Employe employe2 = new Employe("Larabi", "Hakim", "adresse employe 2", dateEmbauche1, 20000f, "salarie",
				posteEmployePoly);
		Employe employe3 = new Employe("Laurent", "Marc", "adresse employe 3", dateEmbauche1, 20000f, "salarie",
				posteEmployePoly);

		Employe employe4 = new Employe("Montana", "Camilo", "adresse employe 4", dateEmbauche1, 20000f, "salarie",
				posteEmployePoly);
		Employe employe5 = new Employe("Nataf", "Martin", "adresse employe 5", dateEmbauche1, 20000f, "salarie",
				posteEmployePoly);
		Employe employe6 = new Employe("Tagniy-Hamou", "lillia", "adresse employe 6", dateEmbauche1, 20000f, "salarie",
				posteEmployePoly);

		Employe employe7 = new Employe("Ottmani", "Zaid", "adresse employe 7", dateEmbauche1, 20000f, "salarie",
				posteEmployePoly);
		Employe employe8 = new Employe("Lecoq", "Ludovic", "adresse employe 8", dateEmbauche1, 20000f, "salarie",
				posteEmployePoly);
		Employe employe9 = new Employe("Fernandes", "Stéphane", "adresse employe 9", dateEmbauche1, 20000f, "salarie",
				posteEmployePoly);

		Employe employe10 = new Employe("Oueslati", "Wassim", "adresse employe 10", dateEmbauche1, 20000f, "salarie",
				posteEmployePoly);
		Employe employe11 = new Employe("Nebot Almiñana", "Javier", "adresse employe 11", dateEmbauche1, 20000f,
				"salarie", posteEmployePoly);
		Employe employe12 = new Employe("M-Louise", "Marvin", "adresse employe 12", dateEmbauche1, 20000f, "salarie",
				posteEmployePoly);

		Membre Membre11 = new Membre("Hanotin", "Ludovic", "571 Route de Toulouse,33400 Toulouse", dateEmbauche2);
		Membre Membre12 = new Membre("Abi Rizk", "Jean", "33 Rue Condillac,33000 Bordeaux", dateEmbauche2);
		Membre Membre13 = new Membre("Lilo", "Lilia", "La vache,33400 Toulouse,", dateEmbauche2);

		Membre Membre21 = new Membre("Nicalo", "Vivi", "La gare de Toulouse, 33400 Toulouse", dateEmbauche2);
		Membre Membre22 = new Membre("nom22", "prenom22", "adresse22", dateEmbauche2);
		Membre Membre23 = new Membre("nom23", "prenom23", "adresse23", dateEmbauche2);

		Membre Membre31 = new Membre("nom31", "prenom31", "adresse31", dateEmbauche2);
		Membre Membre32 = new Membre("nom32", "prenom32", "adresse32", dateEmbauche2);
		Membre Membre33 = new Membre("nom32", "prenom32", "adresse32", dateEmbauche2);

		Membre Membre41 = new Membre("nom41", "prenom41", "adresse41", dateEmbauche2);
		Membre Membre42 = new Membre("nom42", "prenom42", "adresse42", dateEmbauche2);
		Membre Membre43 = new Membre("nom43", "prenom43", "adresse43", dateEmbauche2);

		// Creation des Objet, Employe et Membre
		LinkedList<Objet> objetList1 = new LinkedList<Objet>();
		LinkedList<Objet> objetList2 = new LinkedList<Objet>();
		LinkedList<Objet> objetList3 = new LinkedList<Objet>();
		LinkedList<Objet> objetList4 = new LinkedList<Objet>();

		LinkedList<Employe> empList1 = new LinkedList<Employe>();
		LinkedList<Employe> empList2 = new LinkedList<Employe>();
		LinkedList<Employe> empList3 = new LinkedList<Employe>();
		LinkedList<Employe> empList4 = new LinkedList<Employe>();

		LinkedList<Membre> menList1 = new LinkedList<Membre>();
		LinkedList<Membre> menList2 = new LinkedList<Membre>();
		LinkedList<Membre> menList3 = new LinkedList<Membre>();
		LinkedList<Membre> menList4 = new LinkedList<Membre>();

		//Ajout employe dans bibio
		empList1.add(employe1);
		empList1.add(employe2);
		empList1.add(employe3);
		empList1.add(employe4);
		empList1.add(employe5);
		
		empList2.add(employe6);
		empList2.add(employe7);
		empList2.add(employe8);
		
		empList3.add(employe9);
		empList3.add(employe10);
		
		empList4.add(employe11);
		empList4.add(employe12);
		
		//Ajout membre dans bibio
		menList1.add(Membre11);
		menList1.add(Membre12);
		menList1.add(Membre13);
		
		menList2.add(Membre21);
		menList2.add(Membre22);
		menList2.add(Membre23);
		
		menList3.add(Membre31);
		menList3.add(Membre32);
		menList3.add(Membre33);
		
		menList4.add(Membre41);
		menList4.add(Membre42);
		menList4.add(Membre43);

		Bibliotheque bibBezon = new Bibliotheque("Bezon", 250, 120000, 99, directeur1, empList1, menList1, objetList1);
		Bibliotheque bibToulouse = new Bibliotheque("Toulouse", 200, 100000, 80, directeur2, empList2, menList2,
				objetList2);
		Bibliotheque bibVilleurbanne = new Bibliotheque("Villeurbanne", 150, 50000, 50, directeur3, empList3, menList3,
				objetList3);
		Bibliotheque bibSophia = new Bibliotheque("Sophia", 100, 80000, 40, directeur4, empList4, menList4,
				objetList4);
		
		//////////////////////////////////////////////////////////////////////////////////
		LocalDateTime s11 = LocalDateTime.parse("1927-01-01 08:00", formatter);
        LocalDateTime s12 = LocalDateTime.parse("1932-01-02 08:00", formatter);
        LocalDateTime sd11 = LocalDateTime.parse("1980-01-03 08:00", formatter);
        LocalDateTime sd12 = LocalDateTime.parse("1973-01-04 08:00", formatter);
        
        //Polymorphisme Etape 1

        Objet li11 = new Livre("A la recherche du temps perdu",259713649525L, bibBezon ," Marcel Proust", "Albert Camus",s11);
        Objet li12 = new Livre("Voyage au bout de la nuit", 22697462L, bibToulouse, " Louis-Ferdinand Céline", "Guillaume Apollinaire",s12);
        Objet di11 = new Disque("Back in Black", 216336226L, bibVilleurbanne, "AC/DC", sd11);
        Objet di121 = new Disque("The Dark Side of the Moon",2247962L,bibSophia, "Pink Floyd", sd12);
        
        
        // Polymorphisme Etape 2: allons placer nos objets dans une array objet.
        
        Objet [] objets = new Objet[10];
       
        objets[0] = new Livre("A la recherche du temps perdu",259713649525L, bibToulouse ," Marcel Proust", "Albert Camus",s11);
        objets[1] = new Livre("Voyage au bout de la nuit", 22697462L, bibToulouse, " Louis-Ferdinand Céline", "Guillaume Apollinaire",s12);
        objets[2] = new Disque("Back in Black", 216336226L, bibToulouse, "AC/DC", sd11);
        objets[3] = new Disque("The Dark Side of the Moon",2247962L,bibToulouse, "Pink Floyd", sd12);
        
        objets[4] = new Livre("Le monde s'effondre",25971364953L, bibToulouse ,"Chinua Achebe", "	Heinemann",s11);
        objets[5] = new Livre("Décaméron", 226978L, bibToulouse, "Boccace", "Inconnu",s12);
        objets[6] = new Livre("L'Étranger",25971363225L, bibToulouse ," Marcel Proust", "	Éditions Gallimard",s11);
        objets[7] = new Livre("Nostromo", 226782L, bibToulouse, " Louis-Ferdinand Céline", "Harper & Brothers",s12);
        
        objets[8] = new Disque("Thriller", 216786226L, bibToulouse, "Michael Jackson", sd11);
        objets[9] = new Disque("The Bodyguard",2241262L, bibToulouse, "Whitney Houston", sd12);
       
        // Je veux afficher tous les titres que comporte mon array on fait avec une boucle for.
         for (Objet objet:objets) {
        	 System.out.println("Le titre est : "+objet.getTitre());
         }
         
         //On souhaite afficher uniquement les livres alors on va devoir utiliser une condition qui va contrôler si l’objet est une instance de la class Livre.

         for (Objet objet:objets) {
        	 if(objet instanceof Livre){
        		 
        		 System.out.println("Le titre est : "+((Livre)objet).getEditeur());
        	 }
        	 else {
        		 System.out.println("Le titre est : "+((Disque)objet).getInterprete());
        	 }
         }
        
        ///////////////////// Faire polymorphgisme pour les fonctions toString//////////////////////////
		
         
		// println pour essayer le modèle de données et les classes
		int capaciteObjBibToulouse = bibToulouse.getcapaciteObjets();
		int capaciteVisBibToulouse = bibToulouse.getCapaciteVisiteurs();
		Employe directeurBibToulouse = bibToulouse.getDirecteur();
		LinkedList<Employe> lstEmpBibToulouse = bibToulouse.getListEmploye();
		LinkedList<Membre> lstMemBibToulouse = bibToulouse.getListMembre();
		LinkedList<Objet> lstObjBibToulouse = bibToulouse.getListObjet();
		int nbEmpBibToulouse = bibToulouse.getNombreEmployes();
		String villeBibToulouse = bibToulouse.getVille();
		
		
		
		System.out.println("La directrice de la bibliothèque de " + villeBibToulouse+" est " + directeurBibToulouse.getPrenom() + " " + directeurBibToulouse.getNom() + " elle gagne " + directeurBibToulouse.getSalaire() + " euros depuis " + directeurBibToulouse.getDateEmbauche());
		System.out.println("La bibliothèque de " + villeBibToulouse + " possède " + capaciteObjBibToulouse + " objects");
	}

}
