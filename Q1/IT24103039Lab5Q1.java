import java.util.Scanner;
public class IT24103039Lab5Q1
{
   public static void main(String[] args)
    {
	//Create an object called input to scanner class
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter the first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter the second integer: ");
	int number2 = input.nextInt();

	System.out.print("Enter the third integer: ");
	int number3 = input.nextInt();

	System.out.println("\nUser entered numbers are: "+ number1+" "+number2+" "+number3+" ");
		
	//Calculate the smallest number
	
	if(number2<number1) {
	System.out.println("The smallest number is: "+number2);
	}

	else if (number3<number2) {
	   System.out.println("The smallest number is: "+number3);

	}
	else {
	 System.out.println("The smallest number is: "+number1);
	}

	//Calculate the largest number
	if (number2>number1) {
	 System.out.println("The largest number is: "+number2);
	}

	else if (number3>number1) {
	 System.out.println("The largest number is: "+number3);
	}
	
	else {
	 System.out.println("The largest number is: "+number1);
	}	
     }
}
	
