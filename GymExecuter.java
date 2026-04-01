class GymExecuter {
    public static void main(String[] args) {

        for(int i=1; i<=20; i++) {

            Trainer t = new Trainer();
            t.trainerId = i;
            t.trainerName = "Trainer" + i;
            t.specialization = (i % 2 == 0) ? "Fitness" : "Yoga";
            t.certified = (i % 2 == 0);
            t.experience = i + 2;

            Gym g = new Gym();
            g.gymId = 200 + i;
            g.gymName = "Gym" + i;
            g.location = "Bangalore";
            g.open = (i % 2 == 0);
            g.trainer = t;

            g.getGymDetails();
        }
    }
}