class Person
{
    private String name;
    private int age;
    private String adress;
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    public void setAdress(String adress){
        this.adress=adress;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    public String getAdress(){
        return adress;
    }
}
public class EncapsulationDemo
{
    public static void main(String []args){
	  Person person=new Person();
	  person.setName("Kiran");
	  person.setAge(26);
	  person.setAdress("New york City, USA");
	  
	  System.out.println(person.getName());
	  System.out.println(person.getAge());
	  System.out.println(person.getAdress());
    }
}
