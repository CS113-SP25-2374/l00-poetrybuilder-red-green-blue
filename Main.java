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
        //wordsList.add(new Katanu());
        wordsList.add(new RafailLishman());
        wordsList.add(new DDreblow());
        wordsList.add(new Perttu());
        wordsList.add(new Levon());
        wordsList.add(new NoahMarino());
        //11

        structureList.add(new PKH());
        //A
        //B
        structureList.add(new RPD());
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
