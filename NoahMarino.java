import java.util.ArrayList;

public class NoahMarino implements Words {
    ArrayList<String> wordList = new ArrayList<>();

    public NoahMarino(){
        wordList.add("jumping");
        wordList.add("through");
        wordList.add("the amazing");
        wordList.add("water");
        wordList.add("shines bright and sparkles");
    }

    @Override
    public String phrase(int syllables) {
    return wordList.get(syllables);
    }
}