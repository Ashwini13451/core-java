class GardenOneExecuter {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.gardenId = 1;
        garden.gardenName = "Lalbagh";
        garden.location = "Bengaluru";

        Flower flower = new Flower();
        flower.flowerId = 101;
        flower.name = "Rose";
        flower.color = "Red";

        garden.flower = flower;

        garden.getGardenDetails();
    }
}


