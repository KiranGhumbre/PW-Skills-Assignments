interface Demo
{
   void printSomething();
}
class Child implements Demo
{
    public void printSomething(){
        System.out.println("This is child method");
    }
}

public class Interface
{
	public static void main(String[] args) {
		Child child=new Child();
		child.printSomething();
	}
}
