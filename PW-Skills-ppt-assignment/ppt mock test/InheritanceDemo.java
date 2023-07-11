 abstract class Animal{
    abstract void makeSound();
}
class Dog extends Animal
{
    void makeSound(){
        System.out.println("Dogs Bark");
    }
}

class Cat extends Animal
{
    void makeSound(){
        System.out.println("Cats purr");
    }
}

class Cow extends Animal
{
    void makeSound(){
        System.out.println("Cows Moo");
    }
}


public class InheritanceDemo
{
    public static void main(String []args){
	
	Dog dog=new Dog();
	dog.makeSound();
	
	Cat cat=new Cat();
	cat.makeSound();
	
	Cow cow =new Cow();
	cow.makeSound();
    }
}
