package histoire;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson_pref, int argent, String clan ) {
		super(nom, boisson_pref, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		int argent_gagné = victime.getArgent();
		gagnerArgent(argent_gagné);
		System.out.println("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ? ");
		System.out.println(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		this.reputation += 1;
		System.out.println("J'ai piqué les "+argent_gagné+" sous de "+victime.getNom()+
				", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
	
	protected int perdre() {
		int argent = getArgent();
		perdreArgent(argent);
		this.reputation -=1;
		System.out.println("J'ai perdu mon duel et mes "+argent+" sous, snif... J'ai déshonoré le clan de "+ this.clan);
		return argent;
	}
	
	protected void gagner(int gain) {
		perdreArgent(gain);
		this.reputation += 1;
		System.out.println("Ce ronin pensait vraiment battre "+ getNom() +" du clan de Warsong ? "
				+ "Je l'ai dépouillé de ses "+gain+" sous.");
		
	}
	
	public int getReputation() {
		return this.reputation;
	}
	

}
