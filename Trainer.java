class Trainer {
    int trainerId;
    String trainerName;
    String specialization;
    boolean certified;
    int experience;

    public void getTrainerDetails() {
        System.out.println("Trainer Id: " + trainerId);
        System.out.println("Trainer Name: " + trainerName);
        System.out.println("Specialization: " + specialization);
        System.out.println("Certified: " + certified);
        System.out.println("Experience: " + experience);
    }
}