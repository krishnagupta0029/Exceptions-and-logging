import org.apache.log4j.Logger;
public class CostEstimation
{
	static Logger logger = Logger.getLogger(CostEstimation.class);
	public void houseConstructionCost(String materialStandard, double areaOfHouse, boolean fullyAutomated)
	{
		double cost;
		if(materialStandard.equals("standard")){
			cost = 1200 * areaOfHouse;
		}	
		else if(materialStandard.equals("abovestandard")){
			cost = 1500 * areaOfHouse;
		}
		else
		{
			if(fullyAutomated && materialStandard.equals("highstandard")){
				cost = 2500 * areaOfHouse;
			}
			else
				cost = 1800 * areaOfHouse;
		}
		logger.debug(cost);
        	logger.info(cost);
        	logger.warn(cost);
        	logger.fatal(cost);
        	logger.error(cost);
	}
}