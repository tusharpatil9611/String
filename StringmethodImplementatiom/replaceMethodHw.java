package StringmethodImplementatiom;

public class replaceMethodHw {

	public static void main(String[] args) 
	{
		String s="nljnjhjhh";
		String []sa=s.split("jh");
		String s1="";
		for (int i = 0; i < sa.length; i++)
		{
			if(i==sa.length-1)
				s1=s1+sa[i];
			else
				s1=s1+sa[i]+"AB";
		}
		for (int i = 0; i < s1.length(); i++)
		{
			System.out.print(s1.charAt(i));
		}
	}

}
