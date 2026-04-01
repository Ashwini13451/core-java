class ClinicExecuter{

public static void main(String[] args){

Clinic clinic = new Clinic();
clinic.clinicId=1;
clinic.clinicName="Ashwini clinic";
clinic.clinicAddress="Rajajinagar";

Doctor doctor = new Doctor();
clinic.doctor=doctor;
doctor.doctorId= 2;
doctor.doctorName="Ashwini patil";
doctor.doctorSpecialization="Dental";
doctor.fess=300.00;
clinic.getClinicDetails();

}

}









