class GuestExecuter {
    public static void main(String[] args) {

        // ----------- Object 1 -----------
        Series s1 = new Series();
        s1.seriesId = 1;
        s1.seriesName = "TechShow";
        s1.genre = "Technology";
        s1.ongoing = true;
        s1.episodes = 50;

        Guest g1 = new Guest();
        g1.guestId = 101;
        g1.guestName = "Rahul";
        g1.profession = "Engineer";
        g1.available = true;
        g1.series = s1;
        g1.getGuestDetails();

        // ----------- Object 2 -----------
        Series s2 = new Series();
        s2.seriesId = 2;
        s2.seriesName = "HealthTalk";
        s2.genre = "Medical";
        s2.ongoing = false;
        s2.episodes = 30;

        Guest g2 = new Guest();
        g2.guestId = 102;
        g2.guestName = "Sneha";
        g2.profession = "Doctor";
        g2.available = false;
        g2.series = s2;
        g2.getGuestDetails();

        // ----------- Object 3 -----------
        Series s3 = new Series();
        s3.seriesId = 3;
        s3.seriesName = "EduWorld";
        s3.genre = "Education";
        s3.ongoing = true;
        s3.episodes = 40;

        Guest g3 = new Guest();
        g3.guestId = 103;
        g3.guestName = "Kiran";
        g3.profession = "Teacher";
        g3.available = true;
        g3.series = s3;
        g3.getGuestDetails();
    }
}