import java.util.Random;
public class KCMetzger implements Words{
   public KCMetzger()
   {
   } 

    public String phrase(int syllables)
    {
        Random random = new Random();
        String currentString;
        int randomNum = random.nextInt(5);
        String[] oneSyllableWords = {"two", "time", "tongue", "a", "the"};
        String[] twoSyllableWords = {"tonight", "hungry", "needle", "input", "guarded"};
        String[] threeSyllableWords = {"forever", "PoPiPo", "terrible", "mushroom god", "evermore"};
        String[] fourSyllableWords = {"markers explode", "mouse in a house", "extra hot pocket", "the number eight", "two more big toes"};
        String[] fiveSyllableWords = {"black computer mouse", "giant explosion", "the sun kind of sucks", "telephone number", "I think I'm dying"};
        if(syllables == 1)
        {
            currentString = oneSyllableWords[randomNum];
        }
        else if(syllables == 2)
        {
            currentString = twoSyllableWords[randomNum];
        }
        else if(syllables == 3)
        {
            currentString = threeSyllableWords[randomNum];
        }
        else if(syllables == 4)
        {
            currentString = fourSyllableWords[randomNum];
        }
        else
        {
            currentString = fiveSyllableWords[randomNum];
        }
        return currentString;
    }
}
