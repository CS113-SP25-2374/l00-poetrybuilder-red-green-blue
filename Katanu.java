import java.util.Random;

public class Katanu implements Words {
    public String phrase() {
        String[] oneSyllable = {
            "I", "love", "this", "class", "book"
        };
        String[] twoSyllables = {
            "drinking", "Robin", "enjoy", "surprise", "drawing"
        };
        String[] threeSyllables = {
            "Calpico", "Katsudon", "eleven", "outer space", "jupiter"
        };
        String[] fourSyllables = {
            "Water bottle", "inconsistent", "watermelon", "data structures", "filtered water"
        };
        String[] fiveSyllables = {
            "electricity", "intimidating", "subterranean", "abominable", "observatory"
        };

        Random random = new Random();

        int syllableCount = random.nextInt(5) + 1;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < syllableCount; i++){
            if (syllableCount == 1){
                result.append(oneSyllable[random.nextInt(oneSyllable.length)]);
            }
            else if(syllableCount == 2){
                result.append(twoSyllables[random.nextInt(twoSyllables.length)]);
            }
            else if (syllableCount == 3){
                result.append(threeSyllables[random.nextInt(threeSyllables.length)]);
            }
            else if (syllableCount == 4){
                result.append(fourSyllables[random.nextInt(fourSyllables.length)]);
            }
            else if (syllableCount == 5){
                result.append(fiveSyllables[random.nextInt(fiveSyllables.length)]);
            }
            else {
                return "error";
            }
        }

        return result.toString();
    }

    
}