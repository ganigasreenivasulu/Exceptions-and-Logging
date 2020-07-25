import java.util.*;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 

public class HouseConstructionLog
{
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
        public void constructionCost(String stnd, double area, boolean auto)
	{
		double price = 0;
		if(stnd == "standard" && auto == false)
		{	
			price = area*1200;
		}
		else if(stnd == "above standard" && auto == false)
		{
			price = area*1500;
		}
		else if(stnd == "high standard" && auto == false)
		{
			price = area*1800;
		}
		else if(stnd == "high standard" && auto == true)
		{
			price = area*2500;
		}
		LOGGER.log(Level.INFO, " House Construction Cost is: " + price);
	}	
}