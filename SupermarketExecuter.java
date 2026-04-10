class SupermarketExecuter {

    public static void main(String[] a) {

        SuperMarket ref = new SuperMarket();

        boolean added = ref.addProduct("Rice");

        added = ref.addProduct("Wheat");
        System.out.println(added);

        added = ref.addProduct("Sugar");
        added = ref.addProduct("Salt");
        added = ref.addProduct("Oil");
        added = ref.addProduct("Milk");
        added = ref.addProduct("Bread");
        added = ref.addProduct("Eggs");

        // extra product to check full condition
        added = ref.addProduct("Butter");

        ref.getProducts();
    }
}