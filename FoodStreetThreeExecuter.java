class FoodStreetThreeExecuter {
    public static void main(String[] args) {
        Stall stall = new Stall();
        stall.stallId = 103;
        stall.stallName = "Ice Cream Hub";
        stall.foodType = "Desserts";

        FoodStreet fs = new FoodStreet(3, "Jayanagar Food Street", "Bengaluru", stall);
        fs.getFoodStreetDetails();
    }
}