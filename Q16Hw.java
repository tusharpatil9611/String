package String;

public class Q16Hw {

	public static void main(String[] args) 
	{
		String s="BBbtterr";
		String s1="";
		int count=0;
	for (int i = 0; i <s.length(); i++)
	 {
		for (int j = i+1; j <s.length(); j++) 
		{
			if(s.charAt(i)==s.charAt(j))
			{
			   count++;
			   s1=s1+s.charAt(i);
			   break;
			}
		}
	 }
	      System.out.println(s1);
	      System.out.println(count);
	}
}
