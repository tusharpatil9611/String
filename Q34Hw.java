package String;
// Write the program to find Largest And Smallest Word form the String arrays.  
public class Q34Hw {

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
		if(i==0)
		System.out.println("Min String = "+s[i]);
		
		if(i==s.length-1)
		{
			System.out.println("Max String = "+s[i]);
		}
	}
		
	}

}
