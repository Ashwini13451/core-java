class Country {

    String states[] = new String[29];
    int index;

    // create operation
    public boolean addState(String state) {
        boolean isStateAdded = false;

        if (index < states.length) {

            if (state != null && !state.isEmpty()) {
                states[index++] = state;
                isStateAdded = true;

            } else {
                System.out.println(state + " not added");
            }

        } else {
            System.out.println("States list is already full");
        }

        return isStateAdded;
    }

    // read operation
    public void getStates() {
        System.out.println("The available states are:");
        for (String state : states)
            System.out.println(state);
    }
}