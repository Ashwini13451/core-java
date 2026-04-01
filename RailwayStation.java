class RailwayStation {
    int stationId;
    String stationName;
    String location;
    boolean open;
    Platform platform;

    public void getStationDetails() {
        System.out.println("Station Id: " + stationId);
        System.out.println("Station Name: " + stationName);
        System.out.println("Location: " + location);
        System.out.println("Open: " + open);
        platform.getPlatformDetails();
    }
}