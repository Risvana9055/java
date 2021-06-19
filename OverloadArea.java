class OverloadArea
{
    void area(float x)
    {   
        float Square=x*x;
        System.out.println("the area of the square is "+Square+ " "+"sq units");
    }
    void area(float x, float y)
    {
        float Rectangle=x*y;
        System.out.println("the area of the rectangle is "+Rectangle+ " "+"sq units");
    }
    void area(double x)
    {
        double Circle = 3.14 * x * x;
        System.out.println("the area of the circle is "+ Circle+ " "+"sq units");
    }
}
public class Overload 
{
     public static void main(String args[]) 
	{
	   OverloadArea obj= new OverloadArea();
	   obj.area(12);
	   obj.area(5,7);
	   obj.area(5.5);
        }
}