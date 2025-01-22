import java.util.Random;
public class FrankieN implements Words
{
    Random rng = new Random();
    public String phrase(int i)
    {
        
        String oneSyllable[] = {"stop", "slow", "go"};
        String twoSyllable[] = {"hello", "goodbye", "don't go"};
        String threeSyllable[] = {"amazing", "whatever", "terrible"};
        String fourSyllable[] = {"seventy-four", "Nintendo Switch", "pterodactyl"};
        String fiveSyllable[] = {"tyrannosaurus", "Star Wars: The Clone Wars", "supercomputer"};
        
        switch(i)
        {
            case 1:
                return oneSyllable[rng.nextInt(3)];
            case 2:
                return twoSyllable[rng.nextInt(3)];
            case 3:
                return threeSyllable[rng.nextInt(3)];
            case 4:
                return fourSyllable[rng.nextInt(3)];
            case 5:
                return fiveSyllable[rng.nextInt(3)];
            default:
                return "";
        }
    }
}