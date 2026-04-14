class IceCreamTwoExecuter {
    public static void main(String[] args) {
        IceCream ice = new IceCream();
        ice.iceCreamId = 2;
        ice.brand = "Kwality Walls";
        ice.price = 70.0;

        Flavour flavour = new Flavour();
        flavour.flavourId = 102;
        flavour.flavourName = "Chocolate";
        flavour.type = "Premium";

        boolean created = ice.createFlavour(flavour);
        System.out.println(created);

        ice.getIceCreamDetails();
    }
}