import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class SkiJumping {
    
    private ArrayList<Jumper> jumpers;
    private int round;
    
    public SkiJumping() {
        jumpers = new ArrayList<Jumper>();
        round=1;
    }
     
    
    public void start(Scanner reader) {
        
        while(true) {
            System.out.print("  Participant name: ");
            String input = reader.nextLine();
            if(input.isEmpty()) break;
            else jumpers.add(new Jumper(input));
        }
    
        System.out.println("\nThe tournament begins! ");
        
        while(true) {
        System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
        String choice = reader.nextLine();
        
        if(choice.equals("jump")) this.jumping();
        else {
            this.results();
            break;
        }
        }
    }
    
    
    
    public void jumping() {

        System.out.println("\nRound " + round);
        System.out.println("\nJumping order: ");
        Collections.sort(jumpers);
        
        for(int i=0;i<jumpers.size();i++) {
            System.out.print("    ");
            System.out.println(i+1 + ". " + jumpers.get(i));
        }
       
        System.out.println("\nResults of round " + round);
        
        for(Jumper z : jumpers) {
            z.getResults();
        }
        
        
      round++;
    }
    
    public void results() {
    
        System.out.println("\nThanks!");
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        
        System.out.println("\nTournament results: ");
        System.out.println("Position    Name");
        
        for(int i=0;i<jumpers.size();i++) {
            System.out.println(i+1 + "           " + jumpers.get(i));
            jumpers.get(i).getlengths();
        }
        
    }
    
    
    
}
