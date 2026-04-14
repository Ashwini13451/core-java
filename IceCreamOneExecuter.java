class IceCreamOneExecuter {
    public static void main(String[] args) {
        IceCream ice = new IceCream();
        ice.iceCreamId = 1;
        ice.brand = "Amul";
        ice.price = 50.0;

        Flavour flavour = new Flavour();
        flavour.flavourId = 101;
        flavour.flavourName = "Vanilla";
        flavour.type = "Classic";

        ice.flavour = flavour;

        ice.getIceCreamDetails();
    }
}
