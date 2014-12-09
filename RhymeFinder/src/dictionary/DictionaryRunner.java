package dictionary;

import java.io.File;
import java.io.IOException;
import java.util.Scanner ;
import javax.swing.JDialog;
import javax.swing.JFrame ;
import javax.swing.JOptionPane ;

public class DictionaryRunner 
{
	public static void main(String[] args) throws IOException
	{
		String test = "" ;
		String rhymes = "<html> Rhymes: " ;
		Scanner scan = new Scanner(System.in) ;
		JFrame display = new JFrame() ;
		Scanner file = new Scanner(new File("data/wordlist.dat")) ;
		String temp = "" ;
		test = JOptionPane.showInputDialog(display, "What word do you want to rhyme?") ;
		Dictionary dic = new Dictionary(test) ;	
		
		while (!temp.equals(" "))
		{
			temp = file.nextLine() ;
			if (dic.findRhymes(temp) != null)
				rhymes += "<br>" + temp ;
		}
		file.close() ;
		rhymes += "<br>Number of letters used to rhyme: " + dic.getNumLetters() ;
		rhymes += "<br>Number of words found to match: " + dic.getNumWords() ;
		JOptionPane pane = new JOptionPane() ;
		pane.setMessage(rhymes) ;
		pane.setMessageType(JOptionPane.INFORMATION_MESSAGE) ;
		JDialog dialog = pane.createDialog(null, "Rhymes") ;
		dialog.setVisible(true) ;
		scan.close() ;
	}
}