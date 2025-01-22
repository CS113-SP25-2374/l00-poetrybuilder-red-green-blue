public class RafailLishman implements Words{

    private String[] myPhrase;
    private static int forcedSize = 5;

    public RafailLishman(){
        this.myPhrase = new String[]{"Ace","Lightning","Apricot","Jewellery","Globalization"};
    }
    public RafailLishman(String[] myPhrase){
        try{
            if(this.myPhrase.length == forcedSize){
                this.myPhrase = myPhrase;
            }
            else{
                throw new IndexOutOfBoundsException();
            }

        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Make sure the array length is 5!");
        }
    }
    public RafailLishman(String oneSyllable, String twoSyllable, String threeSyllable, String fourSyllable, String fiveSyllable){
        this.myPhrase = new String[]{oneSyllable, twoSyllable, threeSyllable, fourSyllable, fiveSyllable};
    }
    
    @Override
    public String phrase(int syllables){
            try {
                return myPhrase[(syllables-1)];
            } 
            catch (IndexOutOfBoundsException e) {
                System.out.println("Sorry but please pick a syllable that's between 1 and 5!");
                return "Error";
            }
        }
    }