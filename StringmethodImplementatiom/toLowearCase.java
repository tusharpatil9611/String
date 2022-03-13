package StringmethodImplementatiom;

public class toLowearCase {

	public static void main(String[] args)
	{
		String s="ABcDEfghIKj";
		char []sa=s.toCharArray();
		for (int i = 0; i < sa.length; i++)
		{
			if(s.charAt(i)<'Z')
				sa[i]=(char)(s.charAt(i)+32);
			else
				sa[i]=s.charAt(i);
		}
		System.out.println(sa);
	}

}
