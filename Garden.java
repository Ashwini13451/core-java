class Garden {
    int gardenId;
    String gardenName;
    String location;
    Flower flower;

    public void getGardenDetails() {
        System.out.println("getGardenDetails invoked");
        System.out.println("the garden id is: " + gardenId);
        System.out.println("the garden name is: " + gardenName);
        System.out.println("the garden location is: " + location);
        flower.getFlowerDetails();
        System.out.println("getGardenDetails ended");
    }

    Garden(int gardenId, String gardenName, String location, Flower flower) {
        this.gardenId = gardenId;
        this.gardenName = gardenName;
        this.location = location;
        this.flower = flower;
    }

    Garden() {

    }

    public boolean createFlower(Flower flower) {
        this.flower = flower;
        return true;
    }
}

