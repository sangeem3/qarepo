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
		System.out.println(M);
		if (s.equals(M))
		{
			System.out.println("Given string is Palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}

	}
}