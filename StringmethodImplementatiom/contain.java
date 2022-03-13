package StringmethodImplementatiom;
		//Write a program to compare a given string to the specified character sequence.
public class contain {
			//COntain Method.
	public static void main(String[] args) 
	{
		String s1="abcdef";
		String s2="cj";
		System.out.println(s1.contains(s2));
		if(s2.length()<=s1.length())
		{
			int i=0;
			for (; i < s1.length()-s2.length()+1; i++)
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					//String subString=s1.substring(i, i+s2.length());
					String subString="";
					for (int j = i; j <i+s2.length(); j++)
					{
						subString=subString+s1.charAt(j);
					}
					if(subString.equals(s2))
					{
						System.out.println(true);
						break;
					}
				}
				
			}
			if(i==s1.length()-s2.length()+1)
				System.out.println(false);
		}
		else
			System.out.println(false);
	}

}
