class PrisonTwoExecuter {
    public static void main(String[] args) {
        Prison prison = new Prison();
        prison.prisonId = 2;
        prison.prisonName = "Bengaluru Central Prison";
        prison.location = "Bengaluru";

        Criminal criminal = new Criminal();
        criminal.criminalId = 102;
        criminal.name = "Suresh";
        criminal.crimeType = "Fraud";

        boolean created = prison.createCriminal(criminal);
        System.out.println(created);

        prison.getPrisonDetails();
    }
}

