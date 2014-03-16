
public class ExempleAvecNote {
	
	public static double moyenneNotes (AvecNote[] annee){
		double total = 0;
		for (AvecNote a : annee){
			total += a.calculeNote();
		}
		
		return total / annee.length;
	}

	public static void main(String[] args) {
		AvecNote[] UEs = new AvecNote[4];
		UEs[0] = new AlgoProg2(13.5, 0);
		UEs[1] = new AlgoProg5(8.75, 11);
		UEs[2] = new AlgoProg2(18.5, 0);
		UEs[3] = new AlgoProg5(3.5, 5.5);
		
		// String UEs[0].getSession1();
		/* l'appel à getSession1() est illicite.
		* les objets stockés dans le tableau UEs sont de type AvecNote.
		* Et le type AvecNote n'a pas cette méthode.
		* solution possibles :
		* - caster explicitement l'objet en AlgoProg2
		* - ajouter la méthode getSession1() au contrat de l'interface AvecNote.
		*/
		
		System.out.println(moyenneNotes(UEs));
		
		//Affichable a = new AlgoProg5(12, 6);
		/*
		 * AlgoProg5 n'implémente pas Affichable.
		 * On ne peut donc pas "ranger" un objet AloProg5
		 * dans un objet Affichable.
		 */

	}

}
