class Machine {
    int machineId;
    String machineName;
    boolean working;
    String type;
    int power;

    public void getMachineDetails() {
        System.out.println("Machine Id: " + machineId);
        System.out.println("Machine Name: " + machineName);
        System.out.println("Working: " + working);
        System.out.println("Type: " + type);
        System.out.println("Power: " + power);
    }
}