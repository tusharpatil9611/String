package String;

public class ReverseEveryWord {
	static int sum=0;
	static int count=0;
	public static void main(String[] args) 
	{
		String s="mam can ban san dan";
		String sa[]=s.split(" ");
		for (int i = 0; i < sa.length; i++) 
		{
			String s1=sa[i];
			for (int j = sa.length-1; j >=0; j--) 
			{
				System.out.println(s1.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
