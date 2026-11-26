package tpPays;

import java.util.ArrayList;

public class Pays {
	
	
	//--------------attributs--------------------
	/**
	 * les attributs privee de Pays
	 */
	private String nom;
	private String langue;
	private String monnaie;
	private Capitale saCapitale;
	private Ville[] lesVilles;
	private int nbVilles;
	private static int nbPays = 0;
	
	/**
	 *  constructeur par defaut
	 */
	
	public Pays(String unNom , String uneLangue , String uneMonnaie ) { //constructeur sans la capitale 
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.lesVilles = new Ville[2];
		this.nbVilles = 0;
		nbPays = nbPays + 1;
	}
	
	public Pays(Capitale saCapitale) {
		this.saCapitale = saCapitale;
		this.lesVilles = new Ville[2];
		this.nbVilles = 0;
		nbPays = nbPays + 1;
	}
	/**
	 *  surcharge constructeur
	 */
	
	//surcharge constructeur
	public Pays(String unNom , String uneLangue , Capitale saCapitale) {
		this.nom = unNom;
		this.langue = uneLangue;
		this.saCapitale = saCapitale;
		this.lesVilles = new Ville[2];
		this.nbVilles = 0;
		nbPays = nbPays + 1;
	}
	
	public Pays(String unNom , String uneLangue , String uneMonnaie , Capitale saCapitale ,  Ville sesVilles ) {
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.saCapitale = saCapitale;
		this.lesVilles = new Ville[2];
		this.nbVilles = 0;
		nbPays = nbPays + 1;
	}
	
	// get et set
	
	

	/**
	 *  get de nom pays
	 */
	public String getNom() {
		return this.nom;
	}
	/**
	 *  set de nom pays
	 */
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	/**
	 *  get de la langue
	 */
	public String getLangue() {
		return this.langue;
	}
	
	/**
	 *  set de la langue
	 */
	public void setLangue(String uneLangue) {
		this.langue = uneLangue;
	}
	
	/**
	 *  get de la monnaie
	 */
	public String getMonnaie() {
		return this.monnaie;
	}
	
	/**
	 *  set de la monnaie
	 */
	public void setMonnaie(String uneMonnaie){
		this.monnaie = uneMonnaie;
	}
	
	/**
	 *  get de la capitale
	 */
	public Capitale getSaCapitale() {
		return this.saCapitale;
	}
	
	/**
	 *  set de la capitale
	 */
	public void setsaCapital(Capitale uneCapitale) {
		this.saCapitale = uneCapitale;
	}
	
	/**
	 *  get des villes
	 */
	public Ville getLesVilles() {
		return this.lesVilles[2];
	}
	
	/**
	 *  set des villes
	 */
	public void setLesVilles(Ville sesVilles) {
		this.lesVilles[2] = sesVilles;
	}
	
	/**
	 *   static getNbPays (compteur)
	 */
	
	
	//-------------methode -----------------------
	/**
	 *  methode qui met de le nom du pays en majuscule
	 */
	public String nomMaj() {
		String nMaj = getNom().toUpperCase();
		return nMaj;
	}
	
	/**
	 *  methode qui ajouter une ville
	 */	
	//------------ajouter une ville------------
public boolean ajouterUneVille(Ville uneVille) {
		
		boolean rep = false;
		if(this.nbVilles > 10) {
			this.lesVilles[this.nbVilles] = uneVille;
			this.nbVilles = this.nbVilles + 1;
			rep = true;
		}
		return rep;
	}
	
	//---------------rechercher une  ville-------------
	
	/**
	 *  methode qui rechercher une ville
	 */
/*
	public boolean rechercherVille(String unNom) {
		int i=0;
		boolean rep = false;
		
		while(i<this.nbVilles && this.lesVilles[i] = !this.getNom().equalsIgnoreCase(unNom)) {
			i++;
		}if( i < this.nbVilles) {
			rep = true;
		}
		return rep;
	}
	
	
	//---------------supprimer une ville--------------
	public boolean supprimerVille(Ville uneVille) {
		 boolean rep = false;
		this.lesVilles.remove(uneVille);
		 if(!this.lesVilles.contains(uneVille)) {
			 rep = true;
		 }
		 return rep;
	}
	
	
	
	//tostring
	/**
	 *  methode qui retourne toutes les informations du tableau
	 */
	
	public String toString() {
		String chaine =" ";
		
		if (this.nom != null) {
			chaine += "Pays = " + this.nom + ",";
		}
		if(this.langue!= null) {
			chaine += " Langue = " +this.langue+ " ,";
		}
		if(this.monnaie!= null ) {
			chaine += " monnaie = " +this.monnaie + " ,";
		}
		if(this.saCapitale!= null) {
			chaine += " , \n Capitale = " + this.saCapitale.toString() +".";
		}
		chaine += " Ses ville sont =";
		//if(this.lesVilles.size()>0) {
			for(Ville uneVille : this.lesVilles) {
				chaine += uneVille.toString();
			}
		//}else {
			//chaine+= "il n'y a pas de ville pour le momment ";
		//}
		return chaine;
	}
}