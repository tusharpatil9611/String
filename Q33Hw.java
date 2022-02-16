package String;
//Write a program to sort numbers in a String. Display the result as aString.
//E.g. if number in String is “43521” result is: “12345”
import java.util.Arrays;

public class Q33Hw {

	public static void main(String[] args)
	{
		String s="435218869";
		char []ca=s.toCharArray();
		for (int i = 0; i < ca.length; i++) 
		{
			for (int j = i+1; j < ca.length; j++)
			{
			if(ca[i]>ca[j])
			 	{
				char temp=ca[i];
				ca[i]=ca[j];
				ca[j]=temp;
			 	}
			}	
			
		}
		for (int i = 0; i < ca.length; i++)
		{
			System.out.print(ca[i]+" ");
		}
	}

}
