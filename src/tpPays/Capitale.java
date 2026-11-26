package tpPays;
public class Capitale extends Ville {
	//--------------attributs--------------------
	
		
		//--------------constructeur--------------------
		
		
		/**
		 *  constructeur par defaut
		 */
		public Capitale() {
			super();
		}
		//y
		/**
		 *  constructeur (surcharge)
		 */
		public Capitale(String unNom , int unNbHabitants , Pays lePays) {
			super(unNom, unNbHabitants , lePays);
		}
		
		
		public Capitale(String unNom , int unNbHabitants, double uneSuperficie , Pays lePays) {
			super(unNom , unNbHabitants , uneSuperficie , lePays);
			
		}
		
		/**
		 *  toString de la capitale 		
		 *   */
		public String toString() {
			String chaine = super.affichage();
			return chaine;
		}

}