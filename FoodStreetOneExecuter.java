class FoodStreetOneExecuter {
    public static void main(String[] args) {
        FoodStreet fs = new FoodStreet();
        fs.foodStreetId = 1;
        fs.name = "VV Puram Food Street";
        fs.location = "Bengaluru";

        Stall stall = new Stall();
        stall.stallId = 101;
        stall.stallName = "Dosa Corner";
        stall.foodType = "South Indian";

        fs.stall = stall;

        fs.getFoodStreetDetails();
    }
}
