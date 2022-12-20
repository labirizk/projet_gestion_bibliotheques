


Liste des Classes java:



	- Bibliotheque:
	
	  - String ville
	  - int capaciteVisiteurs
	  - int capaciteObjets
	  - int nombreEmployes
	  - Employe directeur
	  - LinkedList<Employe> listEmploye
	  - LinkedList<Membre> listMembre
	  - LinkedList<Objet> listObjet



	- Objet

	  - String titre
	  - long reference
	  - Bibliotheque bib



	- Disque:
	
	  Fille de la classe Objet
	  
	  - String titre
	  - long reference
	  - Bibliotheque bib
	  - String interprete
	  - LocalDateTime dateDeSortie



	- Livre

	  Fille de la classe Objet

	  - String titre
	  - long reference
	  - Bibliotheque bib
	  - String auteur
	  - String editeur
	  - LocalDateTime dateDeParution



	- Personne

	  - String nom
	  - String prenom
	  - String adresse



	- Employe

	  Fille de la classe Personne
	  
	  - String nom
	  - String prenom
	  - String adresse
	  - LocalDateTime dateEmbauche
	  - Float salaire
	  - String service
	  - Poste poste



	- Membre

	  Fille de la classe Personne

	  - String nom
	  - String prenom
	  - String adresse
	  - LocalDateTime date_inscription



	- Poste

	  - String intitule



	- Emprunt

	  - LocalDateTime dateDebut
	  - LocalDateTime dateFin
	  - Objet objetEmprunte
	  - Membre membre
	  - Bibliotheque bib
	  