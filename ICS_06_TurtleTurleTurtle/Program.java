/**
 * @author Isha Patel 
 * Assignment 06 Turtle 
 * Draws a polygon with the number of sides given by the user.
 */
import java.util.Scanner;


public class Program{
	
	public static void main(String[] args){		
		Scanner in = new Scanner(System.in);
		
		/** Asks user for the number of sides and sets that input into variable sides
		 * Variable count is used to avoid an infinite loop
		 * calls the method
		 */ 
		System.out.println("How many sides do you want your polygon to have? ");
		int sides = in.nextInt();
		int count = sides;
		Turtle t;
		t = new Turtle();
		polygon(sides, count, t);
	}
	/** Figures out the angle measures and draws the polygon
	 * @param sides is the number of sides (given by the user) the polygon is supposed to be
	 * @param count is a counter to control how many times the method runs so there is a stop
	 * @param turtle is for the turtle command to be recognized
	 */ 
	public static void polygon(int sides, int count, Turtle t){		
		if (count > 0){
			double eachTurn = 360.0 /sides;
			t.forward(100);
			t.left(eachTurn);
			polygon(sides, count-1, t);
		}
	}
}
