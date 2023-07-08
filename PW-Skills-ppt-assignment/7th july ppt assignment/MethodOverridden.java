class Human{
    String name;
    int age;
    
    
    public void dispName(){
        System.out.println(name);
    }
    
    public void dispAge(){
        System.out.println(age);
    }
    
    
    public void overriden(){
        System.out.println("This is overriden method");
    }
}



class Student extends Human{
    
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void overriden(){
        System.out.println("This is overriding method");
    }
}


public class MethodOverridden
{
    public static void main(String [] args){
        Student st1=new Student("Kiran",26);
        st1.overriden();
        st1.dispName();
        st1.dispAge();
    }
}