class Artists {

    String songNames[] = new String[10];
    int index;

    // create operation
    public boolean addSong(String song) {
        boolean isSongAdded = false;

        if (index < songNames.length) {

            if (song != null && !song.isEmpty()) {
                songNames[index++] = song;
                isSongAdded = true;

            } else {
                System.out.println(song + " not added");
            }

        } else {
            System.out.println("Song list is already full");
        }

        return isSongAdded;
    }

    // read operation
    public void getSongs() {
        System.out.println("The available songs are:");
        for (String song : songNames)
            System.out.println(song);
    }
}