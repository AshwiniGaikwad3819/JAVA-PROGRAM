//3)interface

interface Animal {
    void eat();
    void sleep();
    
}
class Dog implements Animal{

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Dog eats bones.");
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Dog sleep in its kennel.");
    }

}
  public class main{
  
    public static void main(String[] args) {
        Animal mydog=new Dog();
        mydog.eat();
        mydog.sleep();
        
    }
}
  
