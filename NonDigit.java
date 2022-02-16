package String;

public class NonDigit {

	public static void main(String[] args)
	{
		String s="1235 67";
		int nonDigitCount=0;
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{	}
			else
				nonDigitCount++;
			
		}
		if(nonDigitCount==0)
			System.out.println("Only Digit");
		else
			System.out.println("Not Only Digit");
	}

}
