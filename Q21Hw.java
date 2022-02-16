package String;

public class Q21Hw {		//Same as Q24.
		
	public static void main(String[] args)
	{
	String s="aaabbbbccccccddd";
	String unique="";
	int max=Integer.MIN_VALUE;
	int max2=Integer.MIN_VALUE;
	int min=Integer.MAX_VALUE;
	
	for (int i = 0; i <s.length(); i++)
	{
		int count=0;
		for (int j = i+1; j <s.length(); j++) 
		{
			if(s.charAt(i)==s.charAt(j))
				count++;
		}
		if(count==0)
		{
			unique=unique+s.charAt(i);
		}
	}
	//System.out.println(unique);
	int []ia=new int[unique.length()];
	int index=0;
	for (int i = 0; i < ia.length; i++)
	{
		int count=0;
		for (int j = 0; j < s.length(); j++) 
		{
			if(unique.charAt(i)==s.charAt(j))
			{
				count++;
			}
		}
		ia[index++]=count;
		//System.out.println(count);
	}
	
	char []ca=unique.toCharArray();
	for (int i = 0; i < ia.length; i++)
	{
		for (int j = i+1; j < ia.length; j++) 
		{
			if(ia[i]<ia[j])
			{
				int temp=ia[i];
				ia[i]=ia[j];
				ia[j]=temp;
				
				char tempChar=ca[i];
				ca[i]=ca[j];
				ca[j]=tempChar;
				
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
	System.out.println();
	for (int i = 0; i < ia.length; i++)
	{
		if(ia[i]>max)
			max=ia[i];
		if(ia[i]!=max && ia[i]>max2)
		{
			max2=ia[i];
		}
	}
	System.out.println(max);
	System.out.println("Second Most Frequent Character "+max2);
	
	}

}
