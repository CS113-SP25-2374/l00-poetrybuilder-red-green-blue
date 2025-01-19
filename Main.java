import java.util.ArrayList;

public class Main {
    static ArrayList<Words> wordsList = new ArrayList<>();
    static ArrayList<Structure> structureList = new ArrayList<>();
    public static void main(String args[]) {
        //wordsList.add(new YourName());
        //1
        //2
        //3
        //4
        //5
        //6
        //7
        //8
        //9
        //10
        //11

        //structureList.add(new Haiku());
        //A
        //B
        //C
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
