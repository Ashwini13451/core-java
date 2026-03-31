class Lock {
    int lockId;
    String type;
    boolean isSecure;
    String brand;
    int pin;

    public void getLockDetails() {
        System.out.println("Lock Id: " + lockId);
        System.out.println("Type: " + type);
        System.out.println("Secure: " + isSecure);
        System.out.println("Brand: " + brand);
        System.out.println("Pin: " + pin);
    }
}