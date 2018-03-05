package Javatests;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="madam";
				
		String M="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
		
		M=M+s.charAt(i);
		
	}
	
		if (s.equals(M))
		{
			
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}

	}
}
