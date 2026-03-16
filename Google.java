class Google{
void logIn(String userName,long phoneNumber){
System.out.println("The Google logIn with userName and phoneNumber");
System.out.println("The password is :"+ userName);
System.out.println("the phoneNumber is:"+ phoneNumber);
}

void logIn(String password,int otp){
System.out.println("The Google logIn with password and otp");
System.out.println("password is :"+password);
System.out.println("otp is "+ otp);
}

public static void main(String[] args){
 Google google=new Google();
google.logIn("Ashwini",9019922510L);
google.logIn("ashy",4539); 
  
  }





}