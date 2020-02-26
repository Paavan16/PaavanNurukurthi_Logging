package epam;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


	

public class Interestcalculation {
	private static final Logger LOGGER = LogManager . getLogger(Interestcalculation. class);
	public double Calculate_SimpleInterest(double p,int t,double r) {
		double amt=p*t*r/100;
		LOGGER . debug("Simple_Interest"+ amt);
		return amt;
	}
	public double Calculate_CompoundInterest(double p,int t,double r) {
		double amt= p*Math.pow(1+(r/100), t);
		LOGGER . debug("Compound_Interest"+ amt);
		return amt;
		
	}
}
