public class ProfHorton implements Words {
    public String phrase(int i) {
        String words[] = {"One", "beauty", "pop goes the", "once upon a", "in the spring I was"};
        return words[(i-1)];
    }
}