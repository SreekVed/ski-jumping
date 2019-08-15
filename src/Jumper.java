
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Jumper implements Comparable<Jumper> {

    private String name;
    private int points;
    private ArrayList<Integer> lengths;
    
    public Jumper(String name) {
        this.name=name;
        this.points=0;
        lengths=new ArrayList<Integer>();
    }
    
    public int getPoints() {
        return this.points;
    }
    
    public void getResults() {
        Random random = new Random();
        System.out.println("    " + this.name);
        
        // length
        int length = 60 + random.nextInt(61);
        System.out.println("        length: " + length);
        lengths.add(length);
        points+=length;
        //votes
        ArrayList<Integer> votes = new ArrayList<Integer>();
        for(int i=0;i<5;i++) {
            int vote = 10 + random.nextInt(11);
            votes.add(vote);
        }
        System.out.println("        judge votes: " + votes.toString());
        Collections.sort(votes);
        points = points + votes.get(1) + votes.get(2) + votes.get(3);
    }
    
    public void getlengths() {
        int count=0;
        System.out.print("            jump lengths: ");
        for(int i : lengths) {
            System.out.print(i + " m");
            count++;
            if(count<lengths.size()) System.out.print(", ");
        }
        System.out.println("");
    }
    
    @Override
    public int compareTo(Jumper other) {
        return this.points-other.getPoints();
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.points + " points)"; 
    }
}
