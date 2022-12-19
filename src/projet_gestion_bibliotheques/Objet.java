package projet_gestion_bibliotheques;

public class Objet {
	
	//CLASSE MERE 
	private String titre;
	private long reference;
	
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
	
	public Objet(String titre, long reference) {
		this.titre = titre;
		this.reference = reference;
	}

	@Override
	  public String toString() {
	    return this.getTitre()+ " dont la rérérence est "+ this.getReference();
	  }
}
