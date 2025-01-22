public class DDreblow implements Words {
    public String phrase(int syllables) {

        String phrase = "";

        switch (syllables) {
            case 0:
                // 1 Syllable
                phrase = "Hi";
                break;

            case 1: 
                // 2 Syllable
                phrase = "Hi Bob";
                break;

            case 2:
                // 3 Syllable
                phrase = "I like milk";
                break;

            case 3:
                // 4 Syllable
                phrase = "coco mix time";
                break;

            case 4:
                // 5 Syllable
                phrase = "Apples is money";
        
            default:
                break;
        } 

        return phrase;
    }
}