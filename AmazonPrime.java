class AmazonPrime {

    static String kannadaSeries[] = {
        "Kantara",
        "KGF Chapter 1",
        "KGF Chapter 2",
        "777 Charlie",
        "Vikrant Rona",
        "Yuvarathnaa",
        "Roberrt",
        "James",
        "Pogaru",
        "Avane Srimannarayana"
    };

    static String hindiSeries[] = {
        "Mirzapur",
        "The Family Man",
        "Panchayat",
        "Made in Heaven",
        "Breathe",
        "Farzi",
        "Paatal Lok",
        "Mumbai Diaries",
        "Bandish Bandits",
        "Dahaad"
    };

    static String englishSeries[] = {
        "The Boys",
        "Reacher",
        "Jack Ryan",
        "The Marvelous Mrs Maisel",
        "Fleabag",
        "Good Omens",
        "The Wheel of Time",
        "The Rings of Power",
        "Invincible",
        "Gen V"
    };

    static String malayalamSeries[] = {
        "Drishyam 2",
        "Malik",
        "The Great Indian Kitchen",
        "Jana Gana Mana",
        "Minnal Murali",
        "Cold Case",
        "Kurup",
        "Forensic",
        "Uyare",
        "Driving Licence"
    };

    static String teluguSeries[] = {
        "The Family Man Telugu",
        "Modern Love Hyderabad",
        "Unstoppable",
        "Colour Photo",
        "HIT",
        "Major",
        "Geetha Govindam",
        "Rangasthalam",
        "Pushpa",
        "Ala Vaikunthapurramuloo"
    };

    static String tamilSeries[] = {
        "Suzhal The Vortex",
        "The Village",
        "Modern Love Chennai",
        "Vadhandhi",
        "Master",
        "Vikram",
        "Soorarai Pottru",
        "Jai Bhim",
        "Kaithi",
        "Sardar"
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