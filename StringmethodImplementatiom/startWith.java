package StringmethodImplementatiom;
//Write a program to check whether a given string starts with the contents of another string.
public class startWith {

	public static void main(String[] args) 
	{
		String s1="abcacb";
		String s2="ab";
		System.out.println(s1.startsWith(s2));
		if(s2.length()<=s1.length())
		{
			int digitCount=0;
			for (int i = 0; i < s2.length(); i++) 
			{
			 if(s2.charAt(i)!=s1.charAt(i))
			  {
				 digitCount++;
				 break;
			  }
			 
			}
			if(digitCount>0)
				 System.out.println(false);
			 else
				 System.out.println(true);
		}
		else
			System.out.println(false);
		
	}
}
