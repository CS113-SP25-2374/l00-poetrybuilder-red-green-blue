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
                int choice1 = random.nextInt(5) + 1;
                for (int i = 0; i < choice1; i++){
                    result.append(oneSyllable[random.nextInt(oneSyllable.length)]);
                }
            }
            else if(syllableCount == 2){
                int choice2 = random.nextInt(5) + 1;
                for (int i = 0; i < choice2; i++){
                    result.append(twoSyllables[random.nextInt(twoSyllables.length)]);
                }
            }
            else if (syllableCount == 3){
                int choice3 = random.nextInt(5) + 1;
                for (int i = 0; i < choice3; i++){
                    result.append(threeSyllables[random.nextInt(threeSyllables.length)]);
                }
            }
            else if (syllableCount == 4){
                int choice4 = random.nextInt(5) + 1;
                for (int i = 0; i < choice4; i++){
                    result.append(fourSyllables[random.nextInt(fourSyllables.length)]);
                }
            }
            else if (syllableCount == 5){
                int choice5 = random.nextInt(5) + 1;
                for (int i = 0; i < choice5; i++){
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