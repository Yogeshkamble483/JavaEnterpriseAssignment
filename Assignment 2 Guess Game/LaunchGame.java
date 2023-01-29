import java.util.Random;
import java.util.Scanner;

class Guesser
{
	
	int guessNum;
	
	public int guessNumber()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser Kindly guess the number \n");
	    guessNum= sc.nextInt(); 
		return guessNum;	
	}
}
class Players
{
	
	int pgussNum;
	
	public int PguessNum()
	{
		    Scanner sc = new Scanner(System.in);
			System.out.println("Player  can guess the number");
			pgussNum = sc.nextInt();		
			return pgussNum;	
	}
}
class Umapier
{
	
	int numFromGuesser,numFromPlayer1,numFromPlayer2,numFromPlayer3;

	public void CollectNumFromGuesser()
	{   Guesser g = new Guesser();
	 	numFromGuesser	= g.guessNumber();
	}
	public void CollectNumFromPlayers()
	{
		if(numFromGuesser>=0 && numFromGuesser<=10)
		{
		Players p1 = new Players();
		Players p2 = new Players();
		Players p3 = new Players();
		
		
		numFromPlayer1 = p1.PguessNum(); 
		numFromPlayer2 = p2.PguessNum(); 
		numFromPlayer3 = p3.PguessNum();
		}
//		else
//		{
//			System.out.println("You Entered More than 10 number");
//		}
	}	
	
	public void CompaierNum()
	{
		
		Guesser g = new Guesser(); 

		if(numFromGuesser>=0 && numFromGuesser<=10)
		{
		  if(numFromGuesser==numFromPlayer1)
		  {
			if(numFromGuesser ==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game Tied all  three players guessed correctly");
			}
			else if(numFromGuesser ==numFromPlayer2)
			{
				System.out.println("Player 1  and 2 won the Game");
			}
			else if(numFromGuesser == numFromPlayer3)
			{
			System.out.println("Player 1 and 3 won the Game");
			}
			else {System.out.println("Player 3 won the Game");}
	      }
		
		 else if(numFromGuesser==numFromPlayer2)
		 {
			if(numFromGuesser == numFromPlayer3)
			{
				System.out.println("Player 2 and 3 won the Game");
			}
			else 
			{
				System.out.println("Player 2 won the Game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the Game"); 	
		}
		else
		{System.out.println("Game Lost Try Again");
		}
		}
		else {System.out.println("You Entered More then 10 Number");}
	}
}

public class LaunchGame 
{
	public static void main(String[] args)
	{		
	    Umapier u = new Umapier();
		u.CollectNumFromGuesser();
		u.CollectNumFromPlayers();
		u.CompaierNum();
	}

}
 