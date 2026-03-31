class Gym {
    int gymId;
    String gymName;
    String location;
    boolean open;
    Trainer trainer;

    public void getGymDetails() {
        System.out.println("Gym Id: " + gymId);
        System.out.println("Gym Name: " + gymName);
        System.out.println("Location: " + location);
        System.out.println("Open: " + open);
        trainer.getTrainerDetails();
        System.out.println("----------------------");
    }
}