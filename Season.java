class Season {
    int seasonId;
    String seasonName;
    String duration;

    public void getSeasonDetails() {
        System.out.println("getSeasonDetails invoked");
        System.out.println("the season id is: " + seasonId);
        System.out.println("the season name is: " + seasonName);
        System.out.println("the season duration is: " + duration);
        System.out.println("getSeasonDetails ended");
    }
}

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

class CropOneExecutor {
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

class CropTwoExecutor {
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

class CropThreeExecutor {
    public static void main(String[] args) {
        Season season = new Season();
        season.seasonId = 103;
        season.seasonName = "Zaid";
        season.duration = "March to June";

        Crop crop = new Crop(3, "Watermelon", "Fruit Crop", season);
        crop.getCropDetails();
    }
}