package String;

public class Q4Cw {

	public static void main(String[] args) 
	{
		String s="tushar";	//ignore case difference 
		int s1=s.compareToIgnoreCase("TusHar");
		System.out.println(s1);
		
		
		
		String a="Rakesh";
		String b="RAKESH";
		System.out.println(a.compareToIgnoreCase(b));
	}

}
