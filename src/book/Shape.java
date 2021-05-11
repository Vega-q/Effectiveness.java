package book;

abstract class Shape {
    public abstract double area();
    public abstract double perimeter(); }
    class Circle extends Shape {
    private double r;// 半径
         public Circle(double r) { this.r = r; }
         public double perimeter() { return 2*Math.PI*r; } public double area() { return Math.PI*r*r; } } class Rectangle extends Shape{ private double side1;  //第一条边 private double side2;  //第二条边 public Rectangle(double s1, double s2){ side1=s1; side2=s2; } public double perimeter(){ return 2*(side1+side2); } public double area(){ return side1*side2; } } class TestPoly { public static void main(String[] args) { Shape s1=new Circle(10); System.out.println("圆形面积为:"+s1.area()); System.out.println("圆形周长为:"+s1.perimeter()); Shape s2=new Rectangle(2, 3); System.out.println("长方形面积为:"+s2.area()); System.out.println("长方形周长为:"+s2.perimeter()); } }
    }
