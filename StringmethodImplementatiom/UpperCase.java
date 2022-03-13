package StringmethodImplementatiom;
// Write a program to convert all the characters in a string to lower case.

public class UpperCase {

	public static void main(String[] args) 
	{
		String s="ajkWBikaaaabbjj";
		//String s1="";
		 char []s2=s.toCharArray();
		 for (int i = 0; i < s.length(); i++)
		 {
			if(s.charAt(i)>'Z')
				s2[i]=(char)(s.charAt(i)-32);//(A-a)= (65-97)=-32;
			else
				s2[i]=s.charAt(i);
			
		}
		// s1=new String(s2);
		 System.out.println(s2);
		 
		
		 
		 
		 
	}

}
