class IndianTestTeam {

    String playerNames[] = new String[11];
    int index;

    // create operation
    public boolean addPlayer(String player) {
        boolean isPlayerAdded = false;

        if (index < playerNames.length) {

            if (player != null && !player.isEmpty()) {
                playerNames[index++] = player;
                isPlayerAdded = true;

            } else {
                System.out.println(player + " not added");
            }

        } else {
            System.out.println("Player list is already full");
        }

        return isPlayerAdded;
    }

    // read operation
    public void getPlayers() {
        System.out.println("The players in the Indian Test Team are:");
        for (String player : playerNames)
            System.out.println(player);
    }
}