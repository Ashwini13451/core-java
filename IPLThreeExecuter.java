class IPLThreeExecuter {
    public static void main(String[] args) {
        RCB rcb = new RCB();
        rcb.teamId = 18;
        rcb.captain = "Rohit Sharma";
        rcb.trophies = 0;

        IPL ipl = new IPL(3, "TATA", "2026", rcb);
        ipl.getIPLDetails();
    }
}