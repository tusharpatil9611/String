package String;

public class StringReversing {

	public static void main(String[] args) 
	{
		String s="You Are Very Good ";
		String [] Sa=s.split(" ");
		for (int i = 0; i < Sa.length; i++)
		{
			String s2= Sa[i];
			char [] ca=s2.toCharArray();			//Create a arrays of String.
			int p=0;
			int q=ca.length-1;
			while(q>p)
			{
				char c=ca[p];
			    ca[p]=ca[q];
			    ca[q]=c;
				p++;
				q--;
			}
			String s3=new String(ca);
			Sa[i]=s3;
		}
		for (int i = 0; i < Sa.length; i++)
		{
			System.out.print(Sa[i]+" ");
		}
	}

}
