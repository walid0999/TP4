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

}
