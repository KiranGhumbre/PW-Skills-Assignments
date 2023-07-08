 abstract class Demo1{
   abstract public void printName();
}



class Demo2 extends Demo1
{
    public void printName(){
       System.out.println("This is Demo2"); 
    }
}


class Demo3 extends Demo1
{
    public void printName(){
       System.out.println("This is Demo3"); 
    }
}



class Demo4 extends Demo1
{
    public void printName(){
       System.out.println("This is Demo4"); 
    }

}


class Poly{
    public void poly(Demo1 ref){
        ref.printName();
    }
}

public class RuntimePolymorphism
{
    public static void main (String []args){
        Demo1 dm2=new Demo2();
        Demo1 dm3= new Demo3();
        Demo1  dm4= new Demo4();
        Poly demo=new Poly();
        
        demo.poly(dm2);
        demo.poly(dm3);
        demo.poly(dm4);
        
        
    }
}