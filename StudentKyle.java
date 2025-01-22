import java.util.ArrayList;

public class StudentKyle implements Words{
    
    ArrayList<String> wordsList = new ArrayList<>();

    public StudentKyle()
    {
    wordsList.add("Me");
    wordsList.add("meeting");
    wordsList.add("Tides Dance like");
    wordsList.add("Water ebbs, flows");
    wordsList.add("Refrigerator");
    }
    
    public String phrase(int syllables){
        return wordsList.get(syllables);
    }


}