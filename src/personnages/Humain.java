package personnages;

public class Humain {
	private String nom;
	private String boisson_pref;
	private int argent;
	protected int nbConnaissance=0;
	protected Humain[] memoire = new Humain[30]; 
	
	public Humain(String nom, String boisson_pref, int argent) {
		this.nom =nom;
		this.boisson_pref = boisson_pref;
		this.argent = argent;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	private void parler(String texte) {
		System.out.println(texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+this.nom+" et j'aime boire du "+ this.boisson_pref);	
	}
	
	 public void boire() {
		 parler("Mmmm, un bon verre de "+this.boisson_pref+"! GLOUPS !");
	}
	 
	 public void acheter(String bien, int prix) {
		 if (this.argent >= prix) {
			 parler("J'ai "+getArgent()+" sous en poche. Je vais pouvoir m'offrir "+ bien+" à "+prix+" sous");

			 this.argent -= prix;
		}
		 else {
			parler("Je n'ai plus que "+ getArgent()+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+ prix+" sous");
		} 
	}
	 
	 protected void gagnerArgent(int gain) {
		 this.argent += gain;
	}
	 
	 protected void perdreArgent(int perte) {
		 this.argent -= perte;
		
	}
	 //TP5
	 
	 public void faireConnaissanceAvec(Humain autreHumain) {
		 direBonjour();
		 autreHumain.repondre(this);
		 memoriser(autreHumain);
	 }
	 
	 
	 
	 private void repondre(Humain humain) {
		 direBonjour();
		 memoriser(humain);
	 }
	 
	 private void memoriser(Humain humain) {
		 if(getNbConnaissance()>=30) {
			 for(int i=0; i<29; i++) {
				 this.memoire[i] = this.memoire[i+1];
			 }
		 }
		this.memoire[getNbConnaissance()]=humain;
		incrementerNbConnaissance();
	 }
	 
	 // focntions supp
	 // {
	 private int getNbConnaissance() {
		 return this.nbConnaissance;
	 }
	 
	 private void incrementerNbConnaissance() {
		 this.nbConnaissance+=1;
		
	}
	// }
	 public void listerConnaissance() {
		 for(int i=0; i<getNbConnaissance(); i++) {
			 System.out.println("Je connais beaucoup de monde dont : "+this.memoire[i]);
		 }
		
	}
	 
	 
	 
	 

}
