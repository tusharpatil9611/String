package String;
//Write a program to delete all extra blank spaces in a string by the user.

public class Q27Hw {

	public static void main(String[] args) 
	{
		String s="  Tushar  Patil  ";
		String s1="";
				s=s.trim();
		for (int i = 0; i <s.length(); i++)
		{
			if(s.charAt(i)==' '&& s.charAt(i+1)==' ')
			{}
			else
				s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}

}
