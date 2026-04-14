class FoodStreetTwoExecuter {
    public static void main(String[] args) {
        FoodStreet fs = new FoodStreet();
        fs.foodStreetId = 2;
        fs.name = "Indiranagar Street Eats";
        fs.location = "Bengaluru";

        Stall stall = new Stall();
        stall.stallId = 102;
        stall.stallName = "Chaat Junction";
        stall.foodType = "North Indian";

        boolean created = fs.createStall(stall);
        System.out.println(created);

        fs.getFoodStreetDetails();
    }
}

