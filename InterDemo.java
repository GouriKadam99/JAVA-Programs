interface Figures
{
	public float PI = 3.14f;
	public float Area(float radius);
	public float Circumferance(float radius);
}

class Circle implements Figures
{
	public float Area(float radius)
	{  return PI * radius * radius;  }
	public float Circumferance(float radius)
	{  return 2 * PI * radius;  }
}

class InterDemo
{
	public static void main(String arg[])
	{
		Circle obj = new Circle();
		System.out.println("Area is :"+obj.Area(10.5f));
		System.out.println("Circumferance is :"+obj.Circumferance(10.5f));
		System.out.println("Value of PI is :"+Figures.PI);
	}
}