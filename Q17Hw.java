package String;
// Write a program to reverse every word in a string using methods.

public class Q17Hw {

	public static void main(String[] args)
	{
		String s="You lucky Happy";
		char[]ca=s.toCharArray();
	/*	for (int i = 0; i <s.length(); i++)
		{	
			int p=0;
			int q=s.length()-1;
			while(q>p)
			{
				char	temp=ca[p];
				ca[p]=ca[q];
				ca[q]=temp;
				p++;
				q--;
				
			}
			String s1=new String(ca);
			s=s1;
		}
		
		System.out.println(s);
		*/
		int i=0;
		int j=s.length()-1;
		while(j>i)
		{
			char temp=ca[i];
			ca[i]=ca[j];
			ca[j]=temp;
			i++;
			j--;
		}
		String s1=new String(ca);
		System.out.println(s1);
		
		
		
	}

}
