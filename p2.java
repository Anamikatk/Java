class product
{
	String name,code;
	double price;
	product(String pname,String pcode,double pprice)
	{
		this.name=name;
		this.code=code;
		this.price=price;
	}
}
class p2
{
	public static void main(String[] args)
	{
		product p1=new product("Chocolate","PC01",50.00);
		product p2=new product("Notebook","PC02",32.00);
		product p3=new product("Parker Pen","PC03",500.00);
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
