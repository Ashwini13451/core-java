class CropTwoExecuter {
    public static void main(String[] args) {
        Crop crop = new Crop();
        crop.cropId = 2;
        crop.cropName = "Wheat";
        crop.type = "Food Crop";

        Season season = new Season();
        season.seasonId = 102;
        season.seasonName = "Rabi";
        season.duration = "October to March";

        boolean created = crop.createSeason(season);
        System.out.println(created);

        crop.getCropDetails();
    }
}

