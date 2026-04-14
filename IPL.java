class IPL {
    int iplId;
    String sponsor;
    String season;
    RCB rcb;

    public void getIPLDetails() {
        System.out.println("getIPLDetails invoked");
        System.out.println("the ipl id is: " + iplId);
        System.out.println("the sponsor is: " + sponsor);
        System.out.println("the season is: " + season);
        rcb.getRCBDetails();
        System.out.println("getIPLDetails ended");
    }

    IPL(int iplId, String sponsor, String season, RCB rcb) {
        this.iplId = iplId;
        this.sponsor = sponsor;
        this.season = season;
        this.rcb = rcb;
    }

    IPL() {

    }

    public boolean createRCB(RCB rcb) {
        this.rcb = rcb;
        return true;
    }
}

