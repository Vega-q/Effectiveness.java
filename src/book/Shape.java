package book;

public abstract class Shape {
    double dim;
    final double PI=3.14;
    public Shape(double dim) {
        this.dim=dim;
    }
    public abstract double Area();//抽象方法，获得面积
    public abstract double Perimeter();//抽象方法，获得周长
}
class Circle extends Shape{
    public Circle(double dim) {
        super(dim);
    }
    public double Area() {  //实现抽象方法Area()
        return PI*dim*dim;
    }
    public double Perimeter() {  //实现抽象方法Perimeter()
        return 2*PI*dim;
    }
}
class Rectangle extends Shape {
    double width;
    public Rectangle(double dim,double width){
        super(dim);
        this.width=width;
    }
    public double  Area () {
        return dim*width;
    }
    public double Perimeter() {
        return 2*(dim+width);
    }

}
class Test {

    public static void main(String[] args) {
        Shape shape =new Circle(10);
        //声明一个Shape对象，指向实现它的子类对象
        System.out.println("圆的面积："+shape.Area());
        //调用Area()求圆的面积，并输出
        System.out.println("圆的周长："+shape.Perimeter());
        //调用Perimeter()求圆的周长，并输出
        Shape rect1=new Rectangle(2,5);
        System.out.println("长方形的面积是："+rect1.Area ());
        System.out.println("长方形的周长是："+rect1.Perimeter());

    }

}


