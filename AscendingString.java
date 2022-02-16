package String;

public class AscendingString {

	public static void main(String[] args) 
	{
		String []s={"ab","azc","abcde","a","abcdef"};
		
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i+1; j < s.length; j++) 
			{
				if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
				}
			}
		}
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println(s[i]+" ");
		}
	}

}
