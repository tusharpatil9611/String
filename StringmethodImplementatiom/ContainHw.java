package StringmethodImplementatiom;
		//It can be use to compare a string with given subString.
public class ContainHw {

	public static void main(String[] args)
	{
		String s="Adadj";
		String s1="Ady";
		System.out.println(s.contains(s1));
		if(s1.length()<s.length())
		{
			int i = 0;
			for (; i < s.length()-s1.length()+1; i++)
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
						System.out.println(true);
						break;
					}
				}
				
			}
			if(i==s.length()-s1.length()+1)
				System.out.println(false);
			
		}
		else
			System.out.println(false);
		
	}

}
