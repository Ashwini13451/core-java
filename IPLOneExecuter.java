class IPLOneExecuter {
    public static void main(String[] args) {
        IPL ipl = new IPL();
        ipl.iplId = 1;
        ipl.sponsor = "TATA";
        ipl.season = "2024";

        RCB rcb = new RCB();
        rcb.teamId = 18;
        rcb.captain = "Faf du Plessis";
        rcb.trophies = 0;

        ipl.rcb = rcb;

        ipl.getIPLDetails();
    }
}