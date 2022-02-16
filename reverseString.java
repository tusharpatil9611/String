package String;

public class reverseString {

	public static void main(String[] args)
	{
		String s="Name is a Tushar ";
		String[] re=s.split(" ");
		for (int i = re.length-1; i >= 0; i--)
		{
			System.out.print(re[i]+" ");
		}
	}

}
