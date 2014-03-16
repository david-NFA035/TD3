
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
    private String titulaire;
    
    /** Le constructeur recoit les valeurs initiales du compte.
     * @param num     le no. du compte 
     * @param init    le solde initial 
     * @param titul   le nom du titulaire du compte
     */
    public Compte(int num, double init, String titul){
    	this.numero = num;
    	this.solde = init;
    	this.titulaire = titul;
    }

    /** Le constructeur recoit les valeurs initiales du compte anonyme.
     * constructeur compatible avec les appels de la première version
     * @param num  le no. du compte 
     * @param init   le solde initial 
     */
    public Compte(int num, double init){
	  this(num, init, "anonyme");
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
    public void virerVers(Compte destination, double m) throws MontantInsuffisant {
        if (m > this.getSolde()){
        	throw new MontantInsuffisant();
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


