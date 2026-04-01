class Client {
    int clientId;
    String clientName;
    String company;
    boolean active;
    String project;

    public void getClientDetails() {
        System.out.println("Client Id: " + clientId);
        System.out.println("Client Name: " + clientName);
        System.out.println("Company: " + company);
        System.out.println("Active: " + active);
        System.out.println("Project: " + project);
    }
}