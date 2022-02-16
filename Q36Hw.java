package String;
		// Find length of string without using length and tocharArray methods.
import java.io.IOException;
import java.io.StringReader;

public class Q36Hw {
	public static void main(String []args) throws IOException
	{
		String s="abscef";
		String s1="";
		int i=0;
		int count=0;
		try{
		while(true)
		{
			s1=s1+s.charAt(i);
			count++;
			i++;
		}
		}
		catch(Exception e)
		{
			System.out.println(count);
		}
		
		
//		StringReader reader=new StringReader(s);
//		int cont=0;
//		while(reader.read()!=-1)
//		{
//			cont++;
//		}
//			System.out.println(cont);
	}
		
	
}
