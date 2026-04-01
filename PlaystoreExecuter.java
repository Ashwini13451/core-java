class PlaystoreExecuter {

    public static void main(String[] args) {

        Playstore playstore = new Playstore();
        playstore.applicationID = 2;

        Application application = new Application();
        playstore.application = application;

        application.version = "2.26.11.73";
        application.updated = "20 March 2026";
        application.downloads = "10,000,000,000+ downloads";
        application.requiredOs = "Android 5.0";
        application.inAppPurchase = "25.00 - 22,200.00 per item";
        application.offeredBy = "WhatsApp LLC";
        application.releasedOn = "18 Oct 2010";

        playstore.getApplicationDetails();
    }
}