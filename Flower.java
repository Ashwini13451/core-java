class Flower {
    int flowerId;
    String name;
    String color;

    public void getFlowerDetails() {
        System.out.println("getFlowerDetails invoked");
        System.out.println("the flower id is: " + flowerId);
        System.out.println("the flower name is: " + name);
        System.out.println("the flower color is: " + color);
        System.out.println("getFlowerDetails ended");
    }
}

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

class GardenOneExecutor {
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

class GardenTwoExecutor {
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

class GardenThreeExecutor {
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.flowerId = 103;
        flower.name = "Sunflower";
        flower.color = "Yellow";

        Garden garden = new Garden(3, "Botanical Garden", "Mysuru", flower);
        garden.getGardenDetails();
    }
}