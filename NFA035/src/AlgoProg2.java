
public class AlgoProg2 implements AvecNote, Affichable {
	  private double session1;
	  private double session2;
	  String code = "NFA002";
	  public AlgoProg2(double s1, double s2) {
	     session1 = s1; session2 = s2;
	  }
	  public double getSession1() {return session1;}
	  public double getSession2()  {return session2;}
	@Override
	public String getCodeModule() {
		return code;
	}

	@Override
	public double calculeNote() {
         if (session1 >= 10 || session2 == 0) return session1;
		 else return session2;
	}
	public String toString(){
      return (getCodeModule() + "Notes: session 1=" + session1 + "Session 2="+ session2);
    }
	public void afficher(){
		System.out.println(this.toString());
	}
}
