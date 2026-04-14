class PrisonThreeExecuter {
    public static void main(String[] args) {
        Criminal criminal = new Criminal();
        criminal.criminalId = 103;
        criminal.name = "Mohan";
        criminal.crimeType = "Robbery";

        Prison prison = new Prison(3, "Mysuru Jail", "Mysuru", criminal);
        prison.getPrisonDetails();
    }
}