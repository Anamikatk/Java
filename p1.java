class product
{
	String name,code;
	double price;
	public void readdata(String pname,String pcode,double pprice)
	{
		name=pname;
		code=pcode;
		price=pprice;
	}
}
class p1
{
	public static void main(String[] args)
	{
		product p1=new product();
		product p2=new product();
		product p3=new product();
		p1.readdata("Chocolate","PC01",50.00);
		p2.readdata("Notebook","PC02",32.00);
		p3.readdata("Parker Pen","PC03",500.00);
		if(p1.price < p2.price)
		{
			if(p1.price < p3.price)
			{
				System.out.println("Lowest price is : "+p1.price);
			}
			else
			{
				System.out.println("Lowest price is : "+p3.price);
			}
		}
		else
		{
			if(p2.price < p3.price)
			{
				System.out.println("Lowest price is : "+p2.price);
			}
			else
			{
				System.out.println("Lowest price is : "+p3.price);
			}
		}
	}
}
