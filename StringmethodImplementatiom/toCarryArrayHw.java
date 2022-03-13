package StringmethodImplementatiom;
//Write a program to check whether a given string starts with the contents of another string.
public abstract class toCarryArrayHw {

	public static void main(String[] args)
	{
		String s="ABCDE";
		char []sa=new char[s.length()];		//new char array.
		for (int i = 0; i < s.length(); i++)
		{
			sa[i]=s.charAt(i);
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.println(sa[i]);
		}
	}

}
