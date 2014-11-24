package syllable;

public class SyllableCounter
{
	public String word ;
	
	public SyllableCounter(String wrd)
	{
		word = wrd ;
	}
	
	public boolean isConsonant(char let)
	{
		if (let != 'a' && let != 'e' && let != 'i' && let != 'o' && let != 'u' && let != 'y')
			return true ;
		return false ;
	}
	
	public int countSyllables()
	{
		String tempSyll = "" ;
		
	}
	
	public String returnSyllables()
	{
		
	}
	
}
