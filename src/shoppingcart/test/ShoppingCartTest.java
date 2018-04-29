package shoppingcart.test;

import java.util.Scanner;

/**
 * Shopping Card Test Assignment
 *
 * @author Rajkumar
 */

public class ShoppingCartTest implements MyItems {

	public int Calcuation(int appleCount, int orageCount)
	{
		int Total = appleCount*APPLE_COST+orageCount*ORANGE_COST;
		return Total;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Please Enter your Name");
		Scanner SC = new Scanner(System.in);
		String CustomerName = SC.nextLine();
		System.out.println("Hola "+ CustomerName + "! Welcome to Shopping Cart");
		System.out.println("Here you can buy Apples for "+APPLE_COST+"P and Oranges for "+ORANGE_COST+"P");
		System.out.println("Press 1 to continue and 2 to Exit");
		int Status = SC.nextInt();
		if(Status==1)
		{
			System.out.println("Please Enter the number of Apples");
			int AppleCount = SC.nextInt();
			System.out.println("Please Enter the number of Oranges");
			int OrageCount = SC.nextInt();
			ShoppingCartTest SCT = new ShoppingCartTest();
			System.out.println("Total Cart Value "+SCT.Calcuation(AppleCount,OrageCount)+" P");
			System.out.println("Press 1 to proceed to checkout order and 2 to exit");
			int OrderStatus = SC.nextInt();
			if(OrderStatus==1)
			{
				System.out.println("Your Order for Apples ("+ AppleCount+") and Oranges ("+OrageCount +") with amount ("+SCT.Calcuation(AppleCount,OrageCount)+ " P) Placed Sucsessfully");
			}
			else
			{
				System.out.println("Order Not Placed ! Thanks for Visiting Shopping Cart.");	
			}
		}
		else
		{
			System.out.println("Thanks for Visiting Shopping Cart");
		}
	}
}
