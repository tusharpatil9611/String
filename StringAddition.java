package String;

public class StringAddition {

	public static void main(String[] args) 
	{
		String s="5234aa";
		int sum=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum=sum+s.charAt(i)-48;
			}
		}
		System.out.println(sum);
	}

}
