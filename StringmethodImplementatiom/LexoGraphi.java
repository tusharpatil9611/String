package StringmethodImplementatiom;

public class LexoGraphi {

	public static void main(String[] args) 
	{
		String s="abcde";
		String s1="abcdme";
		int count=0;
		for (int i = 0; i <s.length() && i< s1.length(); i++)
		{
			if(s.charAt(i)!=s1.charAt(i))
			{
				count++;
				System.out.println(s.charAt(i)-s1.charAt(i));
				break;
			}
		}
		if(count==0)
			System.out.println(s.length()-s1.length());
	}

}
