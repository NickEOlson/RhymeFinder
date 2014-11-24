package dictionary;

import java.io.IOException;
import java.util.Scanner ;

public class DictionaryRunner 
{
	public static void main(String[] args) throws IOException
	{
		String test = "" ;
		Scanner scan = new Scanner(System.in) ;
		while (!test.equals("stop"))
		{
			test = scan.nextLine() ;
			Dictionary dic = new Dictionary(test) ;
			dic.findRhymes() ;
			System.out.println("Number of letters used to rhyme: "+dic.getNumLetters()) ;
		}
		scan.close() ;
	}
}