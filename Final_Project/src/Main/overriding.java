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
        System.out.println("Dog sound is: Bark");
    }
    @Override
    public void color(){
        System.out.println("Dog color is: Black");
    }
    @Override
    public void speed(){
        System.out.println("Dog Speed is: 48 km/h");
    }
}

class horse implements Animal{
    
    @Override
    public void sound(){
        System.out.println("Horse sound is: Neigh");
    }
    @Override
    public void color(){
        System.out.println("Horse color is: Brown");
    }
    @Override
    public void speed(){
        System.out.println("Horse speed is: 71 km/h");
    }
}

class cow implements Animal{
    
    @Override
    public void sound(){
        System.out.println("Cow sound is: Moo");
    }
    @Override
    public void color(){
        System.out.println("Cow color is: White");
    }
    @Override
    public void speed(){
        System.out.println("Cow speed is: 40 km/h");
    }
}

class pig implements Animal{
    
    @Override
    public void sound(){
        System.out.println("Pig sound is: Oinks");
    }
    @Override
    public void color(){
        System.out.println("Pig color is: Pink");
    }
    @Override
    public void speed(){
        System.out.println("Pig speed is: 17.7 km/h");
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
                d.sound();
                d.color();
                d.speed();
                break;
            case(2):
                h.sound();
                h.color();
                h.speed();
                break;
            case(3):
                c.sound();
                c.color();
                c.speed();
                break;
            case(4):
                p.sound();
                p.color();
                p.speed();
                break;
        }
        
    }
    
}
