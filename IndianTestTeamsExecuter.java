class IndianTestTeamsExecuter {

    public static void main(String[] a) {

        IndianTestTeams ref = new IndianTestTeams();

        boolean added = ref.addPlayer("Rohit Sharma");

        added = ref.addPlayer("Shubman Gill");
        System.out.println(added);

        added = ref.addPlayer("Cheteshwar Pujara");
        added = ref.addPlayer("Virat Kohli");
        added = ref.addPlayer("Ajinkya Rahane");
        added = ref.addPlayer("Rishabh Pant");
        added = ref.addPlayer("Shreyas Iyer");
        added = ref.addPlayer("Ravindra Jadeja");
        added = ref.addPlayer("Ravichandran Ashwin");
        added = ref.addPlayer("Mohammed Shami");
        added = ref.addPlayer("Jasprit Bumrah");

        // extra player to check full condition
        added = ref.addPlayer("Extra Player");

        ref.getPlayers();
    }
}