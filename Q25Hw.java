package String;
// Write a program to repeat each of the character twice in a given string.

public class Q25Hw {

	public static void main(String[] args) 
	{
		String s="abc";
		String s1="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			s1=s1+s.charAt(i)+s.charAt(i);
		}
		System.out.println(s1);		
	}

}
