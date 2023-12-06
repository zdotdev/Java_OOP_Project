package project_abstraction_1;
import java.util.*;

/**
 *
 * @author z.dev
 */

abstract class Vehicle{
    public abstract void vehicleStart();
    public abstract void vehicleStop();
    public abstract void vehicleRev();


    public void sleep(){
        System.out.println("Zzz");
    }
}

class Motorcycle extends Vehicle{ 
    
    @Override
    public void vehicleStart() {
        System.out.println("bzzzzttttt"); 
    }
    
    @Override
    public void vehicleRev(){
        System.out.println("Brooooooooom");
    }

    @Override
    public void vehicleStop() {
        System.out.println("Engine Stops..."); 
    }
}

class Jeep extends Vehicle{ 
    
    @Override
    public void vehicleStart() {
        System.out.println("bzzzzttttt"); 
    }
    
    @Override
    public void vehicleRev(){
        System.out.println("Breeeeeeeeet");
    }

    @Override
    public void vehicleStop() {
        System.out.println("Engine Stops..."); 
    }
}

class Supra extends Vehicle{ 
    
    @Override
    public void vehicleStart() {
        System.out.println("Brrrrrrrrrrrttttttttt"); 
    }
    
    @Override
    public void vehicleRev(){
        System.out.println("Brrrrrrrrrstututututututututu");
    }
    
    @Override
    public void vehicleStop() {
        System.out.println("Engine Stops..."); 
    }

}

class GTR extends Vehicle{ 
    
    @Override
    public void vehicleStart() {
        System.out.println("cock"); 
    }
    
    @Override
    public void vehicleRev(){
        System.out.println("Bruuuuuuuuububububuuububububu");
    }

    @Override
    public void vehicleStop() {
        System.out.println("Engine Stops..."); 
    }

}

public class Project_Abstraction_1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Motorcycle m = new Motorcycle();
        Jeep j = new Jeep();
        Supra s = new Supra();
        GTR g = new GTR();

        System.out.println("1: Motorcycle 2: Jeep 3: Toyota Supra mk4 4: Nissan GTR");
        
        System.out.print("Pick a number: ");
        
        int itemInt = scan.nextInt();
        
        switch(itemInt){
            case 1 -> {
                System.out.println("0: No 1; Yes");
                System.out.print("Wannna start the Car? ");
                int itemToDo = scan.nextInt();
                if(itemToDo == (1)){
                    m.vehicleStart();
                    System.out.print("Do you want to rev the car?(0/1)");
                    int rev = scan.nextInt();
                    if(rev == (1)){
                        m.vehicleRev();
                    }else{
                        m.vehicleStop();
                    }
                }else{
                    m.vehicleStop();
                }
            }
            case 2 -> {
                System.out.println("0: No 1; Yes");
                System.out.print("Wannna start the Car? ");
                int itemToDo = scan.nextInt();
                if(itemToDo== (1)){
                    j.vehicleStart();
                    System.out.print("Do you want to rev the car?(0/1)");
                    int rev = scan.nextInt();
                    if(rev == (1)){
                        j.vehicleRev();
                    }else{
                        j.vehicleStop();
                    }
                }else{
                    j.vehicleStop();
                }
            }
            case 3 -> {
                System.out.println("0: No 1; Yes");
                System.out.print("Wannna start the Car? ");
                int itemToDo = scan.nextInt();
                if(itemToDo == (1)){
                    s.vehicleStart();
                    System.out.print("Do you want to rev the car?(0/1)");
                    int rev = scan.nextInt();
                    if(rev == (1)){
                        s.vehicleRev();
                    }else{
                        s.vehicleStop();
                    }
                }else{
                    System.out.println("...");
                }
            }
            case 4 -> {
                System.out.println("0: No 1; Yes");
                System.out.print("Wannna start the Car? ");
                int itemToDo = scan.nextInt();
                if(itemToDo == (1)){
                    g.vehicleStart();
                    System.out.print("Do you want to rev the car?(0/1)");
                    int rev = scan.nextInt();
                    if(rev == (1)){
                        System.out.println("Brooooooooom");
                    }else{
                        System.out.println("Engine Stops...");
                    }
                }else{
                    System.out.println("...");
                }
            }
        }
    }
}
