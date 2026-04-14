class PVROneExecuter {
    public static void main(String[] args) {
        PVR pvr = new PVR();
        pvr.pvrId = 1;
        pvr.name = "PVR Orion Mall";
        pvr.location = "Bengaluru";

        Screen screen = new Screen();
        screen.screenId = 101;
        screen.screenType = "IMAX";
        screen.capacity = 250;

        pvr.screen = screen;

        pvr.getPVRDetails();
    }
}