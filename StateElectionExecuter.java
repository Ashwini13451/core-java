class StateElectionExecuter {

    public static void main(String[] a) {

        StateElection ref = new StateElection();

        boolean added = ref.addParty("Party A");

        added = ref.addParty("Party B");
        System.out.println(added);

        added = ref.addParty("Party C");
        added = ref.addParty("Party D");
        added = ref.addParty("Party E");
        added = ref.addParty("Party F");
        added = ref.addParty("Party G");

        // extra party to check full condition
        added = ref.addParty("Extra Party");

        ref.getParties();
    }
}