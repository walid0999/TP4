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
		this.reputation += 1;
		System.out.println("J'ai piqu� les "+argent_gagn�+" sous de "+victime.getNom()+
				", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
	
	protected int perdre() {
		int argent = getArgent();
		perdreArgent(argent);
		this.reputation -=1;
		System.out.println("J'ai perdu mon duel et mes "+argent+" sous, snif... J'ai d�shonor� le clan de "+ this.clan);
		return argent;
	}
	
	protected void gagner(int gain) {
		perdreArgent(gain);
		this.reputation += 1;
		System.out.println("Ce ronin pensait vraiment battre "+ getNom() +" du clan de Warsong ? "
				+ "Je l'ai d�pouill� de ses "+gain+" sous.");
		
	}
	
	public int getReputation() {
		return this.reputation;
	}
	

}
