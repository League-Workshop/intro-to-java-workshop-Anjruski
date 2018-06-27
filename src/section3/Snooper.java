package section3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What's your name?");
	JOptionPane.showMessageDialog(null,"Hi "+ name);
	String number = JOptionPane.showInputDialog("Social security number?");
	JOptionPane.showMessageDialog(null,number+" is your social security number");
    String phone = JOptionPane.showInputDialog("Phone number?");
    JOptionPane.showMessageDialog(null,phone+" is your phone number");
    JOptionPane.showMessageDialog(null,"Downloading Information...");
    JOptionPane.showMessageDialog(null,"Done! Have fun with stolen items!");
    JOptionPane.showMessageDialog(null,"Though, we need full internet for this to work, so, due to not 500/500 internet, we will be taking all of this information\nwhile you experience what it is like to have corruption on your computer/phone");
}
}
