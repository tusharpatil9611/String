package StringmethodImplementatiom;

public class CompareToIgnore {

	public static void main(String[] args) 
	{

		String s="abcfrffrf";
		String s1="abcjjd";
		String s2="";
		for (int i = 0; i < s.length(); i++) 
		{
		  if(s.charAt(i)>='A' &&s.charAt(i)<='Z')
			  s2=s2+((char)(s.charAt(i)+32));
		  else
			  s2=s2+s.charAt(i);
		}
	//	System.out.println(s2);
		System.out.println(s2.compareToIgnoreCase(s1));
		int i = 0;
		for (; i < s2.length() && i<s1.length(); i++) 
		{
			if(s2.charAt(i)!=s1.charAt(i))
			{
				System.out.println(s2.charAt(i)-s1.charAt(i));
				
				
				break;
			}
		}
		if(i==s2.length() || i==s1.length())
		{
			System.out.println(s2.length()-s1.length());
		}
			
	}

}
