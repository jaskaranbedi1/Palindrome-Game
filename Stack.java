//NOTE : I have created custom stack methods instead of using the built in ones 
package nello;
//
public class Stack {
	int len = 100; //max size of array
	private char [] arg_arr; //to hold the characters
	int size; //for size of the argument

	Stack() //constructor
	{
		arg_arr = new char[len];
		size = 0;
	}

	boolean isEmpty()
	{
		return size == 0;
	}

	void push(char ch) //to add characters in the array
	{
		boolean yes = true;


		for(int i = 0; i < arg_arr.length; i++)
		{
			if(arg_arr[i] == 0)
			{
				if(yes)
				{
					arg_arr[i] = ch;
					size++;
					yes = false;
				}
			}
		}
	}

	char pop() //to remove the last character of the array
	{
		size--;
		return arg_arr[size];
	}
}
