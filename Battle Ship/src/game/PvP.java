package game;

import java.util.Scanner;

import play.Play;
public class PvP
{
	public int gamemode = 0;
	public int map = 0;
	public void run()
	{
		System.out.println("Please input gamemode, Classic, or Salvo.");
		
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			String a = "";
			a = scan.nextLine();
			a = a.toLowerCase();
			if (a.equals("classic"))
			{
				System.out.println("You have selected: Classic");
				System.out.println("If you are unfamiliar with how Classic's gameplay is, please type \"rules\"");
				gamemode = 1;
				break;
			}
			else if (a.equals("salvo"))
			{
				System.out.println("You have selected: Salvo");
				System.out.println("If you are unfamiliar with how Salvo's gameplay is, please type \"rules\"");
				gamemode = 2;
				break;
			}
			else
			{
				System.out.println("Please retype that.");
			}
		} //while loop end
		System.out.println("Please input board size. Small (8x8), Medium (10x10), or Large(12x12)");
		
		while (true)
		{
			String b = "";
			b = scan.nextLine();
			b = b.toLowerCase();
			
			if (b.equals("small"))
			{
				map = 1;
				break;
			}
			else if (b.equals("medium"))
			{
				map = 2;
				break;
			}
			else if (b.equals("large"))
			{
				map = 3;
				break;
			}
			else if (gamemode == 1 && b.equals("rules"))
			{
				new Classic();
				Classic.Rules();
				System.out.println("If you are now familiar with the rules, please input the desired board size");
			}
			else if (gamemode == 2 && b.equals("rules"))
			{
				new Salvo();
				Salvo.Rules();
				System.out.println("If you are now familiar with the rules, please input the desired board size");
			}
			else
			{
				System.out.println("Please retype that.");
			}
		}//while loop end
		new Play(gamemode, map).runPvP();
	}// run method end
}