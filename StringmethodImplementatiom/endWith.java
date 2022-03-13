package StringmethodImplementatiom;

public class endWith 
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="de";
		System.out.println(s1.endsWith(s2));
		
		if(s2.length()<s1.length())
		{	//digitCOunt=0;
			int i=s1.length()-1;
			int j=s2.length()-1;
			while(j>=0)					//Reverse check
			{
				if(s1.charAt(i)!=s2.charAt(j))
					//digitCount++;
					break;
				i--;
				j--;
			}
			if(j>=0)	//(digitCount>0)
				System.out.println(false);
			else
				System.out.println(true);
		}
		else
			System.out.println(false);
	}
}
