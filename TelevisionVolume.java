class TelevisionVolume {

    static boolean isOn = false;
    static int maxVolume = 10;
    static int currentVolume = 2;

    
    static void onOrOff(boolean status) {
        isOn = status;

        if (isOn) {
            System.out.println("Switch is ON");
        } else {
            System.out.println("Switch is OFF");
        }
    }

    
    static void increaseVolume() {
        if (!isOn) {
            System.out.println("Switch is OFF. Cannot increase volume.");
            return;
        }

        if (currentVolume < maxVolume) {
            currentVolume=currentVolume++;
            System.out.println("Volume increased to: " + currentVolume);
        } else {
            System.out.println("Volume is already at MAX: " + maxVolume);
        }
    }

    
    static void decreaseVolume() {
        if (!isOn) {
            System.out.println("Switch is OFF. Cannot decrease volume.");
            return;
        }

        if (currentVolume > 0) {
            currentVolume=currentVolume--;
            System.out.println("Volume decreased to: " + currentVolume);
        } else {
            System.out.println("Volume is already at MIN: 0");
        }
    }
}

