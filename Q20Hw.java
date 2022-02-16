package String;
//20) Write a program to find Length of the longest substring without repeating characters.
import java.util.Arrays;
public class Q20Hw {
	public static void main(String []arg)
	{
		String s="abcdbxtuvabc";
		int start=0;
		int max=0;
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = i+1; j < s.length(); j++)
			{
				int count=0;
				for (int k = i; k < j-1; k++)
				{
					if(s.charAt(j)==s.charAt(k))
						count++;	
				}
				if(count>0)
				{
					int lengthOfSubstring=j-i; // Inclusive and Exclusive
					if(lengthOfSubstring>max)
					{
						max=lengthOfSubstring;
						start=i;
					}
					break;
				}
				if(j==s.length()-1)
				{
					int lenghthOfSubstring=j-i+1;
					if(lenghthOfSubstring>max)
					{
						max=lenghthOfSubstring;
						start=i;
					}
				}
			}
		}
		System.out.println(max);
		for (int i = start; i < start+max; i++)
		{
			System.out.print(s.charAt(i)+" ");
		}
	}
}
