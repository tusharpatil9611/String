package String;

public class ReverseStringWay2 {

	public static void main(String[] args)
	{
		String s="Tushar Rajendra Patil";
		String [] sa=s.split(" ");
		int i=0;
		int j=sa.length-1;
		while(j>i)
		{
			String temp = sa[j];
			sa[j] =sa[i];
			sa[i]=temp;
			i++;
			j--;		
		}
		//String s1=new String(sa);
		for (int j2 = 0; j2 < sa.length; j2++) 
		{
			System.out.print(sa[j2]+" ");
		}
	}

}
