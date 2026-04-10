class CountryExecuter {

    public static void main(String[] a) {

        Country ref = new Country();

        boolean added = ref.addState("Karnataka");

        added = ref.addState("Tamil Nadu");
        System.out.println(added);

        added = ref.addState("Kerala");
        added = ref.addState("Maharashtra");
        added = ref.addState("Gujarat");
        added = ref.addState("Rajasthan");
        added = ref.addState("Punjab");
        added = ref.addState("Haryana");
        added = ref.addState("Bihar");
        added = ref.addState("West Bengal");
        added = ref.addState("Odisha");
        added = ref.addState("Assam");
        added = ref.addState("Telangana");
        added = ref.addState("Andhra Pradesh");
        added = ref.addState("Madhya Pradesh");
        added = ref.addState("Uttar Pradesh");
        added = ref.addState("Uttarakhand");
        added = ref.addState("Himachal Pradesh");
        added = ref.addState("Goa");
        added = ref.addState("Chhattisgarh");
        added = ref.addState("Jharkhand");
        added = ref.addState("Sikkim");
        added = ref.addState("Tripura");
        added = ref.addState("Nagaland");
        added = ref.addState("Manipur");
        added = ref.addState("Meghalaya");
        added = ref.addState("Arunachal Pradesh");
        added = ref.addState("Mizoram");

        // extra state (to check full condition)
        added = ref.addState("ExtraState");

        ref.getStates();
    }
}