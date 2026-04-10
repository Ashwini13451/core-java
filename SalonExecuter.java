class SalonExecuter {

    public static void main(String[] a) {

        Salon ref = new Salon();

        boolean added = ref.addService("Haircut");

        added = ref.addService("Facial");
        System.out.println(added);

        added = ref.addService("Manicure");
        added = ref.addService("Pedicure");
        added = ref.addService("Hair Coloring");
        added = ref.addService("Massage");
        added = ref.addService("Waxing");

        // extra service to check full condition
        added = ref.addService("Extra Service");

        ref.getServices();
    }
}