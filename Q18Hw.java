package String;

public class Q18Hw {

	public static void main(String[] args) 
	{
		String s="aaabbbbcccccdddddd";
		String unique="";
		int max=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++)
		{
			int uniqueCount=0;
			for (int j = 0; j <i; j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					uniqueCount++;
					break;
				}
			}
			if(uniqueCount==0)
				unique=unique+s.charAt(i);
		}
		System.out.println(unique+" ");
		int []ia=new int [unique.length()];
		int index=0;
		for (int i = 0; i < unique.length(); i++)
		{
			int count=0;
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(j)==unique.charAt(i))
				{
					count++;
				}
			}
			ia[index++]=count;
			//System.out.print(ia[i]+" ");
		}
		char []ca=unique.toCharArray();
		for (int i = 0; i < ia.length; i++)
		{
			for (int j = i+1; j < ia.length; j++)
			{
				int temp=ia[i];
				ia[i]=ia[j];
				ia[j]=temp;
				char tempC=ca[i];
				ca[i]=ca[j];
				ca[j]=tempC;
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
				max2=ia[i];	
			if(ia[i]<min)
				min=ia[i];
		}
		System.out.println("Max no "+max);
		System.out.println("Second max "+max2);
		System.out.println("Min is "+min);
		
		
	}

}
