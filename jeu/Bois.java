package jeu;



public class Bois extends Ressource{
	
	private Coord coord;
	private Cellule curent;
	
		public Bois(Cellule cel){
			this.curent = cel;
			this.coord = cel.coord;
			this.quantite = 300;
		}
	
		public Bois (Coord c, int q){
	        this.coord = c;
	        this.quantite = q;
		}

		public Bois (Coord c){
		        this(c, 100); //D�finis une ressource avec 100 de quantit� 
		}
		
		public void give(){ //la ressource se d�cremente et la "donne" au villageois
			this.quantite--; 
			
		}

	
	
	protected void activate(){
		// Defini le role de l'objet "Bois" dans la soci�t�
		requestRole(Societe.SOCIETE , Societe.SIMU , Societe.BOIS);
		
	}
	@SuppressWarnings("unused")
	private void wood() {
		
		if (this.quantite <=0){
			this.curent.objet = null; // On dis � la cellule qu'elle ne contiens maintenant plus rien
			killAgent(this);
		}
		}
		
}
