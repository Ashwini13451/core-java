class MaggiExecuter {

    public static void main(String[] a) {

        Maggi ref = new Maggi();

        boolean added = ref.addIngredient("Noodles");

        added = ref.addIngredient("Salt");
        System.out.println(added);

        added = ref.addIngredient("Water");
        added = ref.addIngredient("Spice Mix");
        added = ref.addIngredient("Vegetables");
        added = ref.addIngredient("Oil");
        added = ref.addIngredient("Garlic");
        added = ref.addIngredient("Onion");
        added = ref.addIngredient("Chili");
        added = ref.addIngredient("Soy Sauce");
        added = ref.addIngredient("Cheese");
        added = ref.addIngredient("Eggs");

        // extra ingredient to check full condition
        added = ref.addIngredient("Extra Ingredient");

        ref.getIngredients();
    }
}