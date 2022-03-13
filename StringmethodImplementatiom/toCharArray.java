package StringmethodImplementatiom;

import java.util.Arrays;

public class toCharArray {

	public static void main(String[] args) 
	{
		String s="absc";
		char []sa=new char[s.length()];
		for (int i = 0; i < s.length(); i++)
		{
			sa[i]=s.charAt(i);
		}
		for (int i = 0; i < sa.length; i++)
		{
			System.out.print(sa[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(sa));
	}

}
