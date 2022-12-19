package projet_gestion_bibliotheques;

public class Personne {
	
	/// Attributs
    private String nom;
    private String prenom;
    private String adresse;
    
    public static int nombrePersonnes = 0;
    
    /// Getters and Setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
    
	///  CONSTRUCTEURS
	public Personne(String nom, String prenom, String adresse) {
        Personne.nombrePersonnes += 1;
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAdresse(adresse);
    }

}
