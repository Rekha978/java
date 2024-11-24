abstract class Figure
{
    int dim1,dim2;
    Figure(int a,int b)
    {
        dim1=a;
        dim2=b;
    }
    abstract void area();
}
class Rectangle extends Figure
{
    Rectangle(int a,int b)
    {
        super(a,b);
    }
    void area()
    {
        System.out.println("Area of Rectangle is : "+(dim1*dim2));
    }
}
class Triangle extends Figure
{
    Triangle(int a,int b)
    {
        super(a,b);
    }
    void area()
    {
        System.out.println("Area of triangle is ; "+(0.5*dim1*dim2));
    }
}
class AbstractDemo
{
    public static void main(String args[])
    {
        Rectangle r=new Rectangle(10,20);
        r.area();
        Triangle t=new Triangle(20,30);
        t.area();
    }
}
