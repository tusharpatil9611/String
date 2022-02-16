package String;
// Write a program to sort in ascending and descending order by length of the given array of strings.

public class Q28Hw {

	public static void main(String[] args)
	{
		String []s={"archi","abhijit","akash","abhi","ankit"};
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
