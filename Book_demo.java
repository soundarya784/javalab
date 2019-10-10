import java.util.*;
class Book
{
	String name;
	String author;
	double price;
	int num_pages;
	
	/*void set(String name,String author,double price,int num_pages)
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.num_pages=num_pages;
	}*/
	void get()
	{
		/*String Book_name;
		String Book_author;
		double Book_price;
		int Book_pages;*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		name=sc.next();
		System.out.println("enter the author_name");
		author=sc.next();
		System.out.println("enter the price");
		price=sc.nextDouble();
		System.out.println("enter the number of pages");
		num_pages=sc.nextInt();
		//set(Book_name,Book_author,Book_price,Book_pages);
	}
	Book()
	{
	}
	void string1()
	{
		System.out.println("name: "+name+"\nauthor "+author+"\nprice: "+price+"\n num of pages "+num_pages);
	}
}
class Book_demo
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of books");
		n=sc.nextInt();
		Book b[]=new Book[n];
		for(int i=0;i<n;i++)
		{
			b[i]=new Book();
			b[i].get();
			
			//b[i].string1();
			
		}
		for(int i=1;i<=n;i++)
		{
			System.out.println("details of book:"+i);
			b[i].string1();
			
		}
	
	}
}