class Sim{
int simId;
String provider;
String network;
boolean active;
long phoneNumber;

public void getSimDetails(){
System.out.println("The simId"+simId);
System.out.println("The provider"+provider);
System.out.println("The network"+network);
System.out.println("The active"+active);
System.out.println("The phoneNumber is "+phoneNumber);
}

}