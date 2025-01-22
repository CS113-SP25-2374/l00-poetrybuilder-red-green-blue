import java.util.ArrayList;

public class RPGLimerick extends Structure{
    public void displayPoem(ArrayList<Words> words){
        //Long Syllable
        System.out.println(getRandomWords(words).phrase(5) + " " + getRandomWords(words).phrase(3) + "\n");
        //Short Syllable
        System.out.println(getRandomWords(words).phrase(4) + " " + getRandomWords(words).phrase(2) + "\n");
        System.out.println(getRandomWords(words).phrase(4) + " " + getRandomWords(words).phrase(4) + "\n");
        System.out.println(getRandomWords(words).phrase(2) + " " + getRandomWords(words).phrase(3) + "\n");
        System.out.println(getRandomWords(words).phrase(5) + " " + getRandomWords(words).phrase(5) + "\n");
    }

}