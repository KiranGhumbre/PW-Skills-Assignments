 abstract class Shape{
    abstract double calculateArea();
}
class Rectangle extends Shape
{
    double width;
    double height;
    
    Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    
    double calculateArea(){
        double area=width*height;
        return area;
    }
}

class Circle extends Shape
{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    
    double calculateArea(){
        double area=3.14*(radius*radius);
        return area;
    }
}

class Triangle extends Shape
{
    double base;
    double ht;
    Triangle (double base, double ht){
        this.base=base;
        this.ht=ht;
    }
    
    double calculateArea(){
        double area=(base*ht)/2;
        return area;
    }
}

class ShapeCalculator
{
    void printArea(Shape shape){
        System.out.println(shape.calculateArea());
    }
}


public class AbstractInheritanceDemo
{
    public static void main(String []args){
	  
	  Shape rect= new Rectangle(6,4);
	  Shape tri= new Triangle(6,4);
	  Shape circle= new Circle(4);
	  
	  ShapeCalculator sc= new ShapeCalculator();
	  
	  sc.printArea(rect);
	  sc.printArea(tri);
	  sc.printArea(circle);
	
    }
}
