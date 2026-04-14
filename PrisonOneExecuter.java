class PrisonOneExecuter {
    public static void main(String[] args) {
        Prison prison = new Prison();
        prison.prisonId = 1;
        prison.prisonName = "Tihar Jail";
        prison.location = "Delhi";

        Criminal criminal = new Criminal();
        criminal.criminalId = 101;
        criminal.name = "Rakesh";
        criminal.crimeType = "Theft";

        prison.criminal = criminal;

        prison.getPrisonDetails();
    }
}
