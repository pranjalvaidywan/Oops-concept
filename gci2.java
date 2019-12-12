interface Shape
{
	public void draw();
	public double getArea();
}
class Circle implements Shape
{ 
	private double radius; 
	public Circle(double r)
	{ 
	this.radius = r; 
	} 
	public void draw()
	{ 
		System.out.println("Drawing Circle"); 
	} 
	public double getArea()
	{ 
		return Math.PI*this.radius*this.radius; 
	} 
	public double getRadius()
	{
		return this.radius; 
	} 
}
public class gci2
{ 
	public static void main (String args[])
	{
		Shape c = new Circle(8);
		c.draw(); 
		System.out.println("Area="+c.getArea());
	}
}