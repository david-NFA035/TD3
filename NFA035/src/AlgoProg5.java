
public class AlgoProg5 implements AvecNote {
	  double projet1;
	  double projet2;
	  String code = "NFA005";
	  public AlgoProg5(double p1, double p2) {
	     projet1 = p1; projet2 = p2;
	  }
	  /*
	@Override
	public String getCodeModule() {
		return code;
	}
	*/

	@Override
	public double calculeNote() {
		   return (projet1 + projet2)/2;
	}

	@Override
	public String getCodeModule() {
		return this.code;
	}

}
