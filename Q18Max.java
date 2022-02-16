package String;
//18) Write a program to find the maximum occurring character in a string.

public class Q18Max {

	public static void main(String[] args)
	{
		String s="aaabbbbbcccc";
		String unique="";
//		int max=Integer.MIN_VALUE;
//		int max2=Integer.MIN_VALUE;
//		int min=Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++)
		{
			int sameCharCount=0;
			for (int j =0; j < i; j++) 			//condition j<i 
			{
				if(s.charAt(i)==s.charAt(j))
				{
				sameCharCount++;
				break;
				}
			}
			if(sameCharCount==0)
				unique=unique+s.charAt(i);
		}
		//System.out.println(unique);
		int [] ia=new int [unique.length()];	//create new arrays.
		int iaIndex=0;
		for (int i = 0; i < unique.length(); i++)
		{
			int count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(unique.charAt(i)==s.charAt(j))		//here is compare unique string  with main string .
					count++;
			}
			ia[iaIndex++]=count;
			System.out.print(ia[i]+" ");
		}
		char[]ca=unique.toCharArray();			//create new array to convert unique String char arrays.
		for (int i = 0; i < ia.length; i++)
		{
			for (int j = i+1; j < ia.length; j++)
			{
				if(ia[i]<ia[j])
				{
					int temp=ia[i];			//Swapping on the Basic of count. 
					ia[i]=ia[j];
					ia[j]=temp;
					char tempchar=ca[i];		//Swapping on the basic of char.
					ca[i]=ca[j];
					ca[j]=tempchar;
					
				}
			}
		}
		for (int i = 0; i < ca.length; i++)
		{
			System.out.print(ca[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < ia.length; i++)
		{
			System.out.print(ia[i]+" ");
		}
	}

}
