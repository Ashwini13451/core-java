class Zee5 {

    static String kannadaSeries[] = {
        "Gaalipata",
        "Humorously Yours Kannada",
        "Loose Connection",
        "Godhi Banna Sadharana Mykattu",
        "Kavaludaari",
        "Dia",
        "French Biriyani",
        "Love Mocktail",
        "Mayabazar 2016",
        "Bell Bottom"
    };

    static String hindiSeries[] = {
        "Abhay",
        "Rangbaaz",
        "Kaafir",
        "Sunflower",
        "The Broken News",
        "Taj Divided by Blood",
        "Duranga",
        "Code M",
        "State of Siege 26/11",
        "Mithya"
    };

    static String englishSeries[] = {
        "The Son",
        "The Final Call",
        "Queens",
        "The Gilded Age",
        "Bloodlands",
        "Whitstable Pearl",
        "The Drowning",
        "Traces",
        "Darklands",
        "The Pact"
    };

    static String malayalamSeries[] = {
        "Kolla",
        "Salute",
        "Love",
        "Operation Java",
        "Cold Case",
        "The Priest",
        "Driving Licence",
        "Forensic",
        "Joseph",
        "Uyare"
    };

    static String teluguSeries[] = {
        "Loser",
        "Meka Suri",
        "Recce",
        "Prema Entha Madhuram",
        "Ninne Pelladatha",
        "Krishna and His Leela",
        "Gaalodu",
        "Kinnerasani",
        "HIT",
        "Colour Photo"
    };

    static String tamilSeries[] = {
        "Ayali",
        "Auto Shankar",
        "Vilangu",
        "Kaaragar",
        "Thiravam",
        "Anantham",
        "Godfather",
        "Tamizh Padam",
        "Theerpugal Virkapadum",
        "Locker"
    };

    public static void main(String[] args) {

        getKannadaSeries();
        getHindiSeries();
        getEnglishSeries();
        getMalayalamSeries();
        getTeluguSeries();
        getTamilSeries();
    }

    static void getKannadaSeries() {
        System.out.println("Kannada Series:\n");
        for (String s : kannadaSeries)
            System.out.println(s);
    }

    static void getHindiSeries() {
        System.out.println("\nHindi Series:\n");
        for (String s : hindiSeries)
            System.out.println(s);
    }

    static void getEnglishSeries() {
        System.out.println("\nEnglish Series:\n");
        for (String s : englishSeries)
            System.out.println(s);
    }

    static void getMalayalamSeries() {
        System.out.println("\nMalayalam Series:\n");
        for (String s : malayalamSeries)
            System.out.println(s);
    }

    static void getTeluguSeries() {
        System.out.println("\nTelugu Series:\n");
        for (String s : teluguSeries)
            System.out.println(s);
    }

    static void getTamilSeries() {
        System.out.println("\nTamil Series:\n");
        for (String s : tamilSeries)
            System.out.println(s);
    }
}