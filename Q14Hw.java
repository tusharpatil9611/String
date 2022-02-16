package String;
	// Write a program to test if a given string contains only digits

public class Q14Hw {

	public static void main(String[] args) 
	{
		String s="12 aa1345";
		int count=0;		//boolean onlyDigit=false;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{}
			else
				count++;		//onlyDigit=false;
		}
		if(count==0)
			System.out.println("only Digit");
		else
			System.out.println("Not only Digit");
		
		
	}

}
