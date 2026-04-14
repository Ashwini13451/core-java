class GardenThreeExecuter {
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.flowerId = 103;
        flower.name = "Sunflower";
        flower.color = "Yellow";

        Garden garden = new Garden(3, "Botanical Garden", "Mysuru", flower);
        garden.getGardenDetails();
    }
}