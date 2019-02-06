// package nello;
// import java.util.Scanner;
// import java.util.Random;

// public class game {

// 	static int score1 = 0;
// 	static int score2 = 0;
// 	static int counter = 1;
// 	static int len; //gets length of word
// 	public static void promptEnterKey() //enter kry
// 	{
// 		System.out.println("(Press \"ENTER\" to continue...)");
// 		Scanner scan = new Scanner(System.in);
// 		scan.nextLine();
// 	}

// 	public static int random() //getting a random number between 3 and 5
// 	{
// 		Random rand = new Random();
// 		int n = rand.nextInt(3) + 3;
// 		return n;
// 	}

// 	private static boolean length(String str) 
// 	{
// 		return (str.length()== len);
// 	}

// 	public static void main(String[] args) 
// 	{
// 		System.out.println("Welcome to this fun game");
// 		System.out.println("You will be asked to write a palindrome between 3 to 5 letters. Whoever scores 5 points first will win. Good luck!");

// 		Scanner player = new Scanner(System.in);

// 		System.out.println("Player 1, please enter your name:");
// 		String player1 = player.next();
// 		System.out.print("\n");

// 		System.out.println("Player 2, please enter your name:");
// 		String player2 = player.next();
// 		System.out.print("\n");


// 		while(score1 < 5 && score2 < 5) //if score of both the players is less than 5
// 		{
// 			if((counter%2) == 0) //players 2's turn
// 			{
// 				System.out.println(player2+"'s turn." + "\n"); 
// 			}

// 			else
// 				System.out.println(player1+"'s turn." + "\n"); //players 1's turn

// 			promptEnterKey();
// 			len = random(); //generate a random word by calling random() function
// 			System.out.println("You have to make a palindrome of " + len + " letters. Please enter your word");

// 			Scanner word = new Scanner(System.in);
// 			String str= word.next(); //to scan a word

// 			if(length(str))
// 			{
// 				Palindrome pal = new Palindrome(str);

// 				if(pal.palin) //if the word entered was a palindrome
// 				{
// 					if((counter%2) == 0) //if it was players 2's turn 
// 					{
// 						score2++;
// 					}

// 					else
// 						score1++;
// 				}
// 			}

// 			else
// 				System.out.println("The word you entered was not of " + len + " letters" );

// 			counter++; //to change the turn to next player

// 			System.out.println("The current score is ....");
// 			System.out.println(player1 + " has " + score1 + " points");
// 			System.out.println(player2 + " has " + score2 + " points" + "\n");
// 			promptEnterKey();
// 		}

// 		String winner = score1 > score2 ? player1 : player2;
// 		System.out.println("The winner is: " + winner);
// 	}


// }

package nello;
import java.util.Scanner;
import java.util.Random;

public class game {

	static int score1 = 0;
	static int score2 = 0;
	static int counter = 1;
	static int len; //gets length of word
	public static void promptEnterKey() //enter kry
	{
		System.out.println("(Press \"ENTER\" to continue...)");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}

	public static int random() //getting a random number between 3 and 5
	{
		Random rand = new Random();
		int n = rand.nextInt(3) + 3;
		return n;
	}

	private static boolean length(String str) 
	{
		return (str.length()== len);
	}

	public static void main(String[] args) 
	{
		System.out.println("Welcome to this fun game");
		System.out.println("You will be asked to write a palindrome between 3 to 5 letters. Whoever scores 5 points first will win. Good luck!");

		Scanner player = new Scanner(System.in);

		System.out.println("Player 1, please enter your name:");
		String player1 = player.next();
		System.out.print("\n");

		System.out.println("Player 2, please enter your name:");
		String player2 = player.next();
		System.out.print("\n");


		while(score1 < 5 && score2 < 5) //if score of both the players is less than 5
		{
			if((counter%2) == 0) //players 2's turn
			{
				System.out.println(player2+"'s turn." + "\n"); 
			}

			else
				System.out.println(player1+"'s turn." + "\n"); //players 1's turn

			promptEnterKey();
			len = random(); //generate a random word by calling random() function
			System.out.println("You have to make a palindrome of " + len + " letters. Please enter your word");

			Scanner word = new Scanner(System.in);
			String str= word.next(); //to scan a word

			if(length(str))
			{
				Palindrome pal = new Palindrome(str);

				if(pal.palin) //if the word entered was a palindrome
				{
					if((counter%2) == 0) //if it was players 2's turn 
					{
						score2++;
					}

					else
						score1++;
				}
			}

			else
				System.out.println("The word you entered was not of " + len + " letters" );

			counter++; //to change the turn to next player

			System.out.println("The current score is ....");
			System.out.println(player1 + " has " + score1 + " points");
			System.out.println(player2 + " has " + score2 + " points" + "\n");
			promptEnterKey();
		}

		String winner = score1 > score2 ? player1 : player2;
		System.out.println("The winner is: " + winner);
	}


}

