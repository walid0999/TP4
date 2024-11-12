package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Whisky", 45, "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		yaku.extorquer(marco); //il faut extorquer marco 3 fois au minimum pour que la reputaion(yakuza) > (honneur(ronin)*2)
		yaku.extorquer(marco);
		Ronin roro = new Ronin("Roro", "shochu", 9);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);
		
		
		
		
	}

}
