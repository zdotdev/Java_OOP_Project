package Main;
import java.util.*;

interface Animal {
    void sound();
    void color();
    void speed();
}

class dog implements Animal{
    
    @Override
    public void sound(){
        System.out.println("lamaw");
    }
    @Override
    public void color(){
        System.out.println("yaw");
    }
    @Override
    public void speed(){
        System.out.println("charan");
    }
}

class horse implements Animal{
    
    @Override
    public void sound(){
        System.out.println("lamaw");
    }
    @Override
    public void color(){
        System.out.println("yaw");
    }
    @Override
    public void speed(){
        System.out.println("charan");
    }
}

class cow implements Animal{
    
    @Override
    public void sound(){
        System.out.println("lamaw");
    }
    @Override
    public void color(){
        System.out.println("yaw");
    }
    @Override
    public void speed(){
        System.out.println("charan");
    }
}

class pig implements Animal{
    
    @Override
    public void sound(){
        System.out.println("lamaw");
    }
    @Override
    public void color(){
        System.out.println("yaw");
    }
    @Override
    public void speed(){
        System.out.println("charan");
    }
}

public class overriding {
    public void main(){
        dog d = new dog();
        horse h = new horse();
        cow c = new cow();
        pig p = new pig();
        
        String[] animals = {"1 - Dog", "2 - Horse", "3 - Cow", "4 - Pig"};
        Scanner scan = new Scanner(System.in);
        
        for(String animal : animals)
            System.out.println(animal);
            
        System.out.println("What animal you want?");
        int choice = scan.nextInt();
        
        switch(choice){
            case(1):
                System.out.print("Dog sound is ");
                d.sound();
                System.out.print("Dog color is ");
                d.color();
                System.out.print("Dog speed is ");
                d.speed();
                break;
            case(2):
                System.out.print("Horse sound is ");
                h.sound();
                System.out.print("horse color is ");
                h.color();
                System.out.print("Horse speed is ");
                h.speed();
                break;
            case(3):
                System.out.print("Cow sound is ");
                c.sound();
                System.out.print("Cow color is ");
                c.color();
                System.out.print("Cow speed is ");
                c.speed();
            case(4):
                System.out.print("pig sound is ");
                p.sound();
                System.out.print("Pig color is ");
                p.color();
                System.out.print("Pig Speed is ");
                p.speed();
        }
        
    }
    
}
