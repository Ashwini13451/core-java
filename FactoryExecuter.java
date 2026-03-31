class FactoryExecuter {
    public static void main(String[] args) {

        Machine m1 = new Machine();
        m1.machineId = 1;
        m1.machineName = "Lathe";
        m1.working = true;
        m1.type = "Cutting";
        m1.power = 500;

        Factory f1 = new Factory();
        f1.factoryId = 501;
        f1.factoryName = "ABC Factory";
        f1.location = "Bangalore";
        f1.active = true;
        f1.machine = m1;

        f1.getFactoryDetails();
    }
}