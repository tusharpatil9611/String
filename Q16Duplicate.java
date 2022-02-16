package String;
//Write a program to count and print all the duplicates in the input string.

public class Q16Duplicate {

	public static void main(String[] args) 
	{
		String s="BBbtterr";
		String dupicaltS= "";
		int count=0;
		for (int i = 0; i < s.length(); i++) 
		{
		 for (int j = i+1; j < s.length(); j++) 
		  {
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
				dupicaltS =dupicaltS+s.charAt(i);
				break;
				
			}
		  }
		}
		 System.out.println(s);
		 System.out.println(dupicaltS);
		 System.out.println("Duplicate count is "+count);

	}

}
