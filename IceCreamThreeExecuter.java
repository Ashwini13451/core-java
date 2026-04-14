class IceCreamThreeExecuter {
    public static void main(String[] args) {
        Flavour flavour = new Flavour();
        flavour.flavourId = 103;
        flavour.flavourName = "Strawberry";
        flavour.type = "Fruit";

        IceCream ice = new IceCream(3, "Arun", 60.0, flavour);
        ice.getIceCreamDetails();
    }
}