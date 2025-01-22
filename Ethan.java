public class Ethan implements Words {
    
    public String[] wordsList = {"Big", "Koolaid", "Volcanic", "Admirable", "Electricity"};

    public String phrase(int syllables) {
        return wordsList[syllables - 1];
    }

}