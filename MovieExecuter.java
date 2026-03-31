class MovieExecuter {
    public static void main(String[] args) {

        for(int i=1; i<=20; i++) {

            Actor a = new Actor();
            a.actorId = i;
            a.actorName = "Actor" + i;
            a.age = 25 + i;
            a.famous = (i % 2 == 0);
            a.industry = (i % 2 == 0) ? "Bollywood" : "Sandalwood";

            Movie m = new Movie();
            m.movieId = 100 + i;
            m.movieName = "Movie" + i;
            m.genre = (i % 3 == 0) ? "Action" : "Drama";
            m.hit = (i % 2 == 0);
            m.actor = a;

            m.getMovieDetails();
        }
    }
}