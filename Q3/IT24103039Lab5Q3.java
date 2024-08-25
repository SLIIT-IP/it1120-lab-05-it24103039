import java.util.Scanner;
public class IT24103039Lab5Q3 {
    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);

	int startDate,endDate,reservedDays;
	double total,roomCharge;

	System.out.print("Enter start date(1-31): ");
	startDate=input.nextInt();
	
	System.out.print("Enter end date(1-31): ");
	endDate=input.nextInt();
		
	if(startDate<1 || startDate>31 || endDate<1 || endDate>31)
	{
	   System.out.print("Error: Days must be between 1 and 31");
	   return;
	}

	if(startDate>endDate)
	{
	   System.out.print("Error:Start Date must be less than End Date");
	   return;
	}

	roomCharge=48000.0;
	reservedDays=endDate-startDate;

	if(reservedDays>=5)
	{
	  total=roomCharge*reservedDays*(80.0/100.0);
	}

	else if(reservedDays==4 || reservedDays==3)
	{
	   total=roomCharge*reservedDays*(90.0/100.0);
	}

	else 
	{
	    total=roomCharge*reservedDays*(100.0/100.0);
	}

	System.out.println("\nRoom Charge Per Day: Rs."+roomCharge + "/=");
	System.out.println("Number of Days Reserved: " + reservedDays);
	System.out.println("Total Amount to be paid: " + total);

	}
}