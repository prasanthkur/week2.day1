package week2.day1;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		
		char[]charArray=test.toCharArray();
		for(int i=0;i<charArray.length;i++ )
		{
			if(Character.isLetter(charArray[i]))
			{
				letter=letter+1;
			}
			
			if(Character.isDigit(charArray[i]))
			{
				num=num +1;
				
			}
			if(Character.isSpaceChar(charArray[i]))
			{
				space=space +1;
		}
		
		else
			
			specialChar=specialChar+1;
	}
	System.out.println("letter count is" +letter);
	System.out.println("num count is" +num);
	System.out.println("special count is" +space);
	System.out.println("special character count is" +specialChar);
	
}
}
