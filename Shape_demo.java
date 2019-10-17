abstract class Shape{
int a=0;
int b=0;
abstract  void printarea();
}
class Rectangle extends Shape
{
	int length=10,breadth=20;
	void printarea()
	{
	
		int area=length*breadth;
		System.out.println("area of rectangle is:"+area);
	}
}
class Triangle extends Shape
{
	int base=70,height=50;
	void printarea()
	{
	
		double area=(0.5)*(base*height);
		System.out.println("area of triangle is:"+area);
	}
}
class Circle extends Shape
{
	int r=10;
	void printarea()
	{
	
		double area=3.14*(r*r);
		System.out.println("area of circle is:"+area);
	}
}
class Shape_demo
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.printarea();
		Triangle t=new Triangle();
		t.printarea();
		Circle c=new Circle();
		c.printarea();
	}
}
