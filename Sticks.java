package compsci;
import java.util.Scanner;



public class Sticks 
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		int sticks = (int)(Math.random()*10) + 21;
		System.out.println("There are " + sticks + " Sticks" );
		System.out.println("Select 1 for you to go first, Select 2 for the computer to go first.  ");
		boolean turn; 
		if (reader.nextInt()==1)
			turn = true; 
		else 
			turn = false;
		while (sticks > 0)
		{
			if (turn)
				sticks = playerMove(sticks, reader);
			else
				sticks = computerMove(sticks);
			System.out.println("There are "+ sticks + " left");
			if( sticks == 0 && turn)
				System.out.println("Player Wins!");
			if(sticks == 0 && !turn)
				System.out.println("Compuyter Wins! ");
			turn = !turn;
			
		}
	}//end of main
	public static int playerMove(int sticks,  Scanner reader)
	{
		System.out.println("Select how many sticks to take");
		int take = reader.nextInt();
		if (take< 1)
			take = 1; 
		if (take > 3)
			take = 3;
		else if (take > sticks)
			take = sticks; 
		System.out.println("You took "+ take + " sticks");
		return sticks - take; 
	}
	public static int computerMove(int sticks)
	{
		int take; 
		if (sticks % 4 != 0)
			take = sticks % 4;
		else 
			take = (int)(Math.random()*3)+1;
		System.out.println("\nThe computer took "+ take + " sticks"); 
		return sticks - take; 
		
	}
	
	
}

