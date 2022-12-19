package projet_gestion_bibliotheques;

import java.time.LocalDateTime;

public class Employe extends Personne{
	
	/// Attributs
    private LocalDateTime dateEmbauche;
    private Float salaire;
    private String service;
    private Poste poste;
    
    public static int nombreEmployes = 0;
    
    /// Getters and Setters
	public LocalDateTime getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(LocalDateTime dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public Float getSalaire() {
		return salaire;
	}
	public void setSalaire(Float salaire) {
		this.salaire = salaire;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public Poste getPoste() {
		return poste;
	}
	public void setPoste(Poste poste) {
		this.poste = poste;
	}
	///  CONSTRUCTEURS
	public Employe(String nom, String prenom, String adresse, LocalDateTime dateEmbauche, Float salaire, String service,
			Poste posteb) {
		super(nom, prenom, adresse);
		this.dateEmbauche = dateEmbauche;
		this.salaire = salaire;
		this.service = service;
		this.poste = poste;
	}
	

}
