class Inventor {
    static String name = "Thomas Edison";
    static String famousInvention = "Light Bulb";
    static String nationality = "American";
    static int birthYear = 1847;
    static int deathYear = 1931;
    static int totalPatents = 1093;
    static String field = "Electrical Engineering";
    static boolean isScientist = true;
    static String award = "Congressional Gold Medal";

    public static void main(String[] args) {
        String name = "Nikola Tesla";
        String famousInvention = "AC Motor";
        String nationality = "Serbian-American";
        int birthYear = 1856;
        int deathYear = 1943;
        int totalPatents = 300;
        String field = "Electrical Engineering";
        boolean isScientist = true;
        String award = "Order of St. Sava";

        System.out.println("Local Variables");
        System.out.println("===== Inventor Details =====");
        System.out.println("Name: " + name);
        System.out.println("Famous Invention: " + famousInvention);
        System.out.println("Nationality: " + nationality);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Death Year: " + deathYear);
        System.out.println("Total Patents: " + totalPatents);
        System.out.println("Field: " + field);
        System.out.println("Scientist: " + isScientist);
        System.out.println("Award: " + award);

        System.out.println("\nStatic Variables");
        System.out.println("===== Inventor Details =====");
        System.out.println("Name: " + Inventor.name);
        System.out.println("Famous Invention: " + Inventor.famousInvention);
        System.out.println("Nationality: " + Inventor.nationality);
        System.out.println("Birth Year: " + Inventor.birthYear);
        System.out.println("Death Year: " + Inventor.deathYear);
        System.out.println("Total Patents: " + Inventor.totalPatents);
        System.out.println("Field: " + Inventor.field);
        System.out.println("Scientist: " + Inventor.isScientist);
        System.out.println("Award: " + Inventor.award);
    }
}
