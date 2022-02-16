
package String;

public class Myfirst {

	public static void main(String[] args) 
	{
		String s="patil Tushar";
		String []sp= s.split(" ");
		char[]ar=s.toCharArray();
		char s1=s.charAt(3);
		System.out.println(s.compareTo("sl"));
		System.out.println(s.codePointAt(0));
		System.out.println(s.compareTo("pat"));
		System.out.println(s.compareToIgnoreCase("Patil"));
		System.out.println(s.concat(" Rajendra"));
		System.out.println(s.contains("t"));
		System.out.println(s.endsWith("il"));
		System.out.println(s.startsWith("p"));
		System.out.println(s.equals("patil"));
		System.out.println(s.indexOf("l"));
//		System.out.println(s.lastIndexOf("r"));
//		System.out.println(s.length());
//		System.out.println(s.replace("p", "P"));
		System.out.println(s.substring(2,9));
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s.trim());
//		for (int i = 0; i < sp.length; i++) 
//		{
//			System.out.println("Array Split "+sp[i]);
//		}
//		for (int i = 0; i < ar.length; i++)
//		{
//			System.out.print(ar[i]+" ");
//		}
//		System.out.println();
//		System.out.println(s.toCharArray());
	}

}
