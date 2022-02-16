package String;

public class Q32Hw {   //not done

	public static void main(String[] args) 
	{
		String s="Welcome to Java World";
		System.out.println("Character at 5th Position = ");
		System.out.println(s.charAt(4));
		
		System.out.println("Comparison of two String = ");
		String s1="Welcome";
		System.out.println(s.compareToIgnoreCase(s1));
		
		String s2="Let us Learn";
		System.out.println("Concate of the two Method =");
		System.out.println(s.concat(s2));
		
		System.out.println("First Occurance of a =");
		System.out.println(s.indexOf('a'));
		
		System.out.println("Replace all the elements with e =");
		System.out.println(s.replace('a', 'e'));
		
		System.out.println("Substring between 5th and 10 position =");
		System.out.println(s.substring(5, 10));
	}

}
