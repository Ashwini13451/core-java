class IPLTwoExecuter {
    public static void main(String[] args) {
        IPL ipl = new IPL();
        ipl.iplId = 2;
        ipl.sponsor = "TATA";
        ipl.season = "2025";

        RCB rcb = new RCB();
        rcb.teamId = 18;
        rcb.captain = "Virat Kohli";
        rcb.trophies = 0;

        boolean created = ipl.createRCB(rcb);
        System.out.println(created);

        ipl.getIPLDetails();
    }
}
