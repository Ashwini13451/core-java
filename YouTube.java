class YouTube {

    String videoNames[] = new String[10];
    int index;

    // create operation
    public boolean addVideo(String video) {
        boolean isVideoAdded = false;

        if (index < videoNames.length) {

            if (video != null && !video.isEmpty()) {
                videoNames[index++] = video;
                isVideoAdded = true;

            } else {
                System.out.println(video + " not added");
            }

        } else {
            System.out.println("Video list is already full");
        }

        return isVideoAdded;
    }

    // read operation
    public void getVideos() {
        System.out.println("The available videos are:");
        for (String video : videoNames)
            System.out.println(video);
    }
}