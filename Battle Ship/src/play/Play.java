package play;

import game.Board;
import game.Classic;
import game.Salvo;
import game.Start;
//import players.Computer;
import players.Player1;
import players.Player2;

public class Play
{
	int gamemode;
	int map;
	int [][] Board1;
	int [][] Board2;
	boolean game = true;
	public Play(int gamemode, int map)
	{
		this.gamemode = gamemode;
		this.map = map;
	}
	
	public void runPvP()
	{
	//call player1 methods, call game mode and map methods. Then get them all to start playing.
		Board1 = new Board(map).mapSelect1();
		Board2 = new Board(map).mapSelect2();
	
		System.out.println("Player 2, please look away whie player one inputs their ships.");
		System.out.println("");
		Board1 = new Player1(Board1).shipPlace();
		System.out.println("This is your board");
		for (int row = 0; row < Board1.length; row++) 
		{
			for (int col = 0; col < Board1[row].length; col++)
			{
				System.out.print(Board1[row][col] + " ");
			}
			System.out.println();
		}	
		try
		{
			Thread.sleep(7000);
		}
		catch (InterruptedException e)
		{
		
		}
		for (int i = 0; i <= 50; i++)
		{
			System.out.println("");
		}
		System.out.println("--------------------------------------CHEAT-LINE-------------------------------------------");
		System.out.println("Player 1, please look away while player 2 inputs their ships.");
		try
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e)
		{

		}
		for (int i = 0; i <= 50; i++)
		{
			System.out.println("");
		}
		
		Board2 = new Player2(Board2).shipPlace();
		System.out.println("This is your board.");
		for (int row = 0; row < Board2.length; row++) 
		{
			for (int col = 0; col < Board2[row].length; col++)
			{
				System.out.print(Board2[row][col] + "  ");
			}
			System.out.println();
		}	
		
		try
		{
			Thread.sleep(7000);
		} 
		catch (InterruptedException e)
		{

		}
		System.out.println("Players! Get ready for combat!");
		try
		{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e)
		{

		}
		for (int i = 0; i <= 30; i++)
		{
			System.out.println("");
		}
		System.out.println("--------------------------------------CHEAT-LINE-------------------------------------------");
		for (int i = 0; i <= 30; i++)
		{
			System.out.println("");
		}
		System.out.println("Player1, the turn begins with you.");
		boolean empty1 = true;
		boolean empty2 = true;
		int turn = 0;
		boolean playerTurn = true;
		while (game == true)
		{
			
			
		System.out.println(" ");
			
			if (gamemode == 1)
			{
				if (turn==1 && playerTurn==true)
				{
					System.out.println("Player 1, it is now your turn.");
					Board2 = new Classic().P1Fire(Board2);
					System.out.println("");
					playerTurn = false;
				}
				else if (turn==1 && playerTurn==false)
				{
					System.out.println("Player 2, it is now your turn.");
					Board1 = new Classic().P2Fire(Board1);
					System.out.println("");
					playerTurn = true;
				}
				else 
				{
					Board2 = new Classic().P1Fire(Board2);
					System.out.println("");
					System.out.println("Player 2, your turn begins now.");
					Board1 = new Classic().P2Fire(Board1);
					System.out.println("");
					turn = 1;
				}
			}
			else
			{
				if (turn==1 && playerTurn==true)
				{
					System.out.println("Player 1, it is now your turn.");
					Board2 = new Salvo().P1Fire(Board1, Board2);
					System.out.println("");
					playerTurn = false;
				}
				else if (turn==1 && playerTurn==false)
				{
					System.out.println("Player 2, it is now your turn.");
					Board1 = new Salvo().P2Fire(Board1, Board2);
					System.out.println("");
					playerTurn = true;
				}
				else 
				{
					Board2 = new Salvo().P1Fire(Board1, Board2);
					System.out.println("");
					System.out.println("Player 2, your turn begins now.");
					Board1 = new Salvo().P2Fire(Board1, Board2);
					System.out.println("");
					turn = 1;
				}
			}
			
			for (int row = 0; row < Board1.length; row++)
			{
				for (int col = 0; col < Board1[row].length; col++) 
				{
					if (Board1 [row][col] != 0)
					{
						empty1 = false;
						break;
					}
					else
						empty1 = true;
				}
				if (empty1 == false)
					break;
			}
			
			for (int row = 0; row < Board2.length; row++)
			{
				for (int col = 0; col < Board2[row].length; col++) 
				{
					if (Board2 [row][col] != 0)
					{
						empty2 = false;
						break;
					}
					else
						empty2 = true;
				}
				if (empty2 == false)
					break;
			}
			if (empty1 == true || empty2 == true)
			{
				game = false;
			}
		} //while loop end
		if (empty1 == true)
		{
			System.out.println("Congratulations Player 2! You have sunk all of Player 1's ships! Have fun in your victory and feel free to gloat about it over Player 1!");
			System.out.println("");
			try
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e)
			{

			}
		}
		if(empty2 == true)
		{
			System.out.println("Congratulations Player 1! You have sunk all of Player 2's ships! Have fun in your victory and feel free to gloat about it over Player 2!");
			System.out.println("");
			try
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e)
			{

			}
		}
		new Start().run();
	}// runPvP method end
	/*
	public void runPvC()
	{
		
	}
	*/
}
