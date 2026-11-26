package tpPays;

public class Ville {
	
	//------------------------------attributs---------------------------------------
	private String nom;
	private int nbHabitants;
	private double superficie;
	private Pays sonPays;
	
	//------------------------------constructeur----------------------------------------
	public Ville() {
		
	}
	
	
	//--------------------------------surcharge----------------------------------
	public Ville(String unNom , int unNbHabitants , Pays lePays) {
		this.nom = unNom;
		this.nbHabitants = unNbHabitants;
		this.sonPays = lePays;
		this.sonPays.ajouterUneVille(this);
	}
	
	
	public Ville(String unNom , int unNbHabitants, double uneSuperficie, Pays lePays) {
		this.nom = unNom;
		this.nbHabitants = unNbHabitants;
		this.superficie = uneSuperficie;
		this.sonPays = lePays;
		this.sonPays.ajouterUneVille(this);
		
	}
	
	//--------------------------------get et set----------------------------------
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public int getNbHabitants() {
		return this.nbHabitants;
	}
	
	public void setNbhabitants(int unNbHabitants) {
		this.nbHabitants = unNbHabitants;
	}
	
	public double getSuperficie() {
		return this.superficie;
	}
	
	public void setSuperficie(double uneSuperficie) {
		this.superficie = uneSuperficie;
	}
	
	public Pays getSonPays() {
		return this.sonPays;
	}
	
	public void setSonPays(Pays lePays) {
		this.sonPays = lePays;
	}
	
	public String affichage() {
		return "\n Ville = "+this.nom+ " , Nombre d'habitants = " +this.nbHabitants+ " , superficie = " +this.superficie+ ".";
	}

}
