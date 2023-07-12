abstract class Demo
{
   int val;
   String name;
   
   abstract void printSomething();
   abstract void doSomething();
   
   public void getVal(){
       System.out.println(val);
   }
   
   public void getName(){
      System.out.println(name);
   }
   
   
}

class Child extends Demo {
    Child (int val, String name){
        this.val=val;
        this.name=name;
    }
    void doSomething(){
        System.out.println("This is Child doSomething Method");
    }
    void printSomething(){
        System.out.println("This is child class");
    }
    
}


public class Inheritance2
{
	public static void main(String[] args) {
		Child child= new Child(25,"USA");
		
		child.getVal();
		child.getName();
	}
}
