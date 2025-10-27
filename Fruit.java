package javaPackage;
import java.util.*;
public class Fruit 
{

	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	String fruitName = "";
	
	System.out.print("Please choose a fruit:");
	System.out.println("\n1. Apple");
	System.out.println("2. Banana");
	System.out.println("3. Cherry");
	System.out.println("4. Date");
	System.out.println("5. Elderberry");
	System.out.println("\nEnter number: ");
	int fruitBilang = input.nextInt();
	
	switch(fruitBilang)
	{
	case 1:
		fruitName = "Apple";
		break;
	case 2:
		fruitName = "Banana";
		break;
	case 3:
		fruitName = "Cherry";
		break;
	case 4:
		fruitName = "Date";
		break;
	case 5:
		fruitName = "Elderberry";
		break;
	default:
		System.out.print("error");
		return;
	}
	System.out.println("You have chosen " + fruitName);
	}

}
