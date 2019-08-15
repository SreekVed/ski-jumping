import java.util.Scanner;

public class Main {

 

    public static void main(String[] args) {

        

        SkiJumping ui = new SkiJumping();

        

        System.out.println("Ski Jumping Tournament");

        System.out.println("\nWrite the names of the participants one at a time; an empty string brings you to the jumping phase.");

        Scanner reader = new Scanner(System.in);

        ui.start(reader);

    }

}

 
