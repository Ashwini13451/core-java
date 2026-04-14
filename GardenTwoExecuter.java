class GardenTwoExecuter {
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.gardenId = 2;
        garden.gardenName = "Cubbon Park";
        garden.location = "Bengaluru";

        Flower flower = new Flower();
        flower.flowerId = 102;
        flower.name = "Lily";
        flower.color = "White";

        boolean created = garden.createFlower(flower);
        System.out.println(created);

        garden.getGardenDetails();
    }
}
