package String;

import java.util.Arrays;

public class Q1Hw {

	public static void main(String[] args) 
	{
		//Convert String to char Arrays.
		String s="Tushar";
		char[]ca=s.toCharArray();
		for (int i = 0; i < ca.length; i++)
		{
			System.out.print(ca[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(ca));
		
		
		String a="Rakesh";
		char []ch=a.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			System.out.print(ch[i]+" ");
		}
	}

}
