class Hospital {
    static String doctorNames[] = {
        "Dr. Rajesh Sharma", "Dr. Priya Verma", "Dr. AmitKumar",
        "Dr. Neha Patel", "Dr. Arjun Singh", "Dr. Kavita Mehta",
        "Dr. Rahul Gupta", "Dr. Sneha Reddy"
    };
     public static void getdoctorNames() {
        System.out.println("get doctor Names invoked");
        for(String doctorName : doctorNames) {
            System.out.println(doctorName);
        }
    }
}