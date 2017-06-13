package game;

import java.util.Scanner;
public class Start
{
	public int choice = 6;
	public void run()
	{
		
		System.out.println("Welcome to Battle Ship!");
		System.out.println("Please input number of players. You will face a computer if there is only 1 player.");
		System.out.println("Or, press 0 to quit.");
		System.out.println("If you are unfamiliar with the rules of BattleShip, please press 5.");
		Scanner scan = new Scanner(System.in);
		
		while (true)
		{
			try 
			{
				choice = scan.nextInt();scan.nextLine();
			}
			catch (Exception e)
			{
				scan.nextLine();
				System.out.println("No letters should be inclueded in the NUMBER of players.");
			}
			if (choice == 1)
			{
				new PvC().run();
				break;
			}
			else if (choice == 2)
			{
				new PvP().run();
				break;
			}
			else if (choice == 0)
			{
				break;
			}
			else if (choice == 5)
			{
				new Start();
				Start.rules();
			}
			else
			{
				System.out.println("Please enter a valid choice.");
			}
		} //while loop end
	} //run method end
	public static void rules()
	{
		System.out.println("These are the basic rules of Battle Ship: Text edition.");
		System.out.println("Each player will select where they want their ships to go. This is done by typing in the position as: (position), then (position) e.x: A5, to A9. ");
		System.out.println("The Aircraft Carrier goes first, then the Battleship, then the Destoryer, then the Submarine, and then finally the Patrol boat.");
		System.out.println("Each boat occupies a different ammount of spaces. AC is 5, BS is 4, Des is 3, Sub is 3, and PB is 2.");
		System.out.println("Ships may not intersect each other, nor may they be diagonal in position. They are also not allowed to somehow be positioned off the board.");
		System.out.println("When fireing, enter a single coordinate (or multiple, if you're playing Salvo). This \"fires\" a missle that will destory whatever occupies that coordinate. ");
		System.out.println("");
		System.out.println("If you are now familiar with the rules, please carry on.");
	}
}
