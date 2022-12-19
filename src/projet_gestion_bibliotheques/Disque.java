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
	
	
	public Disque(String interprete, LocalDateTime dateDeSortie) {
		super();
		this.interprete = interprete;
		this.dateDeSortie = dateDeSortie;

	}

}
