package tpPays;
import java.util.ArrayList;

public class Continent {
	
	//----les attributs
		private String nom;
		private double superficie;
		private ArrayList <Pays>lesPays;
		
		//les constructeur
		
		public Continent(){
			this.lesPays = new ArrayList<Pays>();
		}
		
		public Continent(String unNom) {
			this.nom = unNom;
			this.lesPays = new ArrayList<Pays>();	
		}
		
		public Continent(String unNom , double uneSuperficie) {
			this.nom = unNom;
			this.superficie = uneSuperficie;
			this.lesPays = new ArrayList<Pays>();	
		}
		
		public Continent(String unNom , double uneSuperficie , ArrayList<Pays> tousLesPays) {
			this.nom = unNom;
			this.superficie = uneSuperficie;
			this.lesPays = tousLesPays;	
		}
		
		//--------------get et set---------------------------------
		
		public String getNom() {
			return this.nom;
		}
		
		public void setNom(String unNom) {
			this.nom = unNom;
		}
		
		public double getSuperficie() {
			return this.superficie;
		}
		
		public void setSuperficie(double uneSuperficie) {
			this.superficie = uneSuperficie;
		}
		
		/**
		 *  methode qui ajouter un pays
		 */	
		//------------ajouter une ville------------
		public boolean ajouterUnPays(Pays unPays) {
			boolean rep= false ;
			this.lesPays.add(unPays);
			
			if (this.lesPays.contains(unPays)) {
				rep = true;
			}
			return rep;
		}
		
		//---------------rechercher une  ville-------------
		
		/**
		 *  methode qui rechercher un pays
		 */
		public Pays rechercherPays(String unNom) {
			int i=0;
			Pays rep = null;
			
			while(i<this.lesPays.size() && !lesPays.get(i).getNom().equals(unNom))  {
				i++;
			}if( i < this.lesPays.size()) {
				rep = this.lesPays.get(i);
			}
			return rep;
		}
		
		
		//---------------supprimer un pays--------------
		public boolean supprimerPays(Pays unPays) {
			 boolean rep = false;
			this.lesPays.remove(unPays);
			 if(!this.lesPays.contains(unPays)) {
				 rep = true;
			 }
			 return rep;
		}
		
		
		public String toString() {
			String chaine =" ";
			
			if (this.nom != null) {
				chaine += "Continent = " + this.nom + ",";
			}
			
			if(this.superficie!= 0 ) {
				chaine += " superficie = " +this.superficie + " ,";
			}
			
			chaine += " Ses pays sont =";
			if(this.lesPays.size()>0) {
				for(Pays  tousLesPays : this.lesPays) {
					chaine += lesPays.toString();
				}
			}else {
				chaine+= "il n'y a pas de ville pour le momment ";
			}
			return chaine;
		}
		

	}

