import java.util.ArrayList;
import java.util.Random;

public abstract class Structure {
    Random random;

    protected Structure() {
        random = new Random();
    }

    /**
     * Return a single set of words
     * @param words an ArrayList of words
     * @return a single set of words
     */
    protected Words getRandomWords(ArrayList<Words> words) {
        return words.get(random.nextInt(words.size()));
    }

    /**
     * Using an ArrayList of words, select words and phrases
     * to build a poem using the structure of your choosing.
     * @param words an ArrayList of words
     */
    public abstract void displayPoem(ArrayList<Words> words);
}