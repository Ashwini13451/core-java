class HeadsetExecuter{

public static void main(String[] product){
System.out.println("Main started");
String brand = Headset.getBrand();
System.out.println("The Headset brand is " + brand);

double price = Headset.getprice();
System.out.println("The Headset price  is " + price);


String colour = Headset.getColour();
System.out.println("The Headset colour  is " + colour);

boolean capability = Headset.getWebcamcapability();
System.out.println("The Webcam capability  is " + capability);

double weight = Headset.getitemweight();
System.out.println("The item weight  is " + weight);


System.out.println("Main ended");

}
}