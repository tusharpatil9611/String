package String;
// Write a program to print after removing duplicates from a given string.

public class Q19Hw {

	public static void main(String[] args)
	{
		String s="aabbcceeeee";
		String unique="";
		for (int i = 0; i < s.length(); i++)
		{
			int count=0;
			for (int j = i+1; j < s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
					count++;
			}
			if(count==0)
				unique=unique+s.charAt(i);
		}
		System.out.println(unique);
	}

}
