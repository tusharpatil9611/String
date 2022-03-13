package StringmethodImplementatiom;
//Write a program to replace all the 'd' characters with 'f'characters
public class replaceMethod {

	public static void main(String[] args) 
	{
		String s="abcjdhhekksdhhkl";
		String []sa=s.split("hh");
		String s1="";
		for (int i = 0; i < sa.length; i++)
		{
			if(i==sa.length-1)
			{
				s1=s1+sa[i];
			}
			else
				s1=s1+sa[i]+"qr";
		}
		for (int i = 0; i < s1.length(); i++)
		{
			System.out.print(s1.charAt(i));
		}
		
	}

}
