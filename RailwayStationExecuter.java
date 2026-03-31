class RailwayStationExecuter {
    public static void main(String[] args) {

        // ----------- Object 1 -----------
        Platform p1 = new Platform();
        p1.platformNumber = 1;
        p1.platformName = "P1";
        p1.isActive = true;
        p1.capacity = 200;
        p1.type = "Express";

        RailwayStation rs1 = new RailwayStation();
        rs1.stationId = 101;
        rs1.stationName = "Majestic";
        rs1.location = "Bangalore";
        rs1.open = true;
        rs1.platform = p1;
        rs1.getStationDetails();

        // ----------- Object 2 -----------
        Platform p2 = new Platform();
        p2.platformNumber = 2;
        p2.platformName = "P2";
        p2.isActive = true;
        p2.capacity = 150;
        p2.type = "Local";

        RailwayStation rs2 = new RailwayStation();
        rs2.stationId = 102;
        rs2.stationName = "Yeshwantpur";
        rs2.location = "Bangalore";
        rs2.open = true;
        rs2.platform = p2;
        rs2.getStationDetails();

        // ----------- Object 3 -----------
        Platform p3 = new Platform();
        p3.platformNumber = 3;
        p3.platformName = "P3";
        p3.isActive = false;
        p3.capacity = 180;
        p3.type = "Express";

        RailwayStation rs3 = new RailwayStation();
        rs3.stationId = 103;
        rs3.stationName = "KSR";
        rs3.location = "Bangalore";
        rs3.open = false;
        rs3.platform = p3;
        rs3.getStationDetails();
    }
}