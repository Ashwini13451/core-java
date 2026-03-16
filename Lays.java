class Lays {
    public static void main(String[] args) {

        String americanStyleCream = "American Style Cream & Onion";
        String indiaMagicMasala = "India's Magic Masala";
        String classicSalted = "Classic Salted";
        String spanishTomatoTango = "Spanish Tomato Tango";
        String westIndiesHotSweetChilli = "West Indies Hot 'n' Sweet Chilli";
        String sizzlingHot = "Sizzling Hot";
        String chileLimon = "Chile Limon";
        String sweetChilli = "Sweet Chilli";
        String cheddarJalapeno = "Cheddar & Jalapeno";
        String limeAndMint = "Lime & Mint";

        String flavourNames[] = {
            americanStyleCream,
            indiaMagicMasala,
            classicSalted,
            spanishTomatoTango,
            westIndiesHotSweetChilli,
            sizzlingHot,
            chileLimon,
            sweetChilli,
            cheddarJalapeno,
            limeAndMint
        };

        System.out.println("The Lays Flavour names are:");

        /*System.out.println(flavourNames[0] + "\n" +
                           flavourNames[1] + "\n" +
                           flavourNames[2] + "\n" +
                           flavourNames[3] + "\n" +
                           flavourNames[4] + "\n" +
                           flavourNames[5] + "\n" +
                           flavourNames[6] + "\n" +
                           flavourNames[7] + "\n" +
						   
                           flavourNames[8] + "\n" +
                           flavourNames[9] + "\n"
        );*/

        for (String flavourName : flavourNames) {
            System.out.println(flavourName);
        }
    }
}

