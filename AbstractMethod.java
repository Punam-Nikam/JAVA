
abstract class Car 
{
    public abstract void drive();   
    public abstract void fly();
    /*  this is abstract method ..as we dont know what to perform or write here(we dont know driving in drive() method) so we just declare here ..//later car class will impelemented then method will be defined later....  */ 
    
    
    //  abstract method only belongs to absract class only ( compulsory) so we make Car class as abstract 
    // we can crete multiple abstract method.

    // there is no mandatory that abstract class have abstract method .. it can have abstract method, normal methods ..

    public void playMusic(){
        System.out.println("Playing music");
    }
}

abstract class Thar extends Car {
    public void drive() {     //here method drive() is overrided
        System.out.println("Driving");
    }
}

class newThar extends  Thar{   //concrete class

    
    public void fly() {
       System.out.println("flying..");
    }
}
public class AbstractMethod {
    public static void main(String[] args) {
         
        //Car obj = new Car();   //we cannot create object of the abstract class\ but it is extended by Thar so we can create object of Thar class
        Car obj = new newThar();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
