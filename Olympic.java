class Olympic {

    String sports[] = new String[11];
    int index;

    // create operation
    public boolean addSport(String sport) {
        boolean isSportAdded = false;

        if (index < sports.length) {

            if (sport != null && !sport.isEmpty()) {
                sports[index++] = sport;
                isSportAdded = true;

            } else {
                System.out.println(sport + " not added");
            }

        } else {
            System.out.println("Sports list is already full");
        }

        return isSportAdded;
    }

    // read operation
    public void getSports() {
        System.out.println("The available sports are:");
        for (String sport : sports)
            System.out.println(sport);
    }
}