package String;

import java.util.Arrays;

public class Q13hw {

	public static void main(String[] args)
	{
		String s="Tushar";
		String s1="";
		char rev='s';
		for (int i = 0; i <s.length(); i++) 
		{
			if(s.charAt(i)!=rev)
				s1=s1+s.charAt(i);
//			else
//				s1=s1+'R';
		}
		
		System.out.println(s1);
		
		
		
		String a="tusharR";
		char remov='R';
		String b="";
		for (int i = 0; i <a.length(); i++)
		{
			if(a.charAt(i)!=remov)
				b=b+a.charAt(i);
		}
		System.out.println(b);
		
	}

}
