/**
 * @author Isha Patel 
 * Assignment 06 Turtle 
 * 
 */
import java.util.Scanner;


public class Program{
	
	public static void main(String[] args){		
		Scanner in = new Scanner(System.in);
		Turtle t;
		t = new Turtle();
		
		System.out.println("How many sides do you want your polygon to have? ");
		int sides = in.nextInt();
		int count = sides;
		if (count > 0){
			int sumInt = (sides - 2) * 180;
			double sumEachTurn = 180 - (sumInt /sides);
			t.forward(100);
			t.left(sumEachTurn);
			polygon(sides, count-1);
		}
	}
	
	public static void polygon(int sides, int count){
		Turtle t;
		t = new Turtle();
		
		if (count > 0){
			int sumInt = (sides - 2) * 180;
			double sumEachTurn = 180 - (sumInt /sides);
			t.forward(100);
			t.left(sumEachTurn);
			polygon(sides, count-1);
		}
	}
}
