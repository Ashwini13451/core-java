class WeatherThreeExecuter {
    public static void main(String[] args) {
        Climate climate = new Climate();
        climate.climateId = 103;
        climate.climateType = "Temperate";
        climate.description = "Moderate conditions";

        Weather weather = new Weather(3, "Cloudy", 22.0, climate);
        weather.getWeatherDetails();
    }
}