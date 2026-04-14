class Weather {
    int weatherId;
    String condition;
    double temperature;
    Climate climate;

    public void getWeatherDetails() {
        System.out.println("getWeatherDetails invoked");
        System.out.println("the weather id is: " + weatherId);
        System.out.println("the condition is: " + condition);
        System.out.println("the temperature is: " + temperature);
        climate.getClimateDetails();
        System.out.println("getWeatherDetails ended");
    }

    Weather(int weatherId, String condition, double temperature, Climate climate) {
        this.weatherId = weatherId;
        this.condition = condition;
        this.temperature = temperature;
        this.climate = climate;
    }

    Weather() {

    }

    public boolean createClimate(Climate climate) {
        this.climate = climate;
        return true;
    }
}
