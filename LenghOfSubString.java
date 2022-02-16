package String;

public class LenghOfSubString {

	public static void main(String[] args)
	{
		String s="ababcabcdabcdefg";
		int max=0;
		int start=0;
		for (int i = 0; i <s.length(); i++) 
		{
			for (int j = i+1; j <s.length(); j++)
			{
				int count=0;
				for (int k = i; k <j-1; k++)	//j-1 means is inclusive 
				{
					if(s.charAt(k)==s.charAt(j))
						count++;
				}
				if(count>0)
				{
					int lengthOfSubstring =j-1-i+1;	//length is find by using j & i relationship 
					if(lengthOfSubstring>max)
					{
						max=lengthOfSubstring;
						start=i;
					}
					break;
				}
				if(j==s.length()-1)
				{
					int lengthOfSubstring=j-i+1;
					if(lengthOfSubstring>max)
					{
						max=lengthOfSubstring;
						start=i;
					}
				}
			}
		}
		System.out.println(max);
		for (int i = start; i <start+max; i++) 
		{
			System.out.print(s.charAt(i)+" ");
		}
	}

}
