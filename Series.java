class Series {
    int seriesId;
    String seriesName;
    String genre;
    boolean ongoing;
    int episodes;

    public void getSeriesDetails() {
        System.out.println("Series Id: " + seriesId);
        System.out.println("Series Name: " + seriesName);
        System.out.println("Genre: " + genre);
        System.out.println("Ongoing: " + ongoing);
        System.out.println("Episodes: " + episodes);
    }
}