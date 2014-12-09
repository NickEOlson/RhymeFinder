package dictionary ;

public class Dictionary
{
	public String word ;
	public int numLetters ;
	public int numWords ;
	
	public Dictionary(String wrd)
	{
		word = wrd ;
		getNumLetters() ;
		numWords = 0 ;
	}
		
	public String findRhymes(String temp)
	{
		
		if (word.length() < 2)
		{				
			if (word.equalsIgnoreCase("a"))
				return getForA(temp) ;
			if (word.equalsIgnoreCase("i"))
				return getForI(temp) ;
		}
			
		else
		{
			return getForElse(temp) ;
		}
		return null ;
	}
	
	public String getForI(String temp)
	{
		if ((temp.length() >= 2) &&
				(temp.substring(temp.length()-2).equals("ie") ||
				temp.substring(temp.length()-2).equals("ye") ||
				temp.substring(temp.length()-2).equals("ly") ||
				temp.substring(temp.length()-2).equals("ai") ||
				temp.substring(temp.length()-2).equals("ky")))
		{
			numWords++ ;
			return temp ;
		}
		return null ;
	}
	
	public String getForA(String temp)
	{
		if ((temp.length() >= 2) &&
				(temp.substring(temp.length()-2).equals("ay") ||
				temp.substring(temp.length()-2).equals("ah") ||
				temp.substring(temp.length()-2).equals("uh")))
		{
			numWords++ ;
			return temp ;
		}
		return null ;
	}
	
	public String getForElse(String temp)
	{
		if (temp.length() >= getNumLetters() &&
				word.substring((word.length() - getNumLetters())).equals(temp.substring((temp.length() - getNumLetters()))) && 
				!word.equals(temp))
		{
			numWords++ ;
			return temp ;
		}
		return null ;
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
	
	public int getNumWords()
	{
		return numWords ;
	}
	
	public boolean isOneLetter()
	{
		if (word.length() == 1)
			return true ;
		return false ;
	}
	
	public String toString()
	{
		return "Yeah this method is pointless." ;
	}
}