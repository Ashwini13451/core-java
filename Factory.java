class Factory {
    int factoryId;
    String factoryName;
    String location;
    boolean active;
    Machine machine;

    public void getFactoryDetails() {
        System.out.println("Factory Id: " + factoryId);
        System.out.println("Factory Name: " + factoryName);
        System.out.println("Location: " + location);
        System.out.println("Active: " + active);
        machine.getMachineDetails();
    }
}