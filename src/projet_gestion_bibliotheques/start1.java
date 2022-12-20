package projet_gestion_bibliotheques;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
//import java.util.*;
//import java.util.ArrayList;
//import java.util.List;

public class start1 {
	public static void main(String args) {

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

		Membre Membreb11 = new Membre("Hanotin", "Ludovic", "571 Route de Toulouse,33400 Toulouse", dateEmbauche2);
		Membre Membreb12 = new Membre("Abi Rizk", "Jean", "33 Rue Condillac,33000 Bordeaux", dateEmbauche2);
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

		Objet object1 = new Objet("object1", 1L);
		Objet object2 = new Objet("object1", 2L);
		Objet object3 = new Objet("object1", 3L);
		Objet object4 = new Objet("object1", 4L);

		LinkedList<Objet> objectList1 = new LinkedList<Objet>();
		LinkedList<Objet> objectList2 = new LinkedList<Objet>();
		LinkedList<Objet> objectList3 = new LinkedList<Objet>();
		LinkedList<Objet> objectList4 = new LinkedList<Objet>();

		LinkedList<Employe> empList1 = new LinkedList<Employe>();
		LinkedList<Employe> empList2 = new LinkedList<Employe>();
		LinkedList<Employe> empList3 = new LinkedList<Employe>();
		LinkedList<Employe> empList4 = new LinkedList<Employe>();

		LinkedList<Membre> menList1 = new LinkedList<Membre>();
		LinkedList<Membre> menList2 = new LinkedList<Membre>();
		LinkedList<Membre> menList3 = new LinkedList<Membre>();
		LinkedList<Membre> menList4 = new LinkedList<Membre>();

		empList1.add(employe1);
		empList1.add(employe2);
		empList1.add(employe3);
		empList1.add(employe4);
		empList1.add(employe5);
		
		emp

		Bibliotheque bibBezon = new Bibliotheque("Bezon", 250, 120000, 99, directeur1, empList1, menList1, objectList1);
		Bibliotheque bibToulouse = new Bibliotheque("Toulouse", 200, 100000, 80, directeur2, empList2, menList2,
				objectList2);
		Bibliotheque bibVilleurbanne = new Bibliotheque("Villeurbanne", 150, 50000, 50, directeur3, empList3, menList3,
				objectList3);
		Bibliotheque bibSophia = new Bibliotheque("Sophia", 100, 80000, 40, directeur4, empList4, menList4,
				objectList4);
	}

}
