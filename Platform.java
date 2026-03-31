class Platform {
    int platformNumber;
    String platformName;
    boolean isActive;
    int capacity;
    String type;

    public void getPlatformDetails() {
        System.out.println("Platform Number: " + platformNumber);
        System.out.println("Platform Name: " + platformName);
        System.out.println("Is Active: " + isActive);
        System.out.println("Capacity: " + capacity);
        System.out.println("Type: " + type);
    }
}