package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Fortnite Related Questions");
		// 1. Create a variable to hold the user's score
		int score = 0;
		// 2. Ask the user a question
		String input = JOptionPane.showInputDialog(
				"If there are 8 trees around you and each tree gives 14 wooden logs, how many trees have to die if you want to get up a slope with 4 ramps of 10 wooden logs?");
		// 3. Use an if statement to check if their answer is correct
		if (input.equals("3")) {
			// 4. if the user's answer is correct
			score++;
			// -- add one to their score
		}
		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String input2 = JOptionPane.showInputDialog(
				"If a tree has 600 health and your axe does 50 health each swing, how many swings will it take to finish the tree.");
		if (input2.equals("12")) {
			score++;
		}
		String input3 = JOptionPane.showInputDialog(
				"If you are trying to get from one side to the other, and the storm is going to start to get you in 2 hours,\n and you have to run 20 miles at 5 MPH when the storm is coming at you at 10 MPH, how early do you have to start running before the storm catches you?  ");
		if (input3.equals("2 hours before")) {
			score++;
			// 6. After all the questions have been asked, print the user's score
			
		}
		JOptionPane.showMessageDialog(null, "Congratulations! you got "+score);
	}

}
