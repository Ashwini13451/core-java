class Prison {
    int prisonId;
    String prisonName;
    String location;
    Criminal criminal;

    public void getPrisonDetails() {
        System.out.println("getPrisonDetails invoked");
        System.out.println("the prison id is: " + prisonId);
        System.out.println("the prison name is: " + prisonName);
        System.out.println("the location is: " + location);
        criminal.getCriminalDetails();
        System.out.println("getPrisonDetails ended");
    }

    Prison(int prisonId, String prisonName, String location, Criminal criminal) {
        this.prisonId = prisonId;
        this.prisonName = prisonName;
        this.location = location;
        this.criminal = criminal;
    }

    Prison() {

    }

    public boolean createCriminal(Criminal criminal) {
        this.criminal = criminal;
        return true;
    }
}
