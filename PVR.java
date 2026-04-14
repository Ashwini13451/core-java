class PVR {
    int pvrId;
    String location;
    String name;
    Screen screen;

    public void getPVRDetails() {
        System.out.println("getPVRDetails invoked");
        System.out.println("the pvr id is: " + pvrId);
        System.out.println("the pvr name is: " + name);
        System.out.println("the pvr location is: " + location);
        screen.getScreenDetails();
        System.out.println("getPVRDetails ended");
    }

    PVR(int pvrId, String name, String location, Screen screen) {
        this.pvrId = pvrId;
        this.name = name;
        this.location = location;
        this.screen = screen;
    }

    PVR() {

    }

    public boolean createScreen(Screen screen) {
        this.screen = screen;
        return true;
    }
}




