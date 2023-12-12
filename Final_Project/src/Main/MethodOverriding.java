package Main;
import java.util.*;

class Vehicle{
    public void Speed(){
        System.out.println("");
    }
    public void gears(){
        System.out.println("");
    }
    public void color(){
        System.out.println("");
    }
}

class supra extends Vehicle{
    @Override
    public void Speed(){
        System.out.println("This car can reach 200 km/h");
    }
    @Override
    public void gears(){
        System.out.println("This car has 5 Gears");
    }
    @Override
    public void color(){
        System.out.println("The car color is Gold");
    }
}

class r34 extends Vehicle{
    @Override
    public void Speed(){
        System.out.println("This car can reach 300 km/h");
    }
    @Override
    public void gears(){
        System.out.println("This car has 6 gears");
    }
    @Override
    public void color(){
        System.out.println("The car color is Silver");
    }
}

public class MethodOverriding {
    public void main(){
        supra s = new supra();
        r34 n = new r34();
        
        String[] cars = {"1 - Toyota MK4 Supra", "2 - Nissan Skyline GTR r34"};
        
        Scanner scan = new Scanner(System.in);
        
        for(String car : cars)
            System.out.println(car);
            
        System.out.println("Pick a car to Show Informations");
        int choice = scan.nextInt();
        
        if(choice == 1){
            s.Speed();
            s.gears();
            s.color();
        }else{
            n.Speed();
            n.gears();
            n.color();
        }
    }
}
