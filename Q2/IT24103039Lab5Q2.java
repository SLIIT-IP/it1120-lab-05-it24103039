import java.util.Scanner;
public class IT24103039Lab5Q2
  {
    public static void main(String[] args)
    {
	//Declearing the variables
	int noOfMembers;
	String prize;

	//Create an object called input to Scanner class
	Scanner input=new Scanner(System.in);

	int number;

	//take user inputs
	System.out.print("Enter the number of new members introduced: ");
	noOfMembers = input.nextInt();

	if (noOfMembers<0) 
	{
	   System.out.print("Input must be number 0 or greater");
	   return;
	}
	
	   switch(noOfMembers)

	   {
		case 0: prize="No prize";
			break;

		case 1: prize="Pen";
			break;

		case 2: prize="Umbrella";
			break;

		case 3: prize="Bag";
			break;

		case 4: prize="Travelling Chair";
			break;

		default: prize="Headphone";
			break;

	    }
	System.out.print("\nprize is a:" +prize);
	  
	    }
}