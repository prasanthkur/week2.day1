package week2.day1;

public class CharacterOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Welcome to chennai";
		// declare and initialize a variable count to store the number of occurrences
		int count=0;
		// convert the string into char array
		char[] arr=str.toCharArray();
		//get the length of the array
		int len=arr.length;
		// traverse from 0 till the array length 
		for(int i=0;i<len;i++)
		{
			// Check the char array has the particular char in it 
			if(str.charAt(i)=='e')
				// if is has increment the count
				count=count+1;
			
		}
		System.out.println(count);
	}

}
