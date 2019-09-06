package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		/*
		 * Your mission and you have to accept it: Create a PopcornMaker class (in the
		 * popcorn package) and add a main method to it. The main method should create a
		 * bag of Popcorn and cook it in the microwave. Ask the user for the flavor of
		 * the popcorn and the number of minutes to cook it. Don't change the existing
		 * methods.
		 */

	String Flavor =	JOptionPane.showInputDialog("What flavor do you want?");
	
		Popcorn bag = new Popcorn(Flavor);
	
		
		String cook = JOptionPane.showInputDialog("How many minuits do you want to cook your bag of popcorn?");
	
	Microwave Microwave = new Microwave ();
 Microwave.putInMicrowave(bag);
 Microwave.setTime(Integer.parseInt(cook));
Microwave.startMicrowave();
 
 
	}
}
