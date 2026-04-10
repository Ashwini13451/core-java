class ArtistsExecuter {

    public static void main(String[] a) {

        Artists ref = new Artists();

        boolean added = ref.addSong("Shape of You");

        added = ref.addSong("Blinding Lights");
        System.out.println(added);

        added = ref.addSong("Believer");
        added = ref.addSong("Bad Guy");
        added = ref.addSong("Levitating");
        added = ref.addSong("Peaches");
        added = ref.addSong("Senorita");
        added = ref.addSong("Happier");
        added = ref.addSong("Perfect");
        added = ref.addSong("Rolling in the Deep");

        // extra song to check full condition
        added = ref.addSong("Extra Song");

        ref.getSongs();
    }
}