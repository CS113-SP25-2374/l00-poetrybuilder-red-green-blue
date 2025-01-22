import java.util.Random;

public class Katanu implements Words {

    @Override
    public String phrase(int syllables) {
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

        int syllableCount = syllables;

        if (syllableCount < 1 || syllableCount > 5) {
            throw new IllegalArgumentException("Syllable count must be between 1 and 5.");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < syllableCount; i++){
            if (syllableCount == 1){
                int choice1 = random.nextInt(5) + 1;
                for (int a = 0; a < choice1; a++){
                    result.append(oneSyllable[random.nextInt(oneSyllable.length)]);
                }
            }
            else if(syllableCount == 2){
                int choice2 = random.nextInt(5) + 1;
                for (int b = 0; b < choice2; b++){
                    result.append(twoSyllables[random.nextInt(twoSyllables.length)]);
                }
            }
            else if (syllableCount == 3){
                int choice3 = random.nextInt(5) + 1;
                for (int c = 0; c < choice3; c++){
                    result.append(threeSyllables[random.nextInt(threeSyllables.length)]);
                }
            }
            else if (syllableCount == 4){
                int choice4 = random.nextInt(5) + 1;
                for (int d = 0; d < choice4; d++){
                    result.append(fourSyllables[random.nextInt(fourSyllables.length)]);
                }
            }
            else if (syllableCount == 5){
                int choice5 = random.nextInt(5) + 1;
                for (int e = 0; e < choice5; e++){
                    result.append(fiveSyllables[random.nextInt(fiveSyllables.length)]);
                }
            }
            else {
                return "error";
            }
        }

        return result.toString();
    }

    
}