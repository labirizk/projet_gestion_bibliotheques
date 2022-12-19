package projet_gestion_bibliotheques;

import java.time.LocalDateTime;

public class Livre extends Objet{
	
	private String auteur;
	private String editeur;
	private LocalDateTime dateDeParution;
	
	
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public LocalDateTime getDateDeParution() {
		return dateDeParution;
	}
	
	public void setDateDeParution(LocalDateTime dateDeParution) {
		this.dateDeParution = dateDeParution;
	}
	public Livre(String titre, long reference, Bibliotheque bib, String auteur, String editeur,
			LocalDateTime dateDeParution) {
		super(titre, reference);
		this.auteur = auteur;
		this.editeur = editeur;
		this.dateDeParution = dateDeParution;
	}
	
	



}
