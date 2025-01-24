public class Levon implements Words {
    String wordsnstuff[] = {"cat", "happy", "family", "beautiful", "unbelievable"};
    
    public String phrase(int i) { 
        return wordsnstuff[(i-1)];
    }
}