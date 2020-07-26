import java.util.*;
class main{
	public static void main(String args[]){
    	double pr, rate, t, sim,com;
    	Scanner sc=new Scanner (System. in);
    	System.out.println("Enter the amount:");
    	pr=sc.nextDouble();
    	System. out. println("Enter the No.of years:");
    	t=sc.nextDouble();
    	System. out. println("Enter the Rate of  interest");
    	rate=sc.nextDouble();
	SIandCI obj=new SIandCI();
	obj.simpleInterest(pr,t,rate);
	obj.compoundInterest(pr,t,rate);
	
	
}
}