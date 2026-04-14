class FoodStreet {
    int foodStreetId;
    String name;
    String location;
    Stall stall;

    public void getFoodStreetDetails() {
        System.out.println("getFoodStreetDetails invoked");
        System.out.println("the food street id is: " + foodStreetId);
        System.out.println("the food street name is: " + name);
        System.out.println("the food street location is: " + location);
        stall.getStallDetails();
        System.out.println("getFoodStreetDetails ended");
    }

    FoodStreet(int foodStreetId, String name, String location, Stall stall) {
        this.foodStreetId = foodStreetId;
        this.name = name;
        this.location = location;
        this.stall = stall;
    }

    FoodStreet() {

    }

    public boolean createStall(Stall stall) {
        this.stall = stall;
        return true;
    }
}