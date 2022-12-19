package projet_gestion_bibliotheques;

public class Objet {
	
	//CLASSE MERE 
	private String titre;
	private long reference;
	private Bibliotheque bib;
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public long getReference() {
		return reference;
	}
	public void setReference(long reference) {
		this.reference = reference;
	}
	
	// un objet n'a jamais la meme reference dans deux bibliotheque différente
	
	public Objet(String titre, long reference, Bibliotheque bib) {
		this.titre = titre;
		this.reference = reference;
		this.bib=bib;
	}

}
