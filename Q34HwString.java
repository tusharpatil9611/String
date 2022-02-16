package String;

public class Q34HwString {

	public static void main(String[] args) 
	{
		String s="Hello Friend My Name is Tushar Rajendra Patil";
		String []sa=s.split(" ");
		int max=Integer.MIN_VALUE;
		int  min=Integer.MAX_VALUE;
		int index=0;
		int index1=0;
		for (int i = 0; i < sa.length; i++)
		{
			for (int j = i+1; j < sa.length; j++)
			{
				if(sa[i].length()>max)
				{
					max=sa[i].length();
				    index=i;
				}
				if(sa[i].length()<min)
				{
					min=sa[i].length();
					index1=i;
				}
			}
		}
		System.out.println(sa[index]+" "+max);
		System.out.println(sa[index1]+" "+min);
	}

}
