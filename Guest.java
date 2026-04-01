class Guest {
    int guestId;
    String guestName;
    String profession;
    boolean available;
    Series series;

    public void getGuestDetails() {
        System.out.println("Guest Id: " + guestId);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Profession: " + profession);
        System.out.println("Available: " + available);
        series.getSeriesDetails();
    }
}