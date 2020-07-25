import java.util.*;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 

class SimpleCompoundInterestLog
{
	private final static Logger LOGGER =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
        public void SInterest(double price, double r, double t)
	{
		double s;	
		s = (price * t * r)/100;
		LOGGER.log(Level.INFO, " Simple Interest is: " + s);
	}
	public void CInterest(double price, double r, double t)
	{
		double c;			
		c =price * Math.pow(1.0+r/100.0,t) - price;
		LOGGER.log(Level.INFO, " Compound Interest is: "+ c);
	}
}