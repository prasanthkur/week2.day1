package week2.day1;



public class Paliendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str= "123";
		int len=str.length();
		 String strrev="";
		for(int i=len-1;i>=0;i--)
		{
			
			strrev=strrev + str.charAt(i);
			
		}
		
		
	if(str.equalsIgnoreCase(strrev))
	{
			System.out.println("String is paliendrome");
	}
	else
		System.out.println("String is not a paliendrome");
	}
	

}
