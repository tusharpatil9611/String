package StringmethodImplementatiom;

public class lastIndexOf2 {
	public static void main(String []arg)
	{
		String s1="nnajjsdabcv";
		String s2="abc";
		int index=-1;
		if(s2.length()<s1.length())
		{
			int i=s1.length()-s2.length();
			for (; i>=0; i--)
			{
				if(s1.charAt(i)==s2.charAt(0))
				{
					String subString="";
					for (int j = i; j <i+s2.length(); j++)
					{
						subString=subString+s1.charAt(j);
					}
					if(subString.equals(s2))
					{
						index=i;
						break;
					}
				}
			}
			System.out.println(index);
		}
		else
			System.out.println("-1");
	}

}
