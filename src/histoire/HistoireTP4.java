package histoire;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire("kombucha");
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
	}

}
