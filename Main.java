import java.util.ArrayList;

public class Main 
{
    static ArrayList<Words> wordsList = new ArrayList<>();
    static ArrayList<Structure> structureList = new ArrayList<>();
    public static void main(String args[]) {
        wordsList.add(new ProfHorton());
        //1
        wordsList.add(new StudentKyle());
        wordsList.add(new NoahRandel());
        wordsList.add(new Ethan());
        wordsList.add(new FrankieN());
        wordsList.add(new KCMetzger());
        wordsList.add(new Katanu());
        wordsList.add(new RafailLishman());
        wordsList.add(new DDreblow());
        wordsList.add(new Perttu());
        //11

        //structureList.add(new Haiku());
        //A
        //B
        structureList.add(new RPGLimerick());
        //D
        //E
        //F
        //G

        for (Structure s : structureList) {
            System.out.println("***********************");
            s.displayPoem(wordsList);
        }
    }
}
