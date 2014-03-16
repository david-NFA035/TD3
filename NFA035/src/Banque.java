
public class Banque {

	public static void main(String[] args) {
		Compte c1 = new Compte(1, 120.66, "Victor Hugo");
		c1.afficher();
		Compte c2 = new Compte(2, 20.08);
		c2.afficher();
		c1.virerVers(c2, 40.00);
		c1.afficher();
		c2.afficher();
		c1.virerVers(c2, 400); //lève une exeption MontantInsuffisant
	}
	

}
