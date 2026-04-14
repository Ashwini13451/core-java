class PVRTwoExecuter {
    public static void main(String[] args) {
        PVR pvr = new PVR();
        pvr.pvrId = 2;
        pvr.name = "PVR Forum Mall";
        pvr.location = "Bengaluru";

        Screen screen = new Screen();
        screen.screenId = 102;
        screen.screenType = "4DX";
        screen.capacity = 150;

        boolean created = pvr.createScreen(screen);
        System.out.println(created);

        pvr.getPVRDetails();
    }
}
