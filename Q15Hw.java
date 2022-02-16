package String;
//Write a program to return the sum of the digits present in the given string.If there is no digits the 
//sum return is 0.
public class Q15Hw {

	public static void main(String[] args) 
	{
		String s="123456As";
		int sum=0;
		for (int i = 0; i <s.length(); i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				sum=sum+s.charAt(i)-48;	//Diff of ascii
			}
		}
		System.out.println(sum);
	}
}
