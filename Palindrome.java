package nello;

public class Palindrome 
{
	public boolean palin; //to get state of ispalindrome inside constructor
	
	public Palindrome(String wrd) //single argument constructor will check if the word is palindrome

	{
		boolean ispalindrome = true; //returns true is argument is a palindrome

		Stack st = new Stack();
			char [] arr = wrd.toCharArray();

			for (int j = 0; j < arr.length; j++) 
			{
				st.push(arr[j]); //adding the characters to the array in Stack class
			}


			for (int k = 0; k < st.size/2 ; k++)
			{
				while(ispalindrome && !(st.isEmpty()))
				{
					if(arr[k] != st.pop()) //compares elements of array "arr" with stack "st"
						ispalindrome = false;
					break; //break loop if its not a palindrome
				}

			}

			if(ispalindrome)
			{
				palin = true;
				System.out.println(wrd + " is a palindrome. You have gained a point"); //if palindrome
			}

			else
			{
				palin = false;
				System.out.println(wrd + " is not a palindrome. Better luck next time"); //if not palindrome 
			}
			System.out.print("\n");

		}
	
	
}



