class Maggi {

    String ingredients[] = new String[12];
    int index;

    // create operation
    public boolean addIngredient(String ingredient) {
        boolean isIngredientAdded = false;

        if (index < ingredients.length) {

            if (ingredient != null && !ingredient.isEmpty()) {
                ingredients[index++] = ingredient;
                isIngredientAdded = true;

            } else {
                System.out.println(ingredient + " not added");
            }

        } else {
            System.out.println("Ingredients list is already full");
        }

        return isIngredientAdded;
    }

    // read operation
    public void getIngredients() {
        System.out.println("The available ingredients are:");
        for (String ingredient : ingredients)
            System.out.println(ingredient);
    }
}