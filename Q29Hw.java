package String;
// Write a program to sort the array of String like dictionary (By Amol Botre April 2021)

public class Q29Hw { //not done

	public static void main(String[] args) 
	{
		String []s={"archi","abhijit","akash","priti","Vaibhav"};
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i+1; j < s.length; j++)
			{
				if(s[i].compareToIgnoreCase(s[j])>0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]+" ");
		}
	}

}
