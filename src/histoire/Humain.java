package histoire;

public class Humain {
	private String nom;
	private String boisson_pref;
	private int argent;
	
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
	 
	 
	 

}
