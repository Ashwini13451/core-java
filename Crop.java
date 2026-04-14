class Crop {
    int cropId;
    String cropName;
    String type;
    Season season;

    public void getCropDetails() {
        System.out.println("getCropDetails invoked");
        System.out.println("the crop id is: " + cropId);
        System.out.println("the crop name is: " + cropName);
        System.out.println("the crop type is: " + type);
        season.getSeasonDetails();
        System.out.println("getCropDetails ended");
    }

    Crop(int cropId, String cropName, String type, Season season) {
        this.cropId = cropId;
        this.cropName = cropName;
        this.type = type;
        this.season = season;
    }

    Crop() {

    }

    public boolean createSeason(Season season) {
        this.season = season;
        return true;
    }
}

