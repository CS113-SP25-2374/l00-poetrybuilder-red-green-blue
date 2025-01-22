public class Perttu implements Words{

    public String phrase(int i) {  

    String phrase;

    switch (i) {
        case 0:
            phrase = "sun";
            return phrase;
        
        case 1:
            phrase = "bright sky";
            return phrase;

         case 2:
            phrase = "the wind blows";
            return phrase;

         case 3:
            phrase = "the birds are singing";
            return phrase;

         case 4:
            phrase = "Childern are playing outside";
            return phrase;
        default:
            return "";
        }
    }


}