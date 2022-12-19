package projet_gestion_bibliotheques;

import java.time.LocalDateTime;

public class Membre extends Personne{
	
	/// Attributs
    private LocalDateTime date_inscription;
    
    public static int nombreMembres = 0;

    /// Getters and Setters
	public LocalDateTime getDate_inscription() {
		return date_inscription;
	}

	public void setDate_inscription(LocalDateTime date_inscription) {
		this.date_inscription = date_inscription;
	}

	///  CONSTRUCTEURS
	public Membre(String nom, String prenom, String adresse, LocalDateTime date_inscription) {
		super(nom, prenom, adresse);
		Membre.nombreMembres += 1;
		this.date_inscription = date_inscription;
	}
    
}
