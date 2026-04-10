class OlympicExecuter {

    public static void main(String[] a) {

        Olympic ref = new Olympic();

        boolean added = ref.addSport("Athletics");

        added = ref.addSport("Swimming");
        System.out.println(added);

        added = ref.addSport("Gymnastics");
        added = ref.addSport("Boxing");
        added = ref.addSport("Wrestling");
        added = ref.addSport("Hockey");
        added = ref.addSport("Football");
        added = ref.addSport("Tennis");
        added = ref.addSport("Badminton");
        added = ref.addSport("Cycling");
		added=ref.addSport("Running");

        // extra sport to check full condition
        added = ref.addSport("ExtraSport");

        ref.getSports();
    }
}