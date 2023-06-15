import java.util.Scanner;
public class p9i
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str= s.nextLine();

		//UpperCase and LowerCase
		String u=str.toUpperCase();
		String l=str.toLowerCase();
		System.out.println("Upper Case : "+u);
		System.out.println("LowerCase : "+l);

		//Replace
		System.out.println("Enter a string : ");
		String str1=s.nextLine();
		System.out.println("Enter the string to be replaced : ");
		String x=s.nextLine();
		System.out.println("Enter the string ");
		String y=s.nextLine();
		String s1=str1.replace(x,y);
		System.out.println("Replace : "+s1);

		//Trim
		System.out.println("Enter a string : ");
		String str2=s.nextLine();
		String s2=str2.trim();
		System.out.println("trimmed string is :"+s2);


		//Equal or not
		System.out.println("Enter 1st string : ");
		String str1=s.nextLine();
		System.out.println("Enter 2nd string : ");
		String str2=s.nextLine();
		if(str2.equals(str1))
			System.out.println("Two strings are equal.");
		else
			System.out.println("Two strings are not equal.");



		//Equals Ignore 
		System.out.println("Enter 1st string : ");
		String str1=s.nextLine();
		System.out.println("Enter 2nd string : ");
		String str2=s.nextLine();
		if(str2.equalsIgnoreCase(str1))
			System.out.println("Two strings are equal while ignoring the case.");
		else
			System.out.println("Two strings are not equal even after ignoring the case.");



		//Length of the string
		System.out.println("Enter the string : ");
		String str=s.nextLine();
		int len=str.length();
		System.out.println("Length of the string : "+len);




		//Compare
		System.out.println("Enter 1st string : ");
		String str1=s.nextLine();
		System.out.println("Enter 2nd string : ");
		String str2=s.nextLine();
		if(str1.compareTo(str2)<0)
			System.out.println("String 1 is less than string 2.");
		else if(str1.compareTo(str2)>0)
			System.out.println("String 1 is greater than string 2");
		else
			System.out.println("String 1 and string 2 are equal.");





		//Concatenation
		System.out.println("Enter 1st string : ");
		String str1=s.nextLine();
		System.out.println("Enter 2nd string : ");
		String str2=s.nextLine();
		str1=str1.concat(str2);
		System.out.println("String after concatenation : "+str1);
	


		//substring - to get the sub string starting from the mentioned index
		System.out.println("Enter a string : ");
		String str1=s.nextLine();
		System.out.println("Enter the index : ");
		int n=s.nextInt();		
		str1=str1.substring(n);
		System.out.println("Sub-string from "+n+" to the end : "+str1);




		//substring - to get the sub string starting from the mentioned index
		System.out.println("Enter a string : ");
		String str1=s.nextLine();
		System.out.println("Enter the starting index : ");
		int n=s.nextInt();
		System.out.println("Enter the ending index : ");
		int m=s.nextInt();
		str1=str1.substring(n,m);
		System.out.println("Sub-string from "+n+" to the "+m+" : "+str1);




		//to get the position of first occurence of a character 
		System.out.println("Enter a string : ");
		String str1=s.nextLine();
		System.out.println("Enter the character : ");
		String c=s.nextLine();
		int i=str1.indexOf(c);
		System.out.println("Position of first occurence of the character "+c+" is at : "+(i+1));




		//to get the position of the character that occurs after N-th position in the string
		System.out.println("Enter a string : ");
		String str1=s.nextLine();
		System.out.println("Enter the character : ");
		String c=s.nextLine();
		System.out.println("Enter the position : ");
		int n=s.nextInt();		
		int i=str1.indexOf(c,n);
		System.out.println("Position of the character "+c+" that occurs after "+n+"-th position in the string is : "+(i));




		//charAt - gives the n-th character 
		System.out.println("Enter a string : ");
		String str=s.nextLine();
		System.out.println("Enter the n : ");
		int n=s.nextInt();
		char s1=str.charAt(n);
		System.out.println("The character at "+n+" is : "+s1);



	}
}
