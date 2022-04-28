package week2.day1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//declare a string
		String text1="stops";
		//Declare another string
		String text2="potss";
		// Check length of the strings are same then (Use A Condition)
		if(text1.length()==text2.length())
		{
			//Convert both Strings in to characters
			char[]arr1=text1.toCharArray();
			char[]arr2=text2.toCharArray();
			//Sort Both the arrays
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			//Check both the arrays has same value
			boolean text = Arrays.equals(arr1, arr2);
			System.out.println("This is Anagram");
		}
		
		else
		{
			System.out.println("This is not anagaram");
		}
		
	}
	
	

}
