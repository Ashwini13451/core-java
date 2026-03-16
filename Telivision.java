class Telivision {

    static int maxVolume = 9;
    static int currentVolume = 0;
    static boolean isOn = false;

    static void switchOn() {
        isOn = true;
        System.out.println("Television Switched On");
    }

    static void switchOff() {
        isOn = false;
        System.out.println("Television Switched Off");
    }

    static void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        System.out.println("Volume: " + currentVolume);
    }

    static void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        System.out.println("Volume: " + currentVolume);
    }

    public static void main(String[] args) {

        Television.switchOn();
        Television.increaseVolume();
        Television.increaseVolume();
        Television.decreaseVolume();
        Television.switchOff();
   

   }
   
  
}
