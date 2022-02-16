package String;
import java.util.*;
public class Hello {
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Stirng");
			String name=sc.next();
			for(int i=name.length()-1;i>=0;i--)
			{
				System.out.print(name.charAt(i));
			}
		}

	}

