class WeatherTwoExecuter {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.weatherId = 2;
        weather.condition = "Rainy";
        weather.temperature = 25.0;

        Climate climate = new Climate();
        climate.climateId = 102;
        climate.climateType = "Monsoon";
        climate.description = "Heavy rainfall";

        boolean created = weather.createClimate(climate);
        System.out.println(created);

        weather.getWeatherDetails();
    }
}

