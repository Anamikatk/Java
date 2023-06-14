import java.util.Scanner;
class Complex 
{
	int real, img;
	public void read() 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter real and imaginary parts : ");
		real = in.nextInt();
		img = in.nextInt();
	}
}	

public class p5
{
	public static void main(String[] args) 
	{
		Complex a, b, c;
		a = new Complex();
		b = new Complex();
		c = new Complex();		
		a.read();
		b.read();
		c.real = a.real + b.real;
		c.img = a.img + b.img;
		System.out.println("Sum : " + c.real + "+" + c.img + "i");

	}
}
