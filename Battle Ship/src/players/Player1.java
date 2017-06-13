package players;

import game.Start;
import java.util.Scanner;

public class Player1
{
	int [][] Board1; 
	public Player1(int [][] Board1)
	{
		this.Board1 = Board1;
	}
	public int [][] shipPlace()
	{
		String AC1 = ""; 
		String AC2 = "";
		String BS1 = "";
		String BS2 = "";
		String DES1 = "";
		String DES2 = "";
		String SUB1 = "";
		String SUB2 = "";
		String PT1 = "";
		String PT2 = "";
		
		String SACr1 = ""; 
		String SACr2 = "";
		String SBSr1 = ""; 
		String SBSr2 = "";
		String SDESr1 = "";
		String SDESr2 = "";
		String SSUBr1 = "";
		String SSUBr2 = "";
		String SPTr1 = "";
		String SPTr2 = "";
		
		char ACr1, ACr2;
		char BSr1, BSr2;
		char DESr1, DESr2;
		char SUBr1, SUBr2;
		char PTr1, PTr2;
		
		int ACc1, ACc2;
		int BSc1, BSc2;
		int DESc1, DESc2;
		int SUBc1, SUBc2;
		int PTc1, PTc2;
		
		boolean place = true;
		boolean ACplace = true;
		boolean BSplace = true;
		boolean DESplace = true;
		boolean SUBplace = true;
		boolean PTplace = true;
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Player 1, please input your ship coordinates. Refer to the basic rules if need be by typing \"rules\"");
		
		while (place == true)
		{
		new Start();	
		while (ACplace == true)
			{
				// first coordinate
				System.out.println("Place your Aircraft Carrier!");
				System.out.println("Remember, the Aircraft Carrier is 5 spaces long.");
				AC1 = scan1.nextLine();
				AC1 = AC1.toUpperCase();
				
				if (AC1.equals("RULES")) {
					Start.rules();
					continue;
				}
				if (Character.isAlphabetic(AC1.charAt(0)) && Character.isDigit(AC1.charAt(1)) || AC1.charAt(0) == ' ') {	
					if (AC1.length() >= 3 && (Character.isDigit(AC1.charAt(2)) || AC1.charAt(2) == ' ')) {
					}
					else if (AC1.length() >= 3)
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
				
					SACr1 = AC1.substring(0,1);
					ACr1 = SACr1.charAt(0);
					ACr1 -= 65;
					try
					{
						ACc1 = Integer.parseInt(AC1.substring(1));
					}
					catch (Exception e)
					{
						System.out.println("You may have mistyped that, please go back and retype it.");
						continue;
					}
					ACc1 -= 1;
					if (ACr1 >= Board1.length || -1 >= ACr1)
					{
						System.out.println("The board is a different size, go back and retype.");
						continue;
					}
					else if (ACc1 >= Board1.length || -1 >= ACc1)
					{
						System.out.println("The board is a different size, go back and retype.");
						continue;
					}
					// second coordinate
				
					AC2 = scan1.nextLine();
					AC2 = AC2.toUpperCase();
					
					if (Character.isAlphabetic(AC2.charAt(0)) && Character.isDigit(AC2.charAt(1)) || AC2.charAt(0) ==  ' ' ) {	
						if (AC2.length() >= 3 && (Character.isDigit(AC2.charAt(2)) || AC2.charAt(2) == ' ')) {
						}
						else if (AC2.length() >= 3)
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
					
					SACr2 = AC2.substring(0,1);
					ACr2 = SACr2.charAt(0);
					ACr2 -= 65;
					try
					{
						ACc2 = Integer.parseInt(AC2.substring(1)); 
					}
					catch (Exception e)
					{
						System.out.println("You may have mistyped that, please go back and retype it.");
						continue;
					}
					ACc2 -= 1;
					if (ACr2 >= Board1.length || -1 >= ACr2)
					{
						System.out.println("The board is a different size, go back and retype.");
						continue;
					}
					else if (ACc2 >= Board1.length || -1 >= ACc2)
					{
						System.out.println("The board is a different size, go back and retype.");
						continue;
					}
					if (ACr1 == ACr2 && ACc1 != ACc2)
					{
						if (ACc2 == ACc1+4)
						{
							Board1 [ACr1] [ACc1] = 5;
							Board1 [ACr1] [ACc1+1] = 5;
							Board1 [ACr1] [ACc1+2] = 5;
							Board1 [ACr1] [ACc1+3] = 5;
							Board1 [ACr2] [ACc2] = 5;
							ACplace = false;
						}
						else if (ACc2 == ACc1-4)
						{
							Board1 [ACr1] [ACc1] = 5;
							Board1 [ACr1] [ACc1-1] = 5;
							Board1 [ACr1] [ACc1-2] = 5;
							Board1 [ACr1] [ACc1-3] = 5;
							Board1 [ACr2] [ACc2] = 5;
							ACplace = false;
						}
						else
						{
							System.out.println("Your ship can't be in those coordinates, go back and retype them.");
						}
					}
					else if (ACr1 != ACr2 && ACc1 == ACc2)
					{
						if (ACr2 == ACr1+4)
						{
							Board1 [ACr1] [ACc1] = 5;
							Board1 [ACr1+1] [ACc1] = 5;
							Board1 [ACr1+2] [ACc1] = 5;
							Board1 [ACr1+3] [ACc1] = 5;
							Board1 [ACr2] [ACc2] = 5;
							ACplace = false;
						}
						else if (ACr2 == ACr1-4)
						{
							Board1 [ACr1] [ACc1] = 5;
							Board1 [ACr1-1] [ACc1] = 5;
							Board1 [ACr1-2] [ACc1] = 5;
							Board1 [ACr1-3] [ACc1] = 5;
							Board1 [ACr2] [ACc2] = 5;
							ACplace = false;
						}
						else
						{
							System.out.println("Your ship can't be in those coordinates, go back and retype them.");
						}
					}
					else 
					{
						System.out.println("You may have input your ship coordinates incorrectly, please retype them.");
					}
			} //AC placement end
			while (BSplace == true)
			{
				// first coordinate
				System.out.println("Place your Battleship!");
				System.out.println("Remember, the Battleship is 4 spaces long");
				BS1 = scan1.nextLine();
				BS1 = BS1.toUpperCase();
				
				if (BS1.equals("RULES")) {
					Start.rules();
					continue;
				}
				if (Character.isAlphabetic(BS1.charAt(0)) && Character.isDigit(BS1.charAt(1)) || BS1.charAt(0) == ' ') {	
					if (BS1.length() >= 3 && (Character.isDigit(BS1.charAt(2)) || BS1.charAt(2) == ' ')) {
					}
					else if (BS1.length() >= 3)
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
				
				SBSr1 = BS1.substring(0,1);
				BSr1 = SBSr1.charAt(0);
				BSr1 -= 65;
				try
				{
					BSc1 = Integer.parseInt(BS1.substring(1));
				}
				catch (Exception e)
				{
					System.out.println("You may have mistyped that, please go back and retype it.");
					continue;
				}
				BSc1 -= 1;
				if (BSr1 >= Board1.length || -1 >= BSr1)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				else if (BSc1 >= Board1.length || -1 >= BSc1)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				// second coordinate
				BS2 = scan1.nextLine();
				BS2 = BS2.toUpperCase();
				
				if (Character.isAlphabetic(BS2.charAt(0)) && Character.isDigit(BS2.charAt(1))) {	
					if (BS2.length() >= 3 && (Character.isDigit(BS2.charAt(2)) || BS2.charAt(2) == ' ')) {
					}
					else if (BS2.length() >= 3)
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
				
				SBSr2 = BS2.substring(0,1);
				BSr2 = SBSr2.charAt(0);
				BSr2 -= 65;
				try
				{
					BSc2 = Integer.parseInt(BS2.substring(1));
				}
				catch (Exception e)
				{
					System.out.println("You may have mistyped that, please go back and retype it.");
					continue;
				}
				BSc2 -= 1;
				if (BSr2 >= Board1.length || -1 >= BSr2)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				else if (BSc2 >= Board1.length || -1 >= BSc2)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				
				if (BSr1 == BSr2 && BSc1 != BSc2)
				{
					if (BSc2 == BSc1+3)
					{	
						if (Board1 [BSr1] [BSc1] != 0 || Board1 [BSr1] [BSc1+1] != 0 || Board1 [BSr1] [BSc1+2] != 0 || Board1 [BSr2] [BSc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [BSr1] [BSc1] = 4;
							Board1 [BSr1] [BSc1+1] = 4;
							Board1 [BSr1] [BSc1+2] = 4;
							Board1 [BSr2] [BSc2] = 4;
							BSplace = false;
						}
					}
					else if (BSc2 == BSc1-3)
					{
						if (Board1 [BSr1] [BSc1] != 0 || Board1 [BSr1] [BSc1-1] != 0 || Board1 [BSr1] [BSc1-2] != 0 || Board1 [BSr2] [BSc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [BSr1] [BSc1] = 4;
							Board1 [BSr1] [BSc1-1] = 4;
							Board1 [BSr1] [BSc1-2] = 4;
							Board1 [BSr2] [BSc2] = 4;
							BSplace = false;
						}
					}		
					else
					{
						System.out.println("Your ship can't be in those coordinates, go back and retype them.");
					}
				}
				else if (BSr1 != BSr2 && BSc1 == BSc2)
				{
					if (BSr2 == BSr1+3)
					{	
						if (Board1 [BSr1] [BSc1] != 0 || Board1 [BSr1+1] [BSc1] != 0 || Board1 [BSr1+2] [BSc1] != 0 || Board1 [BSr2] [BSc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [BSr1] [BSc1] = 4;
							Board1 [BSr1+1] [BSc1] = 4;
							Board1 [BSr1+2] [BSc1] = 4;
							Board1 [BSr2] [BSc2] = 4;
							BSplace = false;
						}
					}
					else if (BSr2 == BSr1-3)
					{
						if (Board1 [BSr1] [BSc1] != 0 || Board1 [BSr1-1] [BSc1] != 0 || Board1 [BSr1-2] [BSc1] != 0 || Board1 [BSr2] [BSc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [BSr1] [BSc1] = 4;
							Board1 [BSr1-1] [BSc1] = 4;
							Board1 [BSr1-2] [BSc1] = 4;
							Board1 [BSr2] [BSc2] = 4;
							BSplace = false;
						}
					}		
					else
					{
						System.out.println("Your ship can't be in those coordinates, go back and retype them.");
					}
				}
				else 
				{
					System.out.println("You may have input your ship coordinates incorrectly, please retype them.");
				}
			} //BS placement end
			while (DESplace == true)
			{
				// first coordinate
				System.out.println("Place your Destroyer!");
				System.out.println("Remember, the Destroyer is 3 spaces long");
				DES1 = scan1.nextLine();
				DES1 = DES1.toUpperCase();
				if (DES1.equals("RULES")) {
					Start.rules();
					continue;
				}
				
				if (Character.isAlphabetic(DES1.charAt(0)) && Character.isDigit(DES1.charAt(1))) {	
					if (DES1.length() >= 3 && (Character.isDigit(DES1.charAt(2)) || DES1.charAt(2) == ' ')) {
					}
					else if (DES1.length() >= 3)
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
				
				SDESr1 = DES1.substring(0,1);
				DESr1 = SDESr1.charAt(0);
				DESr1 -= 65;
				try
				{
					DESc1 = Integer.parseInt(DES1.substring(1));
				}
				catch (Exception e)
				{
					System.out.println("You may have mistyped that, please go back and retype it.");
					continue;
				}
				DESc1 -= 1;
				if (DESr1 >= Board1.length || -1 >= DESr1)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				else if (DESc1 >= Board1.length || -1 >= DESc1)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				
				// second coordinate
				DES2 = scan1.nextLine();
				DES2 = DES2.toUpperCase();
				
				if (Character.isAlphabetic(DES2.charAt(0)) && Character.isDigit(DES2.charAt(1))) {	
					if (DES2.length() >= 3 && (Character.isDigit(DES2.charAt(2)) || DES2.charAt(2) == ' ')) {
					}
					else if (DES2.length() >= 3)
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
				
				SDESr2 = DES2.substring(0,1);
				DESr2 = SDESr2.charAt(0);
				DESr2 -= 65;
				try
				{
					DESc2 = Integer.parseInt(DES2.substring(1));
				}
				catch (Exception e)
				{
					System.out.println("You may have mistyped that, please go back and retype it.");
					continue;
				}
				DESc2 -= 1;
				if (DESr2 >= Board1.length || -1 >= DESr2)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				else if (DESc2 >= Board1.length || -1 >= DESc2)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				
				if (DESr1 == DESr2 && DESc1 != DESc2)
				{
					if (DESc2 == DESc1+2)
					{	
						if (Board1 [DESr1] [DESc1] != 0 || Board1 [DESr1] [DESc1+1] != 0 || Board1 [DESr2] [DESc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [DESr1] [DESc1] = 3;
							Board1 [DESr1] [DESc1+1] = 3;
							Board1 [DESr2] [DESc2] = 3;
							DESplace = false;
						}
					}
					else if (DESc2 == DESc1-2)
					{
						if (Board1 [DESr1] [DESc1] != 0 || Board1 [DESr1] [DESc1-1] != 0 || Board1 [DESr2] [DESc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [DESr1] [DESc1] = 3;
							Board1 [DESr1] [DESc1-1] = 3;
							Board1 [DESr2] [DESc2] = 3;
							DESplace = false;
						}
					}		
					else
					{
						System.out.println("Your ship can't be in those coordinates, go back and retype them.");
					}
				}
				else if (DESr1 != DESr2 && DESc1 == DESc2)
				{
					if (DESr2 == DESr1+2)
					{	
						if (Board1 [DESr1] [DESc1] != 0 || Board1 [DESr1+1] [DESc1] != 0 || Board1 [DESr2] [DESc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [DESr1] [DESc1] = 3;
							Board1 [DESr1+1] [DESc1] = 3;
							Board1 [DESr2] [DESc2] = 3;
							DESplace = false;
						}
					}
					else if (DESr2 == DESr1-2)
					{
						if (Board1 [DESr1] [DESc1] != 0 || Board1 [DESr1-1] [DESc1] != 0 || Board1 [DESr2] [DESc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [DESr1] [DESc1] = 3;
							Board1 [DESr1-1] [DESc1] = 3;
							Board1 [DESr2] [DESc2] = 3;
							DESplace = false;
						}
					}		
					else
					{
						System.out.println("Your ship can't be in those coordinates, go back and retype them.");
					}
				}
				else 
				{
					System.out.println("You may have input your ship coordinates incorrectly, please retype them.");
				}
			} //DES placement end
			while (SUBplace == true)
			{
				// first coordinate
				System.out.println("Place your Submarine!");
				System.out.println("Remember, the Submarine is 3 spaces long");
				SUB1 = scan1.nextLine();
				SUB1 = SUB1.toUpperCase();
				if (SUB1.equals("RULES")) {
					Start.rules();
					continue;
				}
			
				if (Character.isAlphabetic(SUB1.charAt(0)) && Character.isDigit(SUB1.charAt(1))) {	
					if (SUB1.length() >= 3 && (Character.isDigit(SUB1.charAt(2)) || SUB1.charAt(2) == ' ')) {
					}
					else if (SUB1.length() >= 3)
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
				
				SSUBr1 = SUB1.substring(0,1);
				SUBr1 = SSUBr1.charAt(0);
				SUBr1 -= 65;
				try
				{
					SUBc1 = Integer.parseInt(SUB1.substring(1));
				}
				catch (Exception e)
				{
					System.out.println("You may have mistyped that, please go back and retype it.");
					continue;
				}
				SUBc1 -= 1;
				if (SUBr1 >= Board1.length || -1 >= SUBr1)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				else if (SUBc1 >= Board1.length || -1 >= SUBc1)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				
				// second coordinate
				SUB2 = scan1.nextLine();
				SUB2 = SUB2.toUpperCase();
				
				if (Character.isAlphabetic(SUB2.charAt(0)) && Character.isDigit(SUB2.charAt(1))) {	
					if (SUB2.length() >= 3 && (Character.isDigit(SUB2.charAt(2)) || SUB2.charAt(2) == ' ')) {
					}
					else if (SUB2.length() >= 3)
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
				
				SSUBr2 = SUB2.substring(0,1);
				SUBr2 = SSUBr2.charAt(0);
				SUBr2 -= 65;
				try
				{
					SUBc2 = Integer.parseInt(SUB2.substring(1));
				}
				catch (Exception e)
				{
					System.out.println("You may have mistyped that, please go back and retype it.");
					continue;
				}
				SUBc2 -= 1;
				if (SUBr2 >= Board1.length || -1 >= SUBr2)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				else if (SUBc2 >= Board1.length || -1 >= SUBc2)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				
				if (SUBr1 == SUBr2 && SUBc1 != SUBc2)
				{
					if (SUBc2 == SUBc1+2)
					{	
						if (Board1 [SUBr1] [SUBc1] != 0 || Board1 [SUBr1] [SUBc1+1] != 0 || Board1 [SUBr2] [SUBc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [SUBr1] [SUBc1] = 1;
							Board1 [SUBr1] [SUBc1+1] = 1;
							Board1 [SUBr2] [SUBc2] = 1;
							SUBplace = false;
						}
					}
					else if (SUBc2 == SUBc1-2)
					{
						if (Board1 [SUBr1] [SUBc1] != 0 || Board1 [SUBr1] [SUBc1-1] != 0 || Board1 [SUBr2] [SUBc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [SUBr1] [SUBc1] = 1;
							Board1 [SUBr1] [SUBc1-1] = 1;
							Board1 [SUBr2] [SUBc2] = 1;
							SUBplace = false;
						}
					}		
					else
					{
						System.out.println("Your ship can't be in those coordinates, go back and retype them.");
					}
				}
				else if (SUBr1 != SUBr2 && SUBc1 == SUBc2)
				{
					if (SUBr2 == SUBr1+2)
					{	
						if (Board1 [SUBr1] [SUBc1] != 0 || Board1 [SUBr1+1] [SUBc1] != 0 || Board1 [SUBr2] [SUBc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [SUBr1] [SUBc1] = 1;
							Board1 [SUBr1+1] [SUBc1] = 1;
							Board1 [SUBr2] [SUBc2] = 1;
							SUBplace = false;
						}
					}
					else if (SUBr2 == SUBr1-2)
					{
						if (Board1 [SUBr1] [SUBc1] != 0 || Board1 [SUBr1-1] [SUBc1] != 0 || Board1 [SUBr2] [SUBc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [SUBr1] [SUBc1] = 1;
							Board1 [SUBr1-1] [SUBc1] = 1;
							Board1 [SUBr2] [SUBc2] = 1;
							SUBplace = false;
						}
					}		
					else
					{
						System.out.println("Your ship can't be in those coordinates, go back and retype them.");
					}
				}
				else 
				{
					System.out.println("You may have input your ship coordinates incorrectly, please retype them.");
				}
			} //SUB placement end
			while (PTplace == true)
			{
				// first coordinate
				System.out.println("Place your Patrol Boat!");
				System.out.println("Remember, the Patrol Boat is 2 spaces long");
				PT1 = scan1.nextLine();
				PT1 = PT1.toUpperCase();
				if (PT1.equals("RULES")) {
					Start.rules();
					continue;
				}
				
				if (Character.isAlphabetic(PT1.charAt(0)) && Character.isDigit(PT1.charAt(1))) {	
					if (PT1.length() >= 3 && (Character.isDigit(PT1.charAt(2)) || PT1.charAt(2) == ' ')) {
					}
					else if (PT1.length() >= 3)
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
				
				SPTr1 = PT1.substring(0,1);
				PTr1 = SPTr1.charAt(0);
				PTr1 -= 65;
				try
				{
					PTc1 = Integer.parseInt(PT1.substring(1));
				}
				catch (Exception e)
				{
					System.out.println("You may have mistyped that, please go back and retype it.");
					continue;
				}
				PTc1 -= 1;
				if (PTr1 >= Board1.length || -1 >= PTr1)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				else if (PTc1 >= Board1.length || -1 >= PTc1)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				
				// second coordinate
				PT2 = scan1.nextLine();
				PT2 = PT2.toUpperCase();
				
				if (Character.isAlphabetic(PT2.charAt(0)) && Character.isDigit(PT2.charAt(1))) {	
					if (PT2.length() >= 3 && (Character.isDigit(PT2.charAt(2)) || PT2.charAt(2) == ' ')) {
					}
					else if (PT2.length() >= 3)
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
				
				SPTr2 = PT2.substring(0,1);
				PTr2 = SPTr2.charAt(0);
				PTr2 -= 65;
				try
				{
					PTc2 = Integer.parseInt(PT2.substring(1));
				}
				catch (Exception e)
				{
					System.out.println("You may have mistyped that, please go back and retype it.");
					continue;
				}
				PTc2 -= 1;
				if (PTr2 >= Board1.length || -1 >= PTr2)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				else if (PTc2 >= Board1.length || -1 >= PTc2)
				{
					System.out.println("The board is a different size, go back and retype.");
					continue;
				}
				
				if (PTr1 == PTr2 && PTc1 != PTc2)
				{
					if (PTc2 == PTc1+1)
					{	
						if (Board1 [PTr1] [PTc1] != 0 || Board1 [PTr2] [PTc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [PTr1] [PTc1] = 2;
							Board1 [PTr2] [PTc2] = 2;
							PTplace = false;
						}
					}
					else if (PTc2 == PTc1-1)
					{
						if (Board1 [PTr1] [PTc1] != 0 || Board1 [PTr2] [PTc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [PTr1] [PTc1] = 2;
							Board1 [PTr2] [PTc2] = 2;
							PTplace = false;
						}
					}		
					else
					{
						System.out.println("Your ship can't be in those coordinates, go back and retype them.");
					}
				}
				else if (PTr1 != PTr2 && PTc1 == PTc2)
				{
					if (PTr2 == PTr1+1)
					{	
						if (Board1 [PTr1] [PTc1] != 0 || Board1 [PTr2] [PTc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [PTr1] [PTc1] = 2;
							Board1 [PTr2] [PTc2] = 2;
							PTplace = false;
						}
					}
					else if (PTr2 == PTr1-1)
					{
						if (Board1 [PTr1] [PTc1] != 0 || Board1 [PTr2] [PTc2] != 0)
						{
							System.out.println("Your ships are intersecting, that's not allowed. Please retype this ships coordinates.");
						}
						else
						{
							Board1 [PTr1] [PTc1] = 2;
							Board1 [PTr2] [PTc2] = 2;
							PTplace = false;
						}
					}		
					else
					{
						System.out.println("Your ship can't be in those coordinates, go back and retype them.");
					}
				}
				else 
				{
					System.out.println("You may have input your ship coordinates incorrectly, please retype them.");
				}
				place = false;
			} //PT placement end
		}
		return Board1;
	} //method end
}
