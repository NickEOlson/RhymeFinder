package dictionary;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class rhymeApplet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rhyme="";
		Scanner scan=new Scanner(System.in);
		JOptionPane.showInputDialog("What word do you want to rhyme?");
		rhyme = scan.nextLine();
		JOptionPane.showMessageDialog(rhyme.findRhymes());
	}
}