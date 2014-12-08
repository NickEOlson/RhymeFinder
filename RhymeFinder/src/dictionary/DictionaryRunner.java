package dictionary;

import java.io.File;
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
			Scanner file = new Scanner(new File("data/wordlist.dat")) ;
			String temp = "" ;
			test = scan.nextLine() ;
			Dictionary dic = new Dictionary(test) ;
			
			while (!temp.equals(" "))
			{
				temp = file.nextLine() ;
				if (dic.findRhymes(temp) != null)
					System.out.println(dic.findRhymes(temp)) ;
			}
			file.close() ;
			System.out.println("Number of letters used to rhyme: "+dic.getNumLetters()) ;
			System.out.println("Number of words found to match: "+dic.getNumWords()) ;
		}
		scan.close() ;
	}
}