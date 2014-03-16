
/**
 * Comptes Bancaires.
 * 
 * @author V. Aponte 
 * @version 1
 */
public class Compte
{
    // Variables d'instance
    private int numero;
    private double solde;
    String titulaire;

    /** Le constructeur recoit les valeurs initiales du compte.
     * @param num  le no. du compte 
     * @param init   le solde initial 
     * @param titul   le solde initial 
     */
    public Compte(int num, double init, String titul){
	  this.numero = num;
	  this.solde = init;
	  this.titulaire = titul;
    }
    /** Obtenir le solde courant
     * @return valeur courante du solde
     */
    public double getSolde(){
    	return solde;
    }
    /** Obtenir le nom du titulaire
     * @return nom du titulaire
     */
    public String getTitulaire(){
        return this.titulaire;
    }
    /** Deposer 
     * @param n montant a deposer
     */
    public void depot(double n){
	  this.solde = this.solde+n;
    }
    /** Retirer (sans verification d'approvisionnement)
     * @param n montant a retirer
     */
    public void retrait(double n) {
       this.solde = this.solde-n;
    }
    /** Virer de ce compte vers un autre 
     * @param m montant virement
     * @param destination compte crediteur 
     */ 
    public void virerVers(Compte destination, double m) throws IllegalMontant {
        if (m > this.getSolde()){
        	throw new IllegalMontant();
        }
    	this.retrait(m);
        destination.depot(m);
    }
    /** Convertit les donnes du compte en String
     */
    @Override
    public String toString(){
        return ("Numero: "+ numero + " ;titulaire: " + this.titulaire + ", Solde: "+ solde);
    }
    /** Affiche les donnees du compte
     */
    public void afficher(){
	Terminal.ecrireStringln(this.toString());
    }
    
}


