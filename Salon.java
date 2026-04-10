class Salon {

    String serviceNames[] = new String[7];
    int index;

    // create operation
    public boolean addService(String service) {
        boolean isServiceAdded = false;

        if (index < serviceNames.length) {

            if (service != null && !service.isEmpty()) {
                serviceNames[index++] = service;
                isServiceAdded = true;

            } else {
                System.out.println(service + " not added");
            }

        } else {
            System.out.println("Service list is already full");
        }

        return isServiceAdded;
    }

    // read operation
    public void getServices() {
        System.out.println("The available services are:");
        for (String service : serviceNames)
            System.out.println(service);
    }
}