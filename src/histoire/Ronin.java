package histoire;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, String boisson_pref, int argent) {
		super(nom, boisson_pref, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int argent_donne = (int) (getArgent()*0.1);
		System.out.println(beneficiaire.getNom()+" prend ces "+argent_donne+" sous." );
		beneficiaire.gagnerArgent(argent_donne);
		perdreArgent(argent_donne);
		beneficiaire.recevoir(argent_donne);
	}
	
	protected void perdreHonneur() {
		this.honneur -=1;
	}
	
	protected void gagnerHonneur() {
		this.honneur +=1;
	}
	
	protected void provoquer(Yakuza adversaire) {
		int force = this.honneur * 2;
		System.out.println("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= adversaire.getReputation()) {
			gagnerArgent(adversaire.getArgent());
			gagnerHonneur();
			System.out.println("Je t’ai eu petit yakusa!");
			// si le ronin gagne, son adversaire perd
			adversaire.perdre();
		}
		else {
			int argent_ronin = getArgent();
			perdreHonneur();
			perdreArgent(argent_ronin);
			System.out.println("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			// si le ronin perd, son adversaire gagne
			adversaire.gagner(argent_ronin);
			
		}
		
	}
}
