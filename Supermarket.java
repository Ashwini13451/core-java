class Supermarket {

    String productNames[] = new String[8];
    int index;

    // create operation
    public boolean addProduct(String product) {
        boolean isProductAdded = false;

        if (index < productNames.length) {

            if (product != null && !product.isEmpty()) {
                productNames[index++] = product;
                isProductAdded = true;

            } else {
                System.out.println(product + " not added");
            }

        } else {
            System.out.println("Product list is already full");
        }

        return isProductAdded;
    }

    // read operation
    public void getProducts() {
        System.out.println("The available products are:");
        for (String product : productNames)
            System.out.println(product);
    }
}