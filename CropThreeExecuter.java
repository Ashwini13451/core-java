class CropThreeExecuter {
    public static void main(String[] args) {
        Season season = new Season();
        season.seasonId = 103;
        season.seasonName = "Zaid";
        season.duration = "March to June";

        Crop crop = new Crop(3, "Watermelon", "Fruit Crop", season);
        crop.getCropDetails();
    }
}