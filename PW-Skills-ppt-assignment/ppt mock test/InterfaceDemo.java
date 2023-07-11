interface Drawable
{
    void draw();
}
class Circle
{
    public void draw(){
        System.out.println("This is Circle");
    }
}

class Rectangle
{
    public void draw(){
        System.out.println("This is Reactangle");
    }
}


public class InterfaceDemo
{
    public static void main(String []args){
	 Circle c1= new Circle();
	 Rectangle r1= new Rectangle();
	 
	 c1.draw();
	 r1.draw();
    }
}
