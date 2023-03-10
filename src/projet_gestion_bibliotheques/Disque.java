package projet_gestion_bibliotheques;

import java.time.LocalDateTime;

public class Disque extends Objet{
	
	private String interprete;
	private LocalDateTime dateDeSortie;
	
	
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public LocalDateTime getDateDeSortie() {
		return dateDeSortie;
	}
	public void setDateDeSortie(LocalDateTime dateDeSortie) {
		this.dateDeSortie = dateDeSortie;
	}
	
	public Disque(String titre, long reference, Bibliotheque bib, String interprete, LocalDateTime dateDeSortie) {
		super(titre, reference, bib);
		this.interprete = interprete;
		this.dateDeSortie = dateDeSortie;
	}
	@Override
	  public String toString() {
	    return "Le Disque " + super.getTitre()+ " dont l'interprète est "+ this.interprete + " est sortie le " + this.dateDeSortie;
	  }

}
