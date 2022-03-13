package StringmethodImplementatiom;
// Write a program to get the index of all the characters of thealphabet.

public class indexOf {

	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="cd";
		if(s2.length()<s1.length())
		{
			int i=0;
			for (; i < s1.length()-s2.length()+1; i++)
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					String subString="";
					for (int j = i; j < i+s2.length(); j++) // always start to carry substring from i. 
					{
						subString=subString+s1.charAt(j);
					}
					if(subString.equals(s2))
					{
						System.out.println(i);
						break;
					}
				}
			}
			if(i==s1.length()-s2.length()+1)
				System.out.println("-1");
		}
		else
		System.out.println("-1");
				
	}

}
