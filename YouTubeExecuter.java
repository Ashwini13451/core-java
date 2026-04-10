class YouTubeExecuter {

    public static void main(String[] a) {

        YouTube ref = new YouTube();

        boolean added = ref.addVideo("Java Tutorial");

        added = ref.addVideo("Python Tutorial");
        System.out.println(added);

        added = ref.addVideo("C Programming");
        added = ref.addVideo("Data Structures");
        added = ref.addVideo("Algorithms");
        added = ref.addVideo("Machine Learning");
        added = ref.addVideo("Cyber Security");
        added = ref.addVideo("Android Development");
        added = ref.addVideo("React JS Tutorial");
        added = ref.addVideo("HTML & CSS Basics");

        // extra video to check full condition
        added = ref.addVideo("Extra Video");

        ref.getVideos();
    }
}