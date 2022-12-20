package projet_gestion_bibliotheques;

import java.time.LocalDateTime;

public class Emprunt {
	private LocalDateTime dateDebut;
	private LocalDateTime dateFin;
	private Objet objetEmprunte;
	private Membre membre;
	private Bibliotheque bib;
	
	
	public LocalDateTime getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDateTime dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDateTime getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDateTime dateFin) {
		this.dateFin = dateFin;
	}
	public Objet getobjetEmprunte() {
		return objetEmprunte;
	}
	public void setobjetEmprunte(Objet objetEmprunte) {
		this.objetEmprunte = objetEmprunte;
	}
	public Membre getMembre() {
		return membre;
	}
	public void setMembre(Membre membre) {
		this.membre = membre;
	}
	public Bibliotheque getBib() {
		return bib;
	}
	public void setBib(Bibliotheque bib) {
		this.bib = bib;
	}
	
	public Emprunt(LocalDateTime dateDebut, LocalDateTime dateFin, Objet objetEmprunte, Membre membre, Bibliotheque bib) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.objetEmprunte = objetEmprunte;
		this.membre = membre;
		this.bib = bib;
	}
	
	
}
