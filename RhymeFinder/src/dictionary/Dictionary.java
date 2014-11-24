package dictionary ;

import java.io.IOException ;
import java.io.File ;
import java.util.Scanner ;

public class Dictionary
{
	public String word ;
	public int numLetters ;
	
	public Dictionary(String wrd)
	{
		word = wrd ;
		getNumLetters() ;
	}
		
	public void findRhymes() throws IOException
	{
		Scanner file = new Scanner(new File("data/wordlist.dat")) ;
		String temp = "" ;
		while (!temp.equals(" "))
		{
			temp = file.nextLine() ;

			if (word.length() < 2)
			{
				if (word.equalsIgnoreCase("a"))
				{
					if ((temp.length() >= 2) &&
						(temp.substring(temp.length()-2).equals("ay") ||
						temp.substring(temp.length()-2).equals("ah") ||
						temp.substring(temp.length()-2).equals("uh")))
							System.out.println(temp) ;
				}
				
				if (word.equalsIgnoreCase("i"))
				{
					if ((temp.length() >= 2) &&
						(temp.substring(temp.length()-2).equals("ie") ||
						temp.substring(temp.length()-2).equals("ye") ||
						temp.substring(temp.length()-2).equals("ly") ||
						temp.substring(temp.length()-2).equals("ai") ||
						temp.substring(temp.length()-2).equals("ky")))
							System.out.println(temp) ;
				}
			}
			
			else
			{
				if (temp.length() >= getNumLetters() &&
					word.substring((word.length() - getNumLetters())).equals(temp.substring((temp.length() - getNumLetters()))) &&
					!word.equals(temp))
						System.out.println(temp) ;
			}
		}
		file.close() ;
	}
	
	public int getNumLetters()
	{
		if (word.length() > 6)
			numLetters = 4 ;
		else if ((word.length() <= 6) && (word.length() > 2))
			numLetters = (int) ((word.length() * (2.0/3.0)) + 0.5) ;
		else if (word.length() == 2)
			numLetters = 2 ;
		else
			numLetters = 0 ;
		return numLetters ;
	}
	
	public boolean isOneLetter()
	{
		if (word.length() == 1)
			return true ;
		return false ;
	}
}