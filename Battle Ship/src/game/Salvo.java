package game;

import java.util.Scanner;

public class Salvo
{
	Scanner scan = new Scanner(System.in);
	public static void Rules()
	{
		System.out.println("These are the rules for the Salvo gamemode:");
		System.out.println("Each player takes turns fireing at the opponent. This is done by typing in a single coordinate when prompted.");
		System.out.println("Each player gets to fire X ammount of shots, which is based on how many ships you currently have. (E.X. each player will fire 5 times at the start)");
		System.out.println("If one of your ships gets sunk, you lose a shot. As long as a ship is intact, you still have that ships shot.");
		System.out.println("When a player loses all of their ships, they lose the game.");
		System.out.println("");
	}
	//make the fire method, which when a coordinate is input, turns that value to 0. have it do this for each ship that remains.
	public int [][] P1Fire(int [][] Board1, int [][] Board2)
	{
		String fire = "";
		String SA = "";
		char a;
		int b;
		int AC = 1;
		int BS = 1;
		int DES = 1;
		int SUB = 1;
		int PT = 1;
		for (int row = 0; row < Board1.length; row++) {
			for (int col = 0; col < Board1[row].length; col++)
			{
				if (Board1[row][col] == 5 && AC == 1)
				{
					AC = 0;
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
					if (Board2 [a][b] != 0)
					{
						System.out.println("Enemy ship hit!");
						boolean sunk = true;
						for (int row2 = 0; row2 < Board2.length; row++) {
							for (int col2 = 0; col2 < Board2[row2].length; col++)
							{
								if(row2 == a && col2 == b) continue;
								
								if(Board2 [row2][col2] == Board2 [a][b]) {
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
				}//first ship fire
				if (Board1[row][col] == 4 && BS == 1)
				{
					BS = 0;
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
					if (Board2 [a][b] != 0)
					{
						System.out.println("Enemy ship hit!");
						boolean sunk = true;
						for (int row2 = 0; row2 < Board2.length; row++) {
							for (int col2 = 0; col2 < Board2[row2].length; col++)
							{
								if(row2 == a && col2 == b) continue;
								
								if(Board2 [row2][col2] == Board2 [a][b]) {
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
				}//second ship fire
				if (Board1[row][col] == 3 && DES == 1)
				{
					DES = 0;
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
					if (Board2 [a][b] != 0)
					{
						System.out.println("Enemy ship hit!");
						boolean sunk = true;
						for (int row2 = 0; row2 < Board2.length; row++) {
							for (int col2 = 0; col2 < Board2[row2].length; col++)
							{
								if(row2 == a && col2 == b) continue;
								
								if(Board2 [row2][col2] == Board2 [a][b]) {
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
				}//third ship fire
				if (Board1[row][col] == 1 && SUB == 1)
				{
					SUB = 0;
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
					if (Board2 [a][b] != 0)
					{
						System.out.println("Enemy ship hit!");
						boolean sunk = true;
						for (int row2 = 0; row2 < Board2.length; row++) {
							for (int col2 = 0; col2 < Board2[row2].length; col++)
							{
								if(row2 == a && col2 == b) continue;
								
								if(Board2 [row2][col2] == Board2 [a][b]) {
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
				}//fourth ship fire
				if (Board1[row][col] == 2 && PT == 1)
				{
					PT = 0;
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
					if (Board2 [a][b] != 0)
					{
						System.out.println("Enemy ship hit!");
						boolean sunk = true;
						for (int row2 = 0; row2 < Board2.length; row++) {
							for (int col2 = 0; col2 < Board2[row2].length; col++)
							{
								if(row2 == a && col2 == b) continue;
								
								if(Board2 [row2][col2] == Board2 [a][b]) {
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
				}//fifth ship fire
			}
		}
		
		return Board2;
	}
	public int [][] P2Fire(int [][] Board1, int [][] Board2)
	{
		String fire = "";
		String SA = "";
		char a;
		int b;
		int AC = 1;
		int BS = 1;
		int DES = 1;
		int SUB = 1;
		int PT = 1;
		for (int row = 0; row < Board2.length; row++) {
			for (int col = 0; col < Board2[row].length; col++)
			{
				if (Board2[row][col] == 5 && AC == 1)
				{
					AC = 0;
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
						for (int row2 = 0; row2 < Board1.length; row++) {
							for (int col2 = 0; col2 < Board1[row2].length; col++)
							{
								if(row2 == a && col2 == b) continue;
								
								if(Board1 [row2][col2] == Board1 [a][b]) {
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
				}//first ship fire
				if (Board2[row][col] == 4 && BS == 1)
				{
					BS = 0;
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
						for (int row2 = 0; row2 < Board1.length; row++) {
							for (int col2 = 0; col2 < Board1[row2].length; col++)
							{
								if(row2 == a && col2 == b) continue;
								
								if(Board1 [row2][col2] == Board1 [a][b]) {
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
				}//second ship fire
				if (Board2[row][col] == 3 && DES == 1)
				{
					DES = 0;
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
						for (int row2 = 0; row2 < Board1.length; row++) {
							for (int col2 = 0; col2 < Board1[row2].length; col++)
							{
								if(row2 == a && col2 == b) continue;
								
								if(Board1 [row2][col2] == Board1 [a][b]) {
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
				}//third ship fire
				if (Board2[row][col] == 1 && SUB == 1)
				{
					SUB = 0;
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
						for (int row2 = 0; row2 < Board1.length; row++) {
							for (int col2 = 0; col2 < Board1[row2].length; col++)
							{
								if(row2 == a && col2 == b) continue;
								
								if(Board1 [row2][col2] == Board1 [a][b]) {
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
				}//fourth ship fire
				if (Board2[row][col] == 2 && PT == 1)
				{
					PT = 0;
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
						for (int row2 = 0; row2 < Board1.length; row++) {
							for (int col2 = 0; col2 < Board1[row2].length; col++)
							{
								if(row2 == a && col2 == b) continue;
								
								if(Board1 [row2][col2] == Board1 [a][b]) {
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
				}//fifth ship fire
			}
		}
		
		return Board1;
	}
}
