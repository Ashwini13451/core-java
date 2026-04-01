class Clinic{
 int clinicId;
 String clinicName;
 String clinicAddress;
 double fess;
 
 Doctor doctor;

public void getClinicDetails(){
	
System.out.println("The clinicId is" +clinicId);
System.out.println("The clinicName is "+ clinicName);	
System.out.println("The clinicAdress is "+clinicAddress);
System.out.println("The fess is "+fess);
doctor.getDoctorDetails();
}
	
	
}



