public class NoahRandel implements Words {

    public String[] wordlist = {"to" , "upon" , "general" ,"elemental" , "unbelievable"} ;


    public String phrase(int syllables){
        return wordlist[syllables-1];
    }
}