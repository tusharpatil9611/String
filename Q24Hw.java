package String;
// Write a program to get lowest frequency of a character in a string.
import java.util.Arrays;
public class Q24Hw {

	public static void main(String[] args) 
	{
		String s="aaabbbbjjjjjklljkh";
		String unique="";
		for (int i = 0; i < s.length(); i++) 
		{
			int count=0;
			for (int j = i+1; j <s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			unique=unique+s.charAt(i);
		}
		System.out.println(unique);
		int []a=new int [unique.length()];
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{
			int count=0;
			for (int j = 0; j < s.length(); j++)
			{
				if(unique.charAt(i)==s.charAt(j))
					count++;
			}
			a[index++]=count;
		}
		char []ca=unique.toCharArray();
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					char tempC=ca[i];
					ca[i]=ca[j];
					ca[j]=tempC;
				}
			}
		}
		for (int i = 0; i < ca.length; i++) 
		{
			System.out.print(ca[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < unique.length(); i++)
		{
			System.out.print(a[i]+" ");
		}
		

		
		
	}

}
