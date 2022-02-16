package String;

public class RemoveSpaces {

	public static void main(String[] args) 
	{
		String s="  tu  s  ar  ";
		s=s.trim();
		String s1="";
		for (int i = 0; i <s.length(); i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
			{}
			else
				s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}

}
