package game;

public class Board
{
	int map;
	public Board(int map)
	{
		this.map = map;
	}
	
	public int [][] mapSelect1()
	{
		int [][] Board1;
		if (map == 1)
		{
			Board1 = new int[8] [8];
		}
		else if (map == 2)
		{
			Board1 = new int[10] [10];
		}
		else
		{
			Board1 = new int[12] [12];		
		}
		
		return Board1;
	}
	
	public int [][] mapSelect2()
	{
		int [][] Board2;
		if (map == 1)
		{
			Board2 = new int[8] [8];
		}
		else if (map == 2)
		{
			Board2 = new int [10] [10];
		}
		else
		{
			Board2 = new int [12] [12];
		}
		return Board2;
	}	
}
