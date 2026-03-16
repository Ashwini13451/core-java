class JioHotstar {

    static String kannadaSeries[] = {
        "Kantara",
        "KGF Chapter 1",
        "KGF Chapter 2",
        "Vikrant Rona",
        "James",
        "Yuvarathnaa",
        "Roberrt",
        "777 Charlie",
        "Avane Srimannarayana",
        "Kotigobba 3"
    };

    static String hindiSeries[] = {
        "Special OPS",
        "Aarya",
        "Criminal Justice",
        "Hostages",
        "The Night Manager",
        "City of Dreams",
        "Human",
        "The Freelancer",
        "Taaza Khabar",
        "Lootere"
    };

    static String englishSeries[] = {
        "Game of Thrones",
        "House of the Dragon",
        "The Mandalorian",
        "Loki",
        "Modern Family",
        "How I Met Your Mother",
        "Prison Break",
        "Grey's Anatomy",
        "The Simpsons",
        "This Is Us"
    };

    static String malayalamSeries[] = {
        "Kerala Crime Files",
        "Nagendran's Honeymoons",
        "Masterpeace",
        "Jana Gana Mana",
        "Romancham",
        "2018",
        "Malik",
        "Forensic",
        "Drishyam",
        "Bheeshma Parvam"
    };

    static String teluguSeries[] = {
        "9 Hours",
        "Save the Tigers",
        "Parampara",
        "Karthika Deepam",
        "Aha Naa Pellanta",
        "Arya",
        "Rangasthalam",
        "Waltair Veerayya",
        "RRR",
        "Bheemla Nayak"
    };

    static String tamilSeries[] = {
        "Live Telecast",
        "November Story",
        "Mathagam",
        "Parachute",
        "Kana Kaanum Kaalangal",
        "Bigg Boss Tamil",
        "Etharkkum Thunindhavan",
        "Vikram",
        "Maanagaram",
        "Master"
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