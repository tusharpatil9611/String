package String;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) 
	{
		char []ch={'a','b','c','d','e','f','g'};
		String s= new String(ch);
		System.out.println(s);
		String s1="HefShine";
		char [] ch1= s1.toCharArray();
		for (int i = 0; i < ch1.length; i++) 
		{
			System.out.print(ch1[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(ch1));
	}

}
