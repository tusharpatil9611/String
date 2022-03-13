package StringmethodImplementatiom;

public class lastIndexOf {

	public static void main(String[] args) 
	{
		String s="mndjnbb";
		String s1="bb";
		int index=-1;
		System.out.println(s.lastIndexOf(s1));
		if(s1.length()<s.length())
		{
			int i = 0;
			for (; i <s.length()-s1.length()+1; i++)
			{
	
				if(s.charAt(i)==s1.charAt(0))
				{
					String subString="";
					for (int j = i; j <i+s1.length(); j++)
					{
						subString=subString+s.charAt(j);
					}
					if(subString.equals(s1))
					{
						index=i;
					}
				}
			}
			System.out.println(index);
		}
		else
			System.out.println("-1");
	}

}
