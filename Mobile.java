class Mobile{
int mobileId;
String brand;
String model;
boolean switchOn;
Sim sim;


public void getMobileDetails(){
System.out.println("The mobileId is "+mobileId);
System.out.println("The brand is "+brand);
System.out.println("The model is "+model);
System.out.println("The switchOn"+switchOn);
sim.getSimDetails();
}

}