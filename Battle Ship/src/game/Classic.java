package game;

import java.util.Scanner;

public class Classic
{
	Scanner scan = new Scanner(System.in);
	public static void Rules()
	{
		System.out.println("These are the rules for the Classic gamemode:");
		System.out.println("Each person will take a turn fireing at the other player. This is done by typeing in a single coordinate. (e.x. A5)");
		System.out.println("The game will continue going on for as long as a player contains an intact ship.");
		System.out.println("As soon as a player's ships have all become sunk, then the other player wins.");
		System.out.println("");
	}
	//make the fire method, which when a coordinate is input, turns that value to 0.
	public int [][] P1Fire(int [][] Board2)
	{	
		String fire = "";
		String SA = "";
		char a;
		int b;
		
		while(true)
		{
			System.out.println("Please enter fireing coordinate.");
			fire = scan.nextLine();
			fire = fire.toUpperCase();
			
			if (Character.isAlphabetic(fire.charAt(0)) && Character.isDigit(fire.charAt(1))) {	
				if (fire.length() >= 3 && (Character.isDigit(fire.charAt(2)) || fire.charAt(2) == ' ')) {
				}
				else if (fire.length() >= 3)
				{
					System.out.println("You may have mistyped that. Please retype it.");
					continue;
				}
			}
			else
			{
				System.out.println("You may have mistyped that. Please retype it.");
				continue;
			}
			
			SA = fire.substring(0,1);
			a = SA.charAt(0);
			a -= 65;
			try
			{
				b = Integer.parseInt(fire.substring(1));
			}
			catch (Exception e)
			{
				System.out.println("You may have mistyped that, please go back and retype it.");
				continue;
			}
			b -= 1;
			if (a >= Board2.length || -1 >= a)
			{
				System.out.println("The board is a different size, go back and retype.");
				continue;
			}
			else if (b >= Board2.length || -1 >= b)
			{
				System.out.println("The board is a different size, go back and retype.");
				continue;
			}
			break;
		}
		if (Board2 [a][b] != 0)
		{
			System.out.println("Enemy ship hit!");
			boolean sunk = true;
			for (int row = 0; row < Board2.length; row++) {
				for (int col = 0; col < Board2[row].length; col++)
				{
					if(row == a && col == b) continue;
					
					if(Board2 [row][col] == Board2 [a][b]) {
						sunk = false;
					}
				}
			}
			if (sunk) {
				if (Board2 [a][b] == 5)
				{
					System.out.println("You sunk their Aircraft Carrier!");
				}
				else if (Board2 [a][b] == 4)
				{
					System.out.println("You sunk their Battle Ship!");
				}
				else if (Board2 [a][b] == 3)
				{
					System.out.println("You sunk their Destoryer!");
				}
				else if(Board2 [a][b] == 1)
				{
					System.out.println("You sunk their Submarine!");
				}
				else if(Board2 [a][b] == 2)
				{
					System.out.println("You sunk their Patrol Boat!");
				}
			}
			
			Board2[a][b] = 0;
		} 
		else 
		{
			System.out.println("Miss.");
		}
		Board2 [a][b] = 0;
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e)
		{

		}
		return Board2;
	}
	public int [][] P2Fire(int [][] Board1)
	{
		String fire = "";
		String SA = "";
		char a;
		int b;
		
		while(true)
		{
			System.out.println("Please enter fireing coordinate.");
			fire = scan.nextLine();
			fire = fire.toUpperCase();
			
			if (Character.isAlphabetic(fire.charAt(0)) && Character.isDigit(fire.charAt(1))) {	
				if (fire.length() >= 3 && (Character.isDigit(fire.charAt(2)) || fire.charAt(2) == ' ')) {
				}
				else if (fire.length() >= 3)
				{
					System.out.println("You may have mistyped that. Please retype it.");
					continue;
				}
			}
			else
			{
				System.out.println("You may have mistyped that. Please retype it.");
				continue;
			}
			
			SA = fire.substring(0,1);
			a = SA.charAt(0);
			a -= 65;
			try
			{
				b = Integer.parseInt(fire.substring(1));
			}
			catch (Exception e)
			{
				System.out.println("You may have mistyped that, please go back and retype it.");
				continue;
			}
			b -= 1;
			if (a >= Board1.length || -1 >= a)
			{
				System.out.println("The board is a different size, go back and retype.");
				continue;
			}
			else if (b >= Board1.length || -1 >= b)
			{
				System.out.println("The board is a different size, go back and retype.");
				continue;
			}
			break;
		}
		if (Board1 [a][b] != 0)
		{
			System.out.println("Enemy ship hit!");
			boolean sunk = true;
			for (int row = 0; row < Board1.length; row++) {
				for (int col = 0; col < Board1[row].length; col++)
				{
					if(row == a && col == b) continue;
					
					if(Board1 [row][col] == Board1 [a][b]) {
						sunk = false;
					}
				}
			}
			if (sunk) {
				if (Board1 [a][b] == 5)
				{
					System.out.println("You sunk their Aircraft Carrier!");
				}
				else if (Board1 [a][b] == 4)
				{
					System.out.println("You sunk their Battle Ship!");
				}
				else if (Board1 [a][b] == 3)
				{
					System.out.println("You sunk their Destoryer!");
				}
				else if(Board1 [a][b] == 1)
				{
					System.out.println("You sunk their Submarine!");
				}
				else if(Board1 [a][b] == 2)
				{
					System.out.println("You sunk their Patrol Boat!");
				}
			}
			
			Board1[a][b] = 0;
		}
		else 
		{
			System.out.println("Miss.");
		}
		Board1 [a][b] = 0;
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e)
		{

		}
		return Board1;
	}
}
