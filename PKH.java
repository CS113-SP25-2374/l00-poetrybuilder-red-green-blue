import java.util.ArrayList;

public class PKH extends Structure {
    public void displayPoem(ArrayList<Words> words) {
        // couplet, 10 syllables

        System.out.println(getRandomWords(words).phrase(3) 
            + " " + getRandomWords(words).phrase(4) 
            + " " + getRandomWords(words).phrase(3));

        System.out.println(getRandomWords(words).phrase(5)
            + " " + getRandomWords(words).phrase(5));
    }
    
}
