class Movie {
    int movieId;
    String movieName;
    String genre;
    boolean hit;
    Actor actor;

    public void getMovieDetails() {
        System.out.println("Movie Id: " + movieId);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Genre: " + genre);
        System.out.println("Hit: " + hit);
        actor.getActorDetails();
        System.out.println("");
    }
}