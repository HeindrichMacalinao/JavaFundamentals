package javaPackage;
import java.util.*;
public class Days 
{

	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Number: ");
	int dayNumber = input.nextInt();
	String dayName = "";
	
	switch(dayNumber)
	{
	case 1: 
		dayName = "Monday";
		break;
	case 2: 
		dayName = "Tuesday";
		break;	
	case 3: 
		dayName = "Wednesday";
		break;
	case 4: 
		dayName = "Thursday";
		break;
	case 5: 
		dayName = "Friday";
		break;
	case 6: 
		dayName = "Saturday";
		break;
	case 7: 
		dayName = "Sunday";
		break;
	default:
		System.out.println("INVALID");
		return;
	}
	System.out.println("Today is " + dayName);
	}

}
