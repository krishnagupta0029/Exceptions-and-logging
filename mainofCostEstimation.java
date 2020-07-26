import java.util.*;
public class mainofCostEstimation{
	public static void main(String args[]){
	CostEstimation costEstimate = new CostEstimation();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter quality of material");
	String materialstandard=sc.nextLine();
	System.out.println("Enter house area");
	int area=sc.nextInt();
	boolean fullyautomated=false;
	System.out.println("Do you want Fully Automated Home: If Yes then Press Y else N");
        fullyautomated = (sc.next().equals("Y"));
	costEstimate.houseConstructionCost(materialstandard, area, fullyautomated);
        
}
}