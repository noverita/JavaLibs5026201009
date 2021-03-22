import javax.swing.*;

public class JavaLibs5026201009{

    public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello there! Welcome to Indonesia's History Journey, let your journey begin by pressing OK");
		JOptionPane.showInputDialog("What is your name");
		int yourAge = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
		int yourGrade = Integer.parseInt(JOptionPane.showInputDialog("What class are you in?"));
		JOptionPane.showMessageDialog(null, "Are you ready???");
		double years = Double.parseDouble(JOptionPane.showInputDialog("1. How long (in years) did Japan attack Indonesia?"));
		JOptionPane.showInputDialog("2. What is the name of the person who sewed the Indonesia's flag on Independence day?");
		int theDate = Integer.parseInt(JOptionPane.showInputDialog("3. How many members of PPKI?"));
		JOptionPane.showInputDialog("What do you know about Indonesia's history? Please tell me below!");
		JOptionPane.showMessageDialog(null, "OK, That's all for today's journey, Now let me give you a little spoiler for the next journey");
		int calculate = Integer.parseInt(JOptionPane.showInputDialog("The result of 1+3*6 is...."));
		double phi = Double.parseDouble(JOptionPane.showInputDialog("The result of 1.1*2.4 is..."));
		JOptionPane.showMessageDialog( null, "This could be more interesting, so prepare yourself to solve those kind of problems. We'll see you in the next journey!!!");
	}
}
