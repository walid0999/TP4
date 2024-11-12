package histoire;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson_pref, int argent, String clan ) {
		super(nom, boisson_pref, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		int argent_gagn� = victime.getArgent();
		gagnerArgent(argent_gagn�);
		System.out.println("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ? ");
		System.out.println(victime.getNom()+", si tu tiens � la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		this.clan += 1;
		System.out.println("J'ai piqu� les "+argent_gagn�+" sous de "+victime.getNom()+
				", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !");
		
	}
	

}
