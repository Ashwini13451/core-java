class PoliceStationExecuter {

    public static void main(String[] a) {

        PoliceStation ref = new PoliceStation();

        boolean added = ref.addCase("Theft Case");

        added = ref.addCase("Robbery Case");
        System.out.println(added);

        added = ref.addCase("Fraud Case");
        added = ref.addCase("Cyber Crime");
        added = ref.addCase("Accident Case");
        added = ref.addCase("Murder Case");
        added = ref.addCase("Kidnapping Case");
        added = ref.addCase("Drug Case");
        added = ref.addCase("Assault Case");
        added = ref.addCase("Missing Person");

        // extra case to check full condition
        added = ref.addCase("Extra Case");

        ref.getCases();
    }
}