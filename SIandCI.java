import org.apache.log4j.Logger;
public class SIandCI{
	static Logger logger = Logger.getLogger(SIandCI.class);
	double si=0;
	double ci=0;
	public  void simpleInterest(double pr,double t,double r){
		si= (pr*t*r)/100;
		logger.debug(si);
        	logger.info(si);
        	logger.warn(si);
        	logger.fatal(si);
        	logger.error(si);
}
	public  void compoundInterest(double pr,double t,double r){
		ci= pr * Math.pow(1.0+r/100.0,t) - pr;
		logger.debug(ci);
        	logger.info(ci);
        	logger.warn(ci);
        	logger.fatal(ci);
        	logger.error(ci);
}
}