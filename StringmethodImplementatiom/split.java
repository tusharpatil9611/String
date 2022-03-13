package StringmethodImplementatiom;

public class split {

	public static void main(String[] args)
	{
		String s="abc xyz wxy pqr";
		//s1="Empty string"
		//saIndex=to store count;
		int spaceCount=0;
		for (int i = 0; i <s.length(); i++) 
		{
			if(s.charAt(i)==' ')
				spaceCount++;
		}
		String []sa=new String[spaceCount+1];	//create new String Array.
		int saIndex=0;
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)==' ')
			{
				sa[saIndex++]=s1;		//if Space then add String int the Array.
				//saIndex++;
				s1="";
			}
			else
			{
				s1=s1+s.charAt(i);
			}
			if(i==s.length()-1)
				sa[saIndex]=s1;
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.println(sa[i]);
		}
		
	}

}
