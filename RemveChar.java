package String;
	//13) Write a program to remove a specified character from a given string.

public class RemveChar {

	public static void main(String[] args) 
	{
		String s="atusghar";
		String s1 ="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)!='g')
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s);
		System.out.println(s1);

	}

}
