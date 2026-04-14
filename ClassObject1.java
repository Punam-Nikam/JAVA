

class Computer{

    //create a method 1
    public void playMusic()
    {
        System.out.println("Playing music...");
    }

    public String getPenForMe(int cost) {
        // return "Pen";   //here we have return pen imply..but we can also check the condition where if cost is less tham 10rs..then no pen will get as follows:
        if(cost>=10)
            return "Pen";
        else
            return "Nothing";
       
    }
}

public class ClassObject1 {
    public static void main(String[] args) {
        
        Computer comp=new Computer(); //object creation

        comp.playMusic();
        
        String pen=comp.getPenForMe(9);
        System.out.println(pen);
    }
}
