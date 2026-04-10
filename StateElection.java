class StateElection {

    String partyNames[] = new String[7];
    int index;

    // create operation
    public boolean addParty(String party) {
        boolean isPartyAdded = false;

        if (index < partyNames.length) {

            if (party != null && !party.isEmpty()) {
                partyNames[index++] = party;
                isPartyAdded = true;

            } else {
                System.out.println(party + " not added");
            }

        } else {
            System.out.println("Party list is already full");
        }

        return isPartyAdded;
    }

    // read operation
    public void getParties() {
        System.out.println("The available parties are:");
        for (String party : partyNames)
            System.out.println(party);
    }
}