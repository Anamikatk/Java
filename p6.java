import java.util.*;
class CPU
{
	double price;
	CPU(double price)
	{
		this.price=price;
	}

	class processor
	{
		int no;
		String manuf;
		processor(int n,String m){
			no=n;
			manuf=m;
		}
	}
	static class RAM
	{
		int my;
		String m;
		RAM(int my,String m){
			this.my=my;
			this.m=m;
		}
	}
}

public class p6
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter CPU Price : ");
		CPU cpu=new CPU(in.nextDouble());
		System.out.println("Enter number of Cores, CPU Manufacturer : ");
		CPU.processor p = cpu.new processor(in.nextInt(),in.next());
		System.out.println("Enter RAM Size, Manufacturer : ");
		CPU.RAM ram =new CPU.RAM(in.nextInt(),in.next());
		System.out.println("------CPU DETAILS-----");
		System.out.println("\tPrice : "+cpu.price);
		System.out.println("\tCPU Cores : "+p.no);
		System.out.println("\tCPU Manufacturer : "+p.manuf);
		System.out.println("\tRAM Size : "+ram.my);
		System.out.println("\tRAM Manufacturer : "+ram.m);
		
	}
}
		
