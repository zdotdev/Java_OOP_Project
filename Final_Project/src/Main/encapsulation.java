package Main;

import java.util.*;

public class encapsulation {
     private float principal = 0;
    private float interest = 0;
    private final int valOneK = 1_000;
    private final int valOneM = 1_000_000;
    
    public void calculator(){
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.print("Principal ($1,000 - $1,000,000): ");
        principal = scan.nextFloat();
        
        if(principal < this.valOneK || principal > this.valOneM){
        System.out.println("Enter a value 1,000 - 1,000,000");
        }
        else
            break;
        }
        while(true){
        System.out.print("Annual Interest rate (0-30): ");
        interest = scan.nextFloat();
        if(interest <= 0 || interest > 30){
        System.out.println("Enter a value 1-30");
        }
        else
            break;
        }
        System.out.print("Period (years): ");
        int years = scan.nextInt();
        float mortgage = principal * ((interest / 100) * (float)Math.pow((1 + (interest / 100)),(years * 12))) / ((float)Math.pow((1 + (interest / 100)),(years * 12)) - 1);
        System.out.println("Your monthly payment is: " + mortgage);
    }
}
