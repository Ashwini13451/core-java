class CropOneExecuter {
    public static void main(String[] args) {
        Crop crop = new Crop();
        crop.cropId = 1;
        crop.cropName = "Rice";
        crop.type = "Food Crop";

        Season season = new Season();
        season.seasonId = 101;
        season.seasonName = "Kharif";
        season.duration = "June to October";

        crop.season = season;

        crop.getCropDetails();
    }
}

